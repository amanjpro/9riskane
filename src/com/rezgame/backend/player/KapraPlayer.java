/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */

package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.GameStateInterface;
import com.rezgame.backend.logic.LogicInterface;

public class KapraPlayer extends Player {
    public KapraPlayer(Color color) {
        super(color);
    }

    @Override
    public Placement getNewPlacement(GameStateInterface state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Move getMove(GameStateInterface state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Placement getRemoveItem(GameStateInterface state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
