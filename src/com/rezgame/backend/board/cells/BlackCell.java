package com.rezgame.backend.board.cells;

import com.rezgame.backend.Color;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class BlackCell extends Cell {
    private final Color color = Color.Black;

    private static final BlackCell self = new BlackCell();

    private BlackCell() {}


    public boolean isBlack() {
        return true;
    }

    public boolean isWhite() {
        return false;
    }


    public static BlackCell getCell() {
        return self;
    }
    public Color getColor() {
        return color;
    }

    public boolean isEmpty() {
        return false;
    }
}