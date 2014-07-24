/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 */
package com.rezgame.backend;

/**
 * This class had to be created since Java does not support multiple value 
 * return or tuples. It is used to get a relocation move from a player.
 * 
 * @author Amanj Sherwany and Nosheen Zaza
 */
public class Move {
    
    private final int oldLocation, oldOrbit;
    private final int newLocation, newOrbit;
    private final Color color ;
    
    public Move(int oldLocation, int oldOrbit, int newLocation, int newOrbit, Color color ) {
        this.oldLocation = oldLocation;
        this.oldOrbit = oldOrbit;
        this.newLocation = newLocation;
        this.newOrbit = newOrbit;
        this.color = color;
    }

//TODO implement these correctly later, if needed.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Move move = (Move) o;
//
//        if (!from.equals(move.from)) return false;
//        if (!to.equals(move.to)) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = from.hashCode();
//        result = 31 * result + to.hashCode();
//        return result;
//    }
    public int getOldLocation() {
        return oldLocation;
    }

    public int getOldOrbit() {
        return oldOrbit;
    }

    public int getNewLocation() {
        return newLocation;
    }

    public int getNewOrbit() {
        return newOrbit;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Move{" +
                "from = " + oldLocation + " " + oldOrbit +
                ", to = " + newLocation + " " + newOrbit +
                "} of color " + color;
    }
}
