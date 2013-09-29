package com.rezgame.ui;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.Board;
import com.rezgame.backend.board.BoardInterface;
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
public class ConsoleUI extends UI {

    @Override
    public Location getItem(Player currentPlayer) {
        System.out.println(currentPlayer + ", please enter a location to put an item: ");
        int x = readInt();
        int y = readInt();
        return new Location(x, y);
    }

    @Override
    public Move moveItem(Player currentPlayer) {
        System.out.println(currentPlayer + ", please enter the next move: ");
        int x1 = readInt();
        int y1 = readInt();
        int x2 = readInt();
        int y2 = readInt();
        return new Move(new Location(x1, y1), new Location(x2, y2));
    }

    @Override
    public void badMoveAlert(String msg) {
        LOGGER.fine(msg);
        System.out.println(msg);
    }

    @Override
    public Location removeItem(Player currentPlayer) {
        System.out.println(currentPlayer + ", please enter the item to remove: ");
        int x = readInt();
        int y = readInt();
        return new Location(x, y);
    }

    @Override
    public void win(Player currentPlayer) {
        System.out.println("Complimenti " + currentPlayer + "! Lo vinci!");
        System.out.println("Do you want to play again? (yes|no): ");
        if(readLine().equalsIgnoreCase("yes")) {
            init();
        } else {
            System.out.println("Era fantastica giocare con te! Buona notte.");
        }
    }

    @Override
    public void showBoard(BoardInterface board) {
        System.out.println(board.prettyPrint());
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
        Player p1 = new HumanPlayer("Amanj", this, Color.White);
        Player p2 = new HumanPlayer("Nosheen", this, Color.Black);

//        Player p1 = new RandomPlayer("Amanj", Color.White);
//        Player p2 = new RandomPlayer("Nosheen", Color.Black);

        RezSessionController session = new RezSessionController(this, p1, p2);
        session.start();
    }

    public static void main(String... args) {
        new ConsoleUI().init();
    }


    private Logger LOGGER = Logger.getLogger("ConsoleUILogger");
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
}
