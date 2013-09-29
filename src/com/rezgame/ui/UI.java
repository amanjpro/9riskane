package com.rezgame.ui;

import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
import com.rezgame.backend.player.Player;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public abstract class UI {
    public abstract Location getItem(Player currentPlayer);

    public abstract Move moveItem(Player currentPlayer);

    public abstract void badMoveAlert(String msg);

    public abstract Location removeItem(Player currentPlayer);

    public abstract void win(Player currentPlayer);

    public abstract void showBoard(BoardInterface board);
}
