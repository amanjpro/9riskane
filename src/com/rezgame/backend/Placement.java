/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved. 
 */

package com.rezgame.backend;

/**
 * This class had to be created since Java does not support multiple value 
 * return or tuples. It is used to get a placement move from a player.
 * 
 * @author Amanj Sherwany and Nosheen Zaza
 */
public class Placement {
    
    private final int loc;
    private final int orbit;
    private final Color color;

    public Placement(int orbit, int loc, Color color) {
        this.loc = loc;
        this.orbit = orbit;
        this.color = color;
    }

    public int getLoc() {
        return loc;
    }

    public int getOrbit() {
        return orbit;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Placement location = (Placement) o;

        if (loc != location.loc) return false;
        if (orbit != location.orbit) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loc;
        result = 31 * result + orbit;
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "orbit = " + orbit +
                ", loc = " + loc +
                '}';
    }
}
