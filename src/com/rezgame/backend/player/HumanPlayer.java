package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.LogicInterface;
import com.rezgame.ui.UI;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class HumanPlayer extends Player {
    public HumanPlayer(String name, UI ui, Color color) {
        super(color);
        this.ui = ui;
        this.name = name;
    }

    @Override
    public Location removeItem(LogicInterface logic) {
        return ui.removeItem(this);
    }

    @Override
    public Location getItem(LogicInterface logic) {
        return ui.getItem(this);
    }

    @Override
    public Move moveItem(LogicInterface logic) {
        return ui.moveItem(this);
    }

    @Override
    public String toString() {
        return "Player " + name;
    }
    private String name;
    private UI ui;
}
