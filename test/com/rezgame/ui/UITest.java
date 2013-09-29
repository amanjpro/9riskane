/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.ui;

import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
import com.rezgame.backend.player.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amanj
 */
public class UITest {
    
    public UITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItem method, of class UI.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Player currentPlayer = null;
        UI instance = new UIImpl();
        Location expResult = null;
        Location result = instance.getItem(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveItem method, of class UI.
     */
    @Test
    public void testMoveItem() {
        System.out.println("moveItem");
        Player currentPlayer = null;
        UI instance = new UIImpl();
        Move expResult = null;
        Move result = instance.moveItem(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of badMoveAlert method, of class UI.
     */
    @Test
    public void testBadMoveAlert() {
        System.out.println("badMoveAlert");
        String msg = "";
        UI instance = new UIImpl();
        instance.badMoveAlert(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class UI.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Player currentPlayer = null;
        UI instance = new UIImpl();
        Location expResult = null;
        Location result = instance.removeItem(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of win method, of class UI.
     */
    @Test
    public void testWin() {
        System.out.println("win");
        Player currentPlayer = null;
        UI instance = new UIImpl();
        instance.win(currentPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBoard method, of class UI.
     */
    @Test
    public void testShowBoard() {
        System.out.println("showBoard");
        BoardInterface board = null;
        UI instance = new UIImpl();
        instance.showBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UIImpl extends UI {

        public Location getItem(Player currentPlayer) {
            return null;
        }

        public Move moveItem(Player currentPlayer) {
            return null;
        }

        public void badMoveAlert(String msg) {
        }

        public Location removeItem(Player currentPlayer) {
            return null;
        }

        public void win(Player currentPlayer) {
        }

        public void showBoard(BoardInterface board) {
        }
    }
}