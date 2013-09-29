package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.LogicInterface;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class KapraPlayer extends Player {
    public KapraPlayer(Color color) {
        super(color);
    }

    @Override
    public Location getItem(LogicInterface logic) {
        return null;
    }

    @Override
    public Move moveItem(LogicInterface logic) {
        return null;
    }

    @Override
    public Location removeItem(LogicInterface logic) {
        return null;
    }
}
