package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
import com.rezgame.backend.logic.LogicInterface;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public abstract class Player {
    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    /**
     * FIXME
     * We don't like this design, that the getItem receives a board as part of the message,
     * which should only be used by AI players (like KapraPlayer). But for the sake of generality
     * we went that rout. Do you know a better way to solve this? Share it with us please.
     *
     */
    public abstract Location getItem(LogicInterface logic);

    public abstract Move moveItem(LogicInterface logic);

    public abstract Location removeItem(LogicInterface logic);

    protected Color color;
}
