package com.rezgame.backend.board;

import com.rezgame.backend.Location;
import com.rezgame.backend.Move;

import java.util.List;
import java.util.Map;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public interface BoardInterface {

    public List<Location> getAllEmptyCells();

    public List<Location> getAllBlackCells();

    public List<Location> getAllWhiteCells();

    public List<Move> getPossibleMoves(Location current);

    public Map<Location, List<Move>> getAllPossibleMovesForWhite();


    public Map<Location, List<Move>> getAllPossibleMovesForBlack();


    public int getNumberOfBlackCells();

    public int getNumberOfWhiteCells();

    public String prettyPrint();

}
