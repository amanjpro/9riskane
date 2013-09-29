package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class KapraPlayer extends Player {
    public KapraPlayer(Color color) {
        super(color);
    }

    @Override
    public Location getItem(BoardInterface board) {
        return null;
    }

    @Override
    public Move moveItem(BoardInterface board) {
        return null;
    }

    @Override
    public Location removeItem(BoardInterface board) {
        return null;
    }
}
