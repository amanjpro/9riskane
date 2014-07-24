package com.rezgame.backend.board;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;

import java.util.List;
import java.util.Map;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public interface BoardInterface {

    public List<Placement> getAllEmptyCells();

    public List<Placement> getAllBlackCells();

    public List<Placement> getAllWhiteCells();

    public List<Move> getPossibleMoves(Placement current);

    public Map<Placement, List<Move>> getAllPossibleMovesFor(Color c);

    public int getNumberOfBlackCells();

    public int getNumberOfWhiteCells();

    public String prettyPrint();

}
