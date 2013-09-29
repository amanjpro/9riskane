package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.LogicInterface;

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
    public Location getItem(LogicInterface logic) {
        Location loc = nextRandomLocation();
        if(!logic.canPutItem(loc)) {
            return getItem(logic);
        } else {
            System.out.println("Random puts: " + loc);
            return loc;
        }
    }

    @Override
    public Move moveItem(LogicInterface logic) {
        Move mv;
        Location loc = nextRandomLocation();
        int n1 = rand.nextInt();
        int n2 = rand.nextInt();
        if(n1 % 2 == 0 || n2 % 2 == 0)
            mv = new Move(loc, new Location(loc.getOrbit()-1, loc.getLoc()));
        else if(n1 % 2 == 0 || n2 % 2 == 1)
            mv = new Move(loc, new Location(loc.getOrbit()+1, loc.getLoc()));
        else if(n1 % 2 == 1 || n2 % 2 == 0)
            mv = new Move(loc, new Location(loc.getOrbit(), loc.getLoc()+1));
        else
            mv = new Move(loc, new Location(loc.getOrbit(), loc.getLoc()-1));

        if(!logic.canMove(mv)) {
            return moveItem(logic);
        } else {
            System.out.println("Random does: " + mv);
            return mv;
        }
    }

    @Override
    public Location removeItem(LogicInterface logic) {
        Location loc = nextRandomLocation();

        if(!logic.canRemove(loc)){
            return removeItem(logic);
        }
        else {
            System.out.println("Random removes: " + loc);
            return loc;
        }
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
