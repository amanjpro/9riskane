package com.rezgame.backend.board;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */



/**
 * 1- Represent the board as a 3 * 8 matrix.
 * 2- Each row of the matrix represents an orbit.
 * 3- Movies are legal if:
 *    1- Only x, or why changes by exactly one. AND
 *    2- If x was odd, then y cannot change. AND
 *    3- The target cell is not occupied
 *
 *
 *
 * A representation of Board, the board can do/knows the following:
 * 1- How many empty, black, white cells is there.
 * 2- What is the valid moves of a cell
 * 3- Can tell if a move is valid
 * 4- place/remove/move an item
 *
 * Created by Amanj and Nosheen on 26/9/13.
 */

public class Board implements BoardInterface {

    private enum CellState {BLACK, WHITE, EMPTY};
    
    private static final int ORBITS = 3;
    private static final int ORBIT_ITEMS = 8;
    private static final Logger LOGGER = Logger.getLogger("BoardLog");
    private CellState[][] board = new CellState[ORBITS][ORBIT_ITEMS];
    
    public Board() {
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
                board[i][j] = CellState.EMPTY;
            }
        }
    }


    private CellState colorToState(Color color) {
        if(color.equals(Color.Black)) return CellState.BLACK;
        else return CellState.WHITE;
    }
    
    private Color stateToColor(CellState s) {
        if(s.equals(CellState.BLACK)) return Color.Black;
        else if(s.equals(CellState.WHITE)) return Color.White;
        else throw new RuntimeException("Cannot convert empty state to color");
    }
    
    public void setCell(Placement plc) {
        CellState cell = colorToState(plc.getColor());
        checkBounds(plc);
    // FIXME    checkEmpty(plc.getOrbit(), plc.getLoc());
        setCellState(plc.getOrbit(), plc.getLoc(), colorToState(plc.getColor()));
    }


    public void move(Move mv) {
        if(! isPossibleMove(mv)) {
            String msg = "Not a valid move, " + mv;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        setCellState(mv.getNewOrbit(), mv.getNewLocation(), colorToState(mv.getColor()));
        setCellState(mv.getOldOrbit(), mv.getOldLocation(), CellState.EMPTY);
    }

    public List<Placement> getAllEmptyCells() {
        return getAllSpecifiedCells(CellState.EMPTY);
    }

    public List<Placement> getAllBlackCells() {
        return getAllSpecifiedCells(CellState.BLACK);
    }

    public List<Placement> getAllWhiteCells() {
        return getAllSpecifiedCells(CellState.WHITE);
    }

    public List<Move> getPossibleMoves(int orbit, int location) {
        List<Move> neighbours = new LinkedList<Move>();

        // Any item can move by one step at a time
        neighbours.add(new Move(orbit, location, orbit-1, location, 
                       stateToColor(board[orbit][location])));
        
        neighbours.add(new Move(orbit, location, orbit+1, location, 
                       stateToColor(board[orbit][location])));
        
        neighbours.add(new Move(orbit, location, orbit, location-1, 
                       stateToColor(board[orbit][location])));
        
        neighbours.add(new Move(orbit, location, orbit, location+1, 
                       stateToColor(board[orbit][location])));

        List<Move> buffer = new LinkedList<Move>();
        for(Move mv : neighbours) {
            if(isPossibleMove(mv)) {
                buffer.add(mv);
            }
        }

        return buffer;
    }

    public Map<Placement, List<Move>> getAllPossibleMoves(CellState state) {
        return getAllPossibleMovesFor(state);
    }

    public void removeItem(int orbit, int loc) {
        //TODO this is ewww, but just for the moment.
        checkBounds(new Placement (orbit, loc, Color.Black));
        if(isEmpty(orbit, loc)) {
            String msg = "Location is empty: " + orbit + ", " + loc;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        setCellState(orbit, loc, CellState.EMPTY);
    }


    @Override
    public int getNumberOfBlackCells() {
        return getAllBlackCells().size();
    }

    @Override
    public int getNumberOfWhiteCells() {
        return getAllWhiteCells().size();
    }


    public boolean isPossibleMove(Move mv) {
        boolean result = isWithinBounds(mv.getNewOrbit(), mv.getNewLocation()) &&
                isWithinBounds(mv.getOldOrbit(), mv.getOldLocation()) &&
                isEmpty(mv.getNewOrbit(), mv.getNewLocation()) &&
                !isEmpty(mv.getOldOrbit(), mv.getOldLocation());
        int dOrbit = Math.abs(mv.getOldOrbit() - mv.getNewOrbit());
        int dLoc = Math.abs(mv.getOldLocation() - mv.getNewLocation()) % 6;
        result = result && (dOrbit == 1 ^ dLoc == 1);
        if(mv.getOldLocation() % 2 == 0)
            result = result && dOrbit == 0;
        return result;
    }

    
    public boolean isEmpty(int orbit, int loc) {
        return board[orbit][loc].equals(CellState.EMPTY);
    }


    public boolean isAllSet() {
        boolean flag = true;
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
               flag = flag && !board[i][j].equals(CellState.EMPTY);
            }
        }
        return flag;
    }
    
    //TODO these checks are probably not needed if I use a placement.
    public boolean isBlack(int orbit, int loc) {
        return board[orbit][loc].equals(CellState.BLACK);
    }

    public boolean isWhite(int orbit, int loc) {
        return board[orbit][loc].equals(CellState.WHITE);
    }

    public boolean isWithinBounds(int orbit, int loc) {
        return (orbit < ORBITS && orbit >= 0 && loc < ORBIT_ITEMS && loc >= 0);
    }


    private CellState getCellState(int orbit, int location) {
        return board[orbit][location];
    }

    private void setCellState(int orbit, int location, CellState c) {
        board[orbit][location] = c;
    }


    public boolean isCorner(Placement loc) {
        return (loc.getLoc() % 2 == 0);
    }


    public Placement getClockWiseAdjacent(Placement loc) {
        int x = loc.getOrbit();
        int y = loc.getLoc();
        Placement l = new Placement(x, (y + 1) % 8, loc.getColor());
        return l;
    }

    public Placement getCounterClockWiseAdjacent(Placement loc) {
        int x = loc.getOrbit();
        int y = loc.getLoc();
        Placement l = new Placement(x, (y == 0? 8 : y) - 1, loc.getColor());
        return l;
    }




    private void checkBounds(Placement loc) {
        if(loc.getOrbit() >= ORBITS || loc.getOrbit() < 0) {
            String msg = "Illegal orbit value: " + loc.getOrbit();
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        if(loc.getLoc() >= ORBIT_ITEMS || loc.getLoc() < 0) {
            String msg = "Illegal location value: " + loc;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }
    }


    private List<Placement> getAllSpecifiedCells(CellState c) {
        List<Placement> buffer = new LinkedList<Placement>();
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
                if(c.equals(board[i][j])) {
                    buffer.add(new Placement(i, j, stateToColor(c)));
                }
            }
        }
        return buffer;
    }



    private Map<Placement, List<Move>> getAllPossibleMovesFor(CellState c) {
        if(c.equals(CellState.EMPTY)) {
            String msg = "There is no move for Empty cells";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        List<Placement> items = getAllSpecifiedCells(c);
        Map<Placement, List<Move>> buffer = new HashMap<Placement, List<Move>>();

        for(Placement item : items) {
            List<Move> mvs = getPossibleMoves(item.getOrbit(), item.getLoc());
            if(!mvs.isEmpty()) {
                buffer.put(item, mvs);
            }
        }

        return buffer;
    }

    public List<Placement> filterValid(List<Placement> locs) {
        List<Placement> valid = new LinkedList<Placement>();
        for(Placement loc : locs) {
            if(isWithinBounds(loc.getOrbit(), loc.getLoc())) {
                valid.add(loc);
            }
        }

        return valid;
    }
    /*
    00
    row1 -
    01
    row1 -
    02

    ========
    |
    10
    row2 -
    11
    row2 -
    12
    |
    ========
    |
    20
    row3 -
    21
    row3 -
    22
    |
    ========
    0----------0----------0
    | 0--------0--------0 |
    | | 0------0------0 | |
    | | |             | | |
    0 0 0      o      0 0 0
    | | |             | | |
    | | 0------0------0 | |
    | 0--------0--------0 |
    x----------x----------x
     */
    public String prettyPrint() {
        // Each row has a different length of separators between each two locations.
        // A separator in the outer orbit is longer than the inner one by two `-`
        String[] rows = {repeatChar('-', 10), repeatChar('-', 8), repeatChar('-', 6)};

        // There are two kinds of spaces
        String longSpaces = repeatChar(' ', (rows[1].length() * 2) - 3);
        String shortSpaces = repeatChar(' ', rows[2].length() - 1);
        String empty = "| | |" + longSpaces + "| | |\n";
        StringBuilder str = new StringBuilder();

        // Generate the string for the first three items of each orbit
        for(int i = 0; i < ORBITS; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < 3; j++) {
                sb.append(cellToChar(board[i][j]));
                if(j != 2) sb.append(rows[i]);
            }
            if(i == 1) {
                sb.insert(0, "| ");
                sb.append(" |\n");
            } else if (i == 2) {
                sb.insert(0, "| | ");
                sb.append(" | |\n");
            } else {
                sb.append("\n");
            }
            str.append(sb);
        }
        str.append(empty);




        // Generate items number 8 of each orbit
        for(int i = 0; i < ORBITS; i++) {
            str.append(cellToChar(board[i][7]));
            str.append(' ');
        }
        str.append(shortSpaces + 'o' + shortSpaces);

        // Generate items number 4 of each orbit
        for(int i = ORBITS - 1; i >= 0; i--) {
            str.append(' ');
            str.append(cellToChar(board[i][3]));
        }
        str.append('\n');
        str.append(empty);

        // Generate the string for the items number 7, 6, 5 of each orbit
        for(int i = ORBITS - 1; i >= 0 ; i--) {
            StringBuilder sb = new StringBuilder();
            for(int j = 6; j >= 4; j--) {
                sb.append(cellToChar(board[i][j]));
                if(j != 4) sb.append(rows[i]);
            }
            if(i == 1) {
                sb.insert(0, "| ");
                sb.append(" |\n");
            } else if (i == 2) {
                sb.insert(0, "| | ");
                sb.append(" | |\n");
            } else {
                sb.append("\n");
            }
            str.append(sb);
        }
        return str.toString();
    }

    private char cellToChar(CellState c) {
        if(c.equals(CellState.EMPTY)) return '0';
        else if(c.equals(CellState.EMPTY)) return 'Y';
        else return 'X';
    }
    private String repeatChar(char ch, int times) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < times; i++){
            sb.append(ch);
        }
        return sb.toString();
    }
}




