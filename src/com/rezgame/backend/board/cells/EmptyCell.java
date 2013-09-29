package com.rezgame.backend.board.cells;

import com.rezgame.backend.Color;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class EmptyCell extends Cell {
    private static EmptyCell self = new EmptyCell();

    private EmptyCell() {

    }

    public boolean isBlack() {
        return false;
    }

    public boolean isWhite() {
        return false;
    }

    public static EmptyCell getCell() {
        return self;
    }

    public boolean isEmpty() {
        return true;
    }

    public Color getColor() {
        throw new RuntimeException("You cannot call getColor() for empty cells.");
    }

}

