package com.rezgame.backend;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class Move {
    public Move(Location from, Location to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Move move = (Move) o;

        if (!from.equals(move.from)) return false;
        if (!to.equals(move.to)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }


    @Override
    public String toString() {
        return "Move{" +
                "from = " + from +
                ", to = " + to +
                '}';
    }

    private final Location from, to;
}
