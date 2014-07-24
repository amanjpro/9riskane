/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */
package com.rezgame.ui;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
import com.rezgame.backend.logic.GameStateInterface;
import com.rezgame.backend.player.Player;

/**
 * An interface that must be implemented by any basic UI. Any data that needs to 
 * be obtained from players, or needs to be shown to players should be provided
 * through this interface.
 * 
 * TODO maybe it is better to separate functionalities related to a human player 
 * and place them in another interface.
 * @author Nosheen Zaza and Amanj Sherwany.
 */
public abstract class UI {
    public abstract Color getStartingColor();
    
    /**
     * Ideally only the human player should benefit from this!
     * @return 
     */
    public abstract void showBadMoveAlert(GameStateInterface state, Move mv);
    
    //TODO perhaps also a bad placement and remove alerts?

    public abstract void showWin(GameStateInterface state);

    public abstract void showState(GameStateInterface state);
}
