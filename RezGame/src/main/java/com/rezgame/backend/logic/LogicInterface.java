package com.rezgame.backend.logic;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;

import java.util.LinkedList;
import java.util.List;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public interface LogicInterface {
    public boolean canPutItem(Location loc);


    public boolean canRemove(Location loc);



    public boolean isRez(Color color, Location loc);



    public boolean canMove(Move mv);


    public BoardInterface getBoard();

    public Color getOpponent();

    public Color currentPlayer();
}
