/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */
package com.rezgame.ui;

import com.rezgame.backend.Move;
import com.rezgame.backend.Placement;
import com.rezgame.backend.logic.GameStateInterface;

/**
 * A human player delegates input implementation to this class. This is to keep
 * UI functionality all in one package, which seems at the moment worth the extra
 * indirection.
 * @author Nosheen Zaza
 */
public interface HumanPlayerInputUI {
    public Placement getNewPlacement(GameStateInterface logic);

    public Move getMove(GameStateInterface logic);
    
    public Placement getRemoveItem(GameStateInterface logic);
}
