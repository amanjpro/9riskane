package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.GameStateInterface;
import com.rezgame.backend.logic.LogicInterface;
import com.rezgame.ui.HumanPlayerInputUI;
import com.rezgame.ui.UI;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class HumanPlayer extends Player {
    private String name;
    private HumanPlayerInputUI ui;
    
    public HumanPlayer(String name, HumanPlayerInputUI ui, Color color) {
        super(color);
        this.ui = ui;
        this.name = name;
    }


    @Override
    public Placement getNewPlacement(GameStateInterface state) {
        return ui.getNewPlacement(state);
    }

    @Override
    public Move getMove(GameStateInterface state) {
        return ui.getMove(state);
    }
    
    @Override
    public Placement getRemoveItem(GameStateInterface state) {
        return ui.getRemoveItem(state);
    }

    @Override
    public String toString() {
        return "Player " + name;
    }
}
