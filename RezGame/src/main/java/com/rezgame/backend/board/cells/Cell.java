package com.rezgame.backend.board.cells;

import com.rezgame.backend.Color;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public abstract class Cell {
    public abstract Color getColor();

    public abstract boolean isBlack();

    public abstract boolean isWhite();

    public abstract boolean isEmpty();

    public static Cell getCell() {
       throw new RuntimeException("Not implemented yet");
    }
}