/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */
package com.rezgame.backend.logic;

import com.rezgame.backend.board.Board;
import com.rezgame.backend.player.Player;

/**
 * UIs used to show game state consult this object to display any desired 
 * state information. Any information that should be made available to players
 * should be obtainable through this interface. Do not inquire other components!
 * @author Nosheen Zaza.
 */

public class GameStateInterface {
    //TODO there is a problem here of who is allowed to call the setter of 
    // currentPlayer. I will consider a more functional style perhaps.
    private Player currentPlayer;
    private Board  currentBoard;

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }
    
    public String prettyPrint() {
        return currentBoard.prettyPrint();
    }
    
    // TODO probably add latest move
}
