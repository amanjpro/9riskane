package com.rezgame.backend.board;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.cells.BlackCell;
import com.rezgame.backend.board.cells.Cell;
import com.rezgame.backend.board.cells.EmptyCell;
import com.rezgame.backend.board.cells.WhiteCell;

import java.util.logging.Logger;
import java.util.*;

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
//    private static final Board self = new Board();

//    /*

    /*
        TODO: Do we need a singleton board or not?
     */
    public Board() {
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
                board[i][j] = EmptyCell.getCell();
            }
        }
    }
//     * TODO: Lets think about this
//     */
//    public Board initBoard() {
//        return self;
//    }


    public void placeItem(Location loc, Color color) {
        Cell cell = (color == Color.Black)? BlackCell.getCell() : WhiteCell.getCell();

        checkBounds(loc);

        checkEmpty(loc);

        setCellState(loc, cell);
    }


    public void move(Move mv) {
        if(! isPossibleMove(mv)) {
            String msg = "Not a valid move, " + mv;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        setCellState(mv.getTo(), getCellState(mv.getFrom()));
        setCellState(mv.getFrom(), EmptyCell.getCell());
    }

    public List<Location> getAllEmptyCells() {
        return getAllSpecifiedCells(EmptyCell.getCell());
    }

    public List<Location> getAllBlackCells() {
        return getAllSpecifiedCells(BlackCell.getCell());
    }

    public List<Location> getAllWhiteCells() {
        return getAllSpecifiedCells(WhiteCell.getCell());
    }

    public List<Move> getPossibleMoves(Location current) {
        List<Move> neighbours = new LinkedList<Move>();

        // Any item can move by one step at a time
        neighbours.add(new Move(current, new Location(current.getOrbit()-1, current.getLoc())));
        neighbours.add(new Move(current, new Location(current.getOrbit()+1, current.getLoc())));
        neighbours.add(new Move(current, new Location(current.getOrbit(), current.getLoc()-1)));
        neighbours.add(new Move(current, new Location(current.getOrbit(), current.getLoc()+1)));

        List<Move> buffer = new LinkedList<Move>();
        for(Move mv : neighbours) {
            if(isPossibleMove(mv)) {
                buffer.add(mv);
            }
        }

        return buffer;
    }

    public Map<Location, List<Move>> getAllPossibleMovesForWhite() {
        return getAllPossibleMovesFor(WhiteCell.getCell());
    }


    public Map<Location, List<Move>> getAllPossibleMovesForBlack() {
        return getAllPossibleMovesFor(BlackCell.getCell());
    }




    public void removeItem(Location loc) {
        checkBounds(loc);
        if(isEmpty(loc)) {
            String msg = "Location is empty, " + loc;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        setCellState(loc, EmptyCell.getCell());
    }


    public int getNumberOfBlackCells() {
        return getAllBlackCells().size();
    }

    public int getNumberOfWhiteCells() {
        return getAllWhiteCells().size();
    }


    public boolean isPossibleMove(Move mv) {
        boolean result = isWithinBounds(mv.getTo()) &&
                isWithinBounds(mv.getFrom()) &&
                isEmpty(mv.getTo()) &&
                !isEmpty(mv.getFrom());
        int dOrbit = Math.abs(mv.getFrom().getOrbit() - mv.getTo().getOrbit());
        int dLoc = Math.abs(mv.getFrom().getLoc() - mv.getTo().getLoc()) % 6;
        result = result && (dOrbit == 1 ^ dLoc == 1);
        if(mv.getFrom().getLoc() % 2 == 0)
            result = result && dOrbit == 0;
        return result;
    }

    public boolean isEmpty(Location loc) {
        return board[loc.getOrbit()][loc.getLoc()].isEmpty();
    }


    public boolean isAllSet() {
        boolean flag = true;
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
               flag = flag && !board[i][j].isEmpty();
            }
        }
        return flag;
    }
    public boolean isBlack(Location loc) {
        return board[loc.getOrbit()][loc.getLoc()].isBlack();
    }

    public boolean isWhite(Location loc) {
        return board[loc.getOrbit()][loc.getLoc()].isWhite();
    }

    public boolean isWithinBounds(Location loc) {
        return (loc.getOrbit() < ORBITS && loc.getOrbit() >= 0) && (loc.getLoc() < ORBIT_ITEMS && loc.getLoc() >= 0);
    }


    private Cell getCellState(Location loc) {
        return board[loc.getOrbit()][loc.getLoc()];
    }

    private void setCellState(Location loc, Cell c) {
        board[loc.getOrbit()][loc.getLoc()] = c;
    }
    private void checkEmpty(Location loc) {
        if(!isEmpty(loc)) {
            String msg = "Location is not empty, " + loc;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }
    }


    public boolean isCorner(Location loc) {
        return (loc.getLoc() % 2 == 0);
    }


    public Location getClockWiseAdjacent(Location loc) {
        int x = loc.getOrbit();
        int y = loc.getLoc();
        Location l = new Location(x, (y + 1) % 8);
        return l;
    }

    public Location getCounterClockWiseAdjacent(Location loc) {
        int x = loc.getOrbit();
        int y = loc.getLoc();
        Location l = new Location(x, (y == 0? 8 : y) - 1);
        return l;
    }




    private void checkBounds(Location loc) {
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


    private List<Location> getAllSpecifiedCells(Cell c) {
        List<Location> buffer = new LinkedList<Location>();
        for(int i = 0; i < ORBITS; i++) {
            for(int j = 0; j < ORBIT_ITEMS; j++) {
                if((board[i][j] instanceof BlackCell || board[i][j] instanceof WhiteCell) &&
                        board[i][j].getColor() == c.getColor()) {
                    buffer.add(new Location(i, j));
                }
            }
        }

        return buffer;
    }



    private Map<Location, List<Move>> getAllPossibleMovesFor(Cell c) {
        if(c.isEmpty()) {
            String msg = "There is no move for Empty cells";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        List<Location> items = getAllSpecifiedCells(c);
        Map<Location, List<Move>> buffer = new HashMap<Location, List<Move>>();

        for(Location item : items) {
            List<Move> mvs = getPossibleMoves(item);
            if(!mvs.isEmpty()) {
                buffer.put(item, mvs);
            }
        }

        return buffer;
    }

    public List<Location> filterValid(List<Location> locs) {
        List<Location> valid = new LinkedList<Location>();
        for(Location loc : locs) {
            if(isWithinBounds(loc)) {
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

    private char cellToChar(Cell c) {
        if(c.isEmpty()) return '0';
        else if(c.isBlack()) return 'Y';
        else return 'X';
    }
    private String repeatChar(char ch, int times) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < times; i++){
            sb.append(ch);
        }
        return sb.toString();
    }

    private static final int ORBITS = 3;
    private static final int ORBIT_ITEMS = 8;
    private static final Logger LOGGER = Logger.getLogger("BoardLog");
    private Cell[][] board = new Cell[ORBITS][ORBIT_ITEMS];
}




