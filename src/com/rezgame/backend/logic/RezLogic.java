/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */
package com.rezgame.backend.logic;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.Board;
import com.rezgame.backend.board.BoardInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;


public class RezLogic implements LogicInterface {



    RezLogic(int items, Color starter) {
        ITEM_NUMBER = items;
        currentPlayer = starter;
    }

    public boolean canPutItem(Placement loc) {
        return board.isWithinBounds(loc) && isInitMode() && board.isEmpty(loc);
    }

    public boolean isInitMode() {
        return (numberOfPuts < 2 * ITEM_NUMBER);
    }

    void put(Placement loc) {
        if(!canPutItem(loc)) {
            String msg = "Player " + currentPlayer + " cannot put item in location " +
                    loc + " when the mode is " + (isInitMode() ? "":"not") + " initMode";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        board.placeItem(loc, currentPlayer);

        numberOfPuts++;

    }


    void remove(Placement loc) {
        boolean isRightColor = currentPlayer == Color.White? board.isBlack(loc) : board.isWhite(loc);

        if(isRightColor && !canRemove(loc)) {
            String msg = "Player " + currentPlayer + " cannot remove item in location " +
                    loc + " when the mode is " + (isInitMode() ? "":"not") + " initMode";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        board.removeItem(loc);

        // TODO Use get opponent maybe?
        if(currentPlayer == Color.White) blacksRemoved++;
        else whitesRemoved++;
    }
    public boolean canRemove(Placement loc) {
        return board.isWithinBounds(loc) && !board.isEmpty(loc) && !isRez(getOpponent(), loc);
    }


    public boolean isWinning() {
        System.out.println("blacksRemoved " + blacksRemoved + "  whitesRemoved " + whitesRemoved);
        System.out.println("currentPlayer " + currentPlayer);

        if(currentPlayer == Color.White) {
            return blacksRemoved == ITEM_NUMBER - 2 && ITEM_NUMBER - whitesRemoved >  2;
        } else {
            return whitesRemoved == ITEM_NUMBER - 2 && ITEM_NUMBER - blacksRemoved > 2;
        }
    }

    public boolean isRez(Color color, Placement loc) {
        boolean rowRez = checkRowNeighbours(color, loc);
        List<Placement> cols = getColumnNeighbours(loc);

        System.out.println(cols);
        return rowRez || allSameColor(color, cols);
    }


    private boolean allSameColor(Color color, List<Placement> locs){
        boolean flag = true;
        if(locs.isEmpty())
            return false;
        if(color == Color.White) {
            for(Placement loc : locs) {
                flag = flag && board.isWhite(loc);
            }
        } else {
            for(Placement loc : locs) {
                flag = flag && board.isBlack(loc);
            }
        }
        return flag;
    }


    private boolean checkRowNeighbours(Color color, Placement loc) {
        if(board.isCorner(loc)) {
            Placement m1 = board.getCounterClockWiseAdjacent(loc);
            Placement m2 = board.getCounterClockWiseAdjacent(m1);

            Placement p1 = board.getClockWiseAdjacent(loc);
            Placement p2 = board.getClockWiseAdjacent(p1);

            List<Placement> ms = new LinkedList<Placement>();
            ms.add(loc);
            ms.add(m1);
            ms.add(m2);
            List<Placement> ps = new LinkedList<Placement>();
            ps.add(loc);
            ps.add(p1);
            ps.add(p2);

            return (allSameColor(color, ms) || allSameColor(color, ps));
        } else {
            Placement m1 = board.getCounterClockWiseAdjacent(loc);
            Placement p1 = board.getClockWiseAdjacent(loc);

            List<Placement> adjs = new LinkedList<Placement>();
            adjs.add(loc);
            adjs.add(p1);
            adjs.add(m1);

            return allSameColor(color, adjs);
        }
    }


    private List<Placement> getColumnNeighbours(Placement loc) {
        List<Placement> cols = new LinkedList<Placement>();
        if(loc.getLoc() % 2 !=0) {
            for(int i = -2; i <= 2; i++) {
                cols.add(new Placement(loc.getOrbit() - i, loc.getLoc()));
            }
        }
        return board.filterValid(cols);
    }

    public boolean canMove(Move mv) {
        if(!(board.isWithinBounds(mv.getFrom()) && board.isWithinBounds(mv.getTo())))
            return false;
        boolean rightItem = (currentPlayer == Color.Black)? board.isBlack(mv.getFrom()) : board.isWhite(mv.getFrom());
        return board.isPossibleMove(mv) &&
                !isInitMode() && rightItem && board.isEmpty(mv.getTo());
    }

    void move(Move mv) {
        if(!canMove(mv)) {
            String msg = "Player " + currentPlayer + " cannot move from " + mv +
                        " when the mode is " + (isInitMode() ? "" : "not") + "initMode";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        board.move(mv);
    }


    public BoardInterface getBoard() {
        return board;
    }

    public Color getOpponent() {
        if(currentPlayer == Color.White)
            return Color.Black;
        else
            return Color.White;
    }

    public Color currentPlayer() {
        return currentPlayer;
    }

    void changePlayer() {
        if(currentPlayer == Color.Black) currentPlayer = Color.White;
        else currentPlayer = Color.Black;
    }

    private final static Logger LOGGER = Logger.getLogger("GameLogicLog");
    private int numberOfPuts;
    private Color currentPlayer;
    private final int ITEM_NUMBER;
    private Board board = new Board();


    private int blacksRemoved = 0;
    private int whitesRemoved = 0;

    // TODO: Do we need this?
    private List<Placement> black = new LinkedList<Placement>();
    private List<Placement> white = new LinkedList<Placement>();
}


