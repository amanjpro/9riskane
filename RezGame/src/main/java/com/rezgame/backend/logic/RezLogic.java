package com.rezgame.backend.logic;

import com.rezgame.backend.board.*;
import com.rezgame.backend.*;
import java.util.*;
import java.util.logging.Logger;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class RezLogic {



    public RezLogic(int items, Color starter) {
        ITEM_NUMBER = items;
        currentPlayer = starter;
    }

    public boolean canPutItem(Location loc) {
        return board.isWithinBounds(loc) && isInitMode() && board.isEmpty(loc);
    }

    public boolean isInitMode() {
        return (numberOfPuts < 2 * ITEM_NUMBER);
    }

    public void put(Location loc) {
        if(!canPutItem(loc)) {
            String msg = "Player " + currentPlayer + " cannot put item in location " +
                    loc + " when the mode is " + (isInitMode() ? "":"not") + " initMode";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        board.placeItem(loc, currentPlayer);

        numberOfPuts++;

    }


    public void remove(Location loc) {
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
    public boolean canRemove(Location loc) {
        return board.isWithinBounds(loc) && !board.isEmpty(loc) && !isRez(getOpponent(), loc);
    }


    public boolean isWinning() {
        if(currentPlayer == Color.White) {
            return blacksRemoved == ITEM_NUMBER - 2 && whitesRemoved > ITEM_NUMBER - 2;
        } else {
            return whitesRemoved == ITEM_NUMBER - 2 && blacksRemoved > ITEM_NUMBER - 2;
        }
    }

    public boolean isRez(Color color, Location loc) {
        boolean rowRez = checkRowNeighbours(color, loc);
        List<Location> cols = getColumnNeighbours(loc);

        System.out.println(cols);
        return rowRez || allSameColor(color, cols);
    }


    private boolean allSameColor(Color color, List<Location> locs){
        boolean flag = true;
        if(locs.isEmpty())
            return false;
        if(currentPlayer == Color.White) {
            for(Location loc : locs) {
                flag = flag && board.isWhite(loc);
            }
        } else {
            for(Location loc : locs) {
                flag = flag && board.isBlack(loc);
            }
        }
        return flag;
    }


    private boolean checkRowNeighbours(Color color, Location loc) {
        if(board.isCorner(loc)) {
            Location m1 = board.getCounterClockWiseAdjacent(loc);
            Location m2 = board.getCounterClockWiseAdjacent(m1);

            Location p1 = board.getClockWiseAdjacent(loc);
            Location p2 = board.getClockWiseAdjacent(p1);

            List<Location> ms = new LinkedList<Location>();
            ms.add(loc);
            ms.add(m1);
            ms.add(m2);
            List<Location> ps = new LinkedList<Location>();
            ps.add(loc);
            ps.add(p1);
            ps.add(p2);

            return (allSameColor(color, ms) || allSameColor(color, ps));
        } else {
            Location m1 = board.getCounterClockWiseAdjacent(loc);
            Location p1 = board.getClockWiseAdjacent(loc);

            List<Location> adjs = new LinkedList<Location>();
            adjs.add(loc);
            adjs.add(p1);
            adjs.add(m1);

            return allSameColor(color, adjs);
        }
    }


    private List<Location> getColumnNeighbours(Location loc) {
        List<Location> cols = new LinkedList<Location>();
        if(loc.getLoc() % 2 !=0) {
            for(int i = -2; i <= 2; i++) {
                cols.add(new Location(loc.getOrbit() - i, loc.getLoc()));
            }
        }
        return board.filterValid(cols);
    }

    public boolean canMove(Move mv) {
        boolean rightItem = (board.isWithinBounds(mv.getFrom()) && currentPlayer == Color.Black)?board.isBlack(mv.getFrom()) : board.isWhite(mv.getFrom());
        return board.isPossibleMove(mv) &&
                board.isWithinBounds(mv.getFrom()) && board.isWithinBounds(mv.getTo())
                    && !isInitMode() && rightItem && board.isEmpty(mv.getTo());
    }

    public void move(Move mv) {
        if(!canMove(mv)) {
            String msg = "Player " + currentPlayer + " cannot move from " + mv +
                        " when the mode is " + (isInitMode() ? "" : "not") + "initMode";
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }

        board.move(mv);
    }


    public Board getBoard() {
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

    public void changePlayer() {
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
    private List<Location> black = new LinkedList<Location>();
    private List<Location> white = new LinkedList<Location>();
}


