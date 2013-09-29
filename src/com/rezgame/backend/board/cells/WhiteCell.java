package com.rezgame.backend.board.cells;

import com.rezgame.backend.Color;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class WhiteCell extends Cell {
    private final Color color = Color.White;

    private static final WhiteCell self = new WhiteCell();

    private WhiteCell() {}

    public boolean isBlack() {
        return false;
    }

    public boolean isWhite() {
        return true;
    }

    public static WhiteCell getCell() {
        return self;
    }
    public Color getColor() {
        return color;
    }

    public boolean isEmpty() {
        return false;
    }
}