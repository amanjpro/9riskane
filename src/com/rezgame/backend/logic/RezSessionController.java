package com.rezgame.backend.logic;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.player.Player;
import com.rezgame.ui.UI;

import java.util.Random;
import java.util.logging.Logger;

/*
 * Copyright (c) <2013>, Amanj Sherwany and Nosheen Zaza
 * All rights reserved.
 * */
public class RezSessionController {

    public RezSessionController(UI ui, Player p1, Player p2) {
        this(ui, 9, p1, p2, (new Random().nextBoolean()) ? Color.White : Color.Black);
    }

    public RezSessionController(UI ui, int items, Player p1, Player p2) {
        this(ui, items, p1, p2, (new Random().nextBoolean()) ? Color.White : Color.Black);
    }

    public RezSessionController(UI ui, int items, Player p1, Player p2, Color starter) {
        checkPlayersValidity(p1, p2);
        logic = new RezLogic(items, starter);
        this.ui = ui;
        if(starter == p1.getColor()) {
            player1 = p1;
            player2 = p2;
        } else {
            player1 = p2;
            player2 = p1;
        }
    }


    public void start() {
        while(inGame) {
            if(logic.isInitMode()) {
                Placement loc = getCurrentPlayer().getItem(logic);
                if(logic.canPutItem(loc)) {
                    logic.put(loc);
                    doRezCheck(loc);
                    logic.changePlayer();
                } else {
                    ui.badMoveAlert("Player " + getCurrentPlayer() + " cannot put an item in location " + loc);
                }
            } else {
                Move mv = getCurrentPlayer().moveItem(logic);
                if(logic.canMove(mv)) {
                    logic.move(mv);
                    doRezCheck(mv.getTo());
                    logic.changePlayer();
                } else {
                    ui.badMoveAlert();
                }
            }
            ui.showState(logic.getBoard());
        }
    }

    private void doRezCheck(Placement loc) {
        if(logic.isRez(logic.currentPlayer(), loc)) {
            ui.showState(logic.getBoard());
            Placement removedLoc = getCurrentPlayer().removeItem(logic);
            while(! logic.canRemove(removedLoc)) {
                ui.badMoveAlert("Player " + getCurrentPlayer() + " cannot remove an item in location " + removedLoc);
                ui.showState(logic.getBoard());
                removedLoc = getCurrentPlayer().removeItem(logic);
            }
            logic.remove(removedLoc);
            doWinCheck();
        }
    }

    private void doWinCheck() {
        if(logic.isWinning()) {
            ui.win(getCurrentPlayer());
            inGame = false;
        }
    }


    private void checkPlayersValidity(Player p1, Player p2) {
        if(p1.getColor() == p2.getColor()) {
            String msg = "Players should not have the same color: p1: " + p1 + ", p2: " + p2;
            LOGGER.severe(msg);
            throw new RuntimeException(msg);
        }
    }


    public Player getCurrentPlayer() {
        if(logic.currentPlayer() == player1.getColor()) return player1;
        else return player2;
    }


    private final UI ui;
    private Logger LOGGER = Logger.getLogger("RezSessionControlLogger");
    private final Player player1, player2;
    private boolean inGame = true;
    private final RezLogic logic;
}
