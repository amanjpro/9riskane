package com.rezgame.backend.logic;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public interface LogicInterface {
    public boolean canPutItem(Placement loc);


    public boolean canRemove(Placement loc);


    public boolean isRez(Color color, Placement loc);



    public boolean canMove(Move mv);


    public BoardInterface getBoard();

    public Color getOpponent();

    public Color currentPlayer();
}
