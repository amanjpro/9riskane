package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;

import java.util.Random;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class RandomPlayer extends Player {
    public RandomPlayer(String name, Color color) {
        super(color);
        this.name = name;
    }

    @Override
    public Location getItem(BoardInterface board) {
        Location loc = nextRandomLocation();
        System.out.println("Random puts: " + nextRandomLocation());
        return loc;
    }

    @Override
    public Move moveItem(BoardInterface board) {
        Move mv;
        Location loc = nextRandomLocation();
        int n1 = rand.nextInt();
        int n2 = rand.nextInt();
        if(n1 % 2 == 0 || n1 % 2 == 0)
            mv = new Move(loc, new Location(loc.getOrbit()-1, loc.getLoc()));
        else if(n1 % 2 == 0 || n1 % 2 == 1)
            mv = new Move(loc, new Location(loc.getOrbit()+1, loc.getLoc()));
        else if(n1 % 2 == 1 || n1 % 2 == 0)
            mv = new Move(loc, new Location(loc.getOrbit(), loc.getLoc()+1));
        else
            mv = new Move(loc, new Location(loc.getOrbit(), loc.getLoc()-1));
        System.out.println("Random does: " + mv);
        return mv;
    }

    @Override
    public Location removeItem(BoardInterface board) {
        Location loc = nextRandomLocation();
        System.out.println("Random removes: " + nextRandomLocation());
        return nextRandomLocation();
    }

    public String toString() {
        return "Player " + name;
    }

    private Location nextRandomLocation() {
        return new Location(rand.nextInt(3), rand.nextInt(8));
    }



    private String name;
    private Random rand = new Random();
}
