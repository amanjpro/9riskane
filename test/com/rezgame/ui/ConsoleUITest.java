/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.ui;

import com.rezgame.backend.Placement;
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
public class ConsoleUITest {
    
    public ConsoleUITest() {
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
     * Test of getItem method, of class ConsoleUI.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Player currentPlayer = null;
        ConsoleUI instance = new ConsoleUI();
        Placement expResult = null;
        Placement result = instance.getNewPlacement(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveItem method, of class ConsoleUI.
     */
    @Test
    public void testMoveItem() {
        System.out.println("moveItem");
        Player currentPlayer = null;
        ConsoleUI instance = new ConsoleUI();
        Move expResult = null;
        Move result = instance.moveItem(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of badMoveAlert method, of class ConsoleUI.
     */
    @Test
    public void testBadMoveAlert() {
        System.out.println("badMoveAlert");
        String msg = "";
        ConsoleUI instance = new ConsoleUI();
        instance.badMoveAlert(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class ConsoleUI.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Player currentPlayer = null;
        ConsoleUI instance = new ConsoleUI();
        Placement expResult = null;
        Placement result = instance.getRemoveItem(currentPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of win method, of class ConsoleUI.
     */
    @Test
    public void testWin() {
        System.out.println("win");
        Player currentPlayer = null;
        ConsoleUI instance = new ConsoleUI();
        instance.win(currentPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showState method, of class ConsoleUI.
     */
    @Test
    public void testShowBoard() {
        System.out.println("showBoard");
        BoardInterface board = null;
        ConsoleUI instance = new ConsoleUI();
        instance.showState(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class ConsoleUI.
     */
    @Test
    public void testReadLine() {
        System.out.println("readLine");
        ConsoleUI instance = new ConsoleUI();
        String expResult = "";
        String result = instance.readLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readInt method, of class ConsoleUI.
     */
    @Test
    public void testReadInt() {
        System.out.println("readInt");
        ConsoleUI instance = new ConsoleUI();
        int expResult = 0;
        int result = instance.readInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class ConsoleUI.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ConsoleUI instance = new ConsoleUI();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ConsoleUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConsoleUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}