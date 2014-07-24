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

public abstract class Player {
    protected Color color;
    
    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
 
    /**
     * 
     * @param state this is indeed needed for both human and ai players. It 
     * might not seem intuitive that hte human player needs the state, but,
     * for example, if we need to highlight cells with valid moves, the state is 
     * needed, wether the player itself highlights them or delegates this task 
     * to anotehr UI object. I like to think of the human player as as ui input
     * player; then things make more sense.
     * @return 
     */
    public abstract Placement getNewPlacement(GameStateInterface state);

    public abstract Move getMove(GameStateInterface state);

    public abstract Placement getRemoveItem(GameStateInterface state);
}
