package com.rezgame.ui;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
import com.rezgame.backend.logic.GameStateInterface;
import com.rezgame.backend.logic.RezSessionController;
import com.rezgame.backend.player.HumanPlayer;
import com.rezgame.backend.player.Player;
import com.rezgame.backend.player.RandomPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class ConsoleUI extends UI implements HumanPlayerInputUI{

    @Override
    public Placement getNewPlacement(GameStateInterface state) {
        System.out.println(state.getCurrentPlayer() + ", please enter a location to put an item: ");
        int x = readInt();
        int y = readInt();
        return new Placement(x, y, state.getCurrentPlayer().getColor());
    }

    @Override
    public Move getMove(GameStateInterface state) {
        System.out.println(state.getCurrentPlayer() + ", please enter the next move: ");
        int x1 = readInt();
        int y1 = readInt();
        int x2 = readInt();
        int y2 = readInt();
        return new Move(x1, y1,x2, y2, state.getCurrentPlayer().getColor());
    }

    @Override
    public void showBadMoveAlert(GameStateInterface state, Move mv) {
        String msg = "Player " + state.getCurrentPlayer() + " cannot perform move: " + mv;
        LOGGER.fine(msg);
        System.out.println(msg);
    }

    @Override
    public Placement getRemoveItem(GameStateInterface state) {
        System.out.println(state.getCurrentPlayer() + ", please enter the item to remove: ");
        int x = readInt();
        int y = readInt();
        return new Placement(x, y, state.getCurrentPlayer().getColor());
    }

    @Override
    public void showWin(GameStateInterface state) {
        System.out.println("Complimenti " + state.getCurrentPlayer() + "! Lo vinci!");
        System.out.println("Do you want to play again? (yes|no): ");
        if(readLine().equalsIgnoreCase("yes")) {
            init();
        } else {
            System.out.println("Era fantastica giocare con te! Buona notte.");
        }
    }

    @Override
    public void showState(GameStateInterface state) {
        System.out.println(state.prettyPrint());
    }

    public String readLine() {
        try {
            return input.readLine();
        } catch (IOException ioex) {
            LOGGER.severe("An io exception was thrown " + ioex);
            return readLine();
        }
    }

    public int readInt() {
        try {
            return Integer.parseInt(readLine());
        } catch (NumberFormatException nfex) {
            LOGGER.fine("Bad number format " + nfex);
            return readInt();
        }
    }


    public void init() {
//        Player p1 = new HumanPlayer("Amanj", this, Color.White);
//        Player p2 = new HumanPlayer("Nosheen", this, Color.Black);

        Player p1 = new RandomPlayer("Amanj", Color.White);
        Player p2 = new RandomPlayer("Nosheen", Color.Black);

        RezSessionController session = new RezSessionController(this, p1, p2);
        session.start();
    }

    public static void main(String... args) {
        new ConsoleUI().init();
    }


    private Logger LOGGER = Logger.getLogger("ConsoleUILogger");
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public Color getStartingColor() {
        throw new UnsupportedOperationException("Not supported yet getStartingColor()"); //To change body of generated methods, choose Tools | Templates.
    }
}
