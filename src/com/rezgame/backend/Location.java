package com.rezgame.backend;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class Location {

    public Location(int orbit, int loc) {
        this.loc = loc;
        this.orbit = orbit;
    }

    public int getLoc() {
        return loc;
    }

    public int getOrbit() {
        return orbit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

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

    private final int loc, orbit;
}
