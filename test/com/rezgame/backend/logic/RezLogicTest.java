/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.logic;

import com.rezgame.backend.Color;
import com.rezgame.backend.Location;
import com.rezgame.backend.Move;
import com.rezgame.backend.board.BoardInterface;
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
public class RezLogicTest {
    
    public RezLogicTest() {
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
     * Test of canPutItem method, of class RezLogic.
     */
    @Test
    public void testCanPutItem() {
        System.out.println("canPutItem");
        Location loc = null;
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.canPutItem(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInitMode method, of class RezLogic.
     */
    @Test
    public void testIsInitMode() {
        System.out.println("isInitMode");
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.isInitMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class RezLogic.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Location loc = null;
        RezLogic instance = null;
        instance.put(loc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RezLogic.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Location loc = null;
        RezLogic instance = null;
        instance.remove(loc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemove method, of class RezLogic.
     */
    @Test
    public void testCanRemove() {
        System.out.println("canRemove");
        Location loc = null;
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.canRemove(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWinning method, of class RezLogic.
     */
    @Test
    public void testIsWinning() {
        System.out.println("isWinning");
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.isWinning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRez method, of class RezLogic.
     */
    @Test
    public void testIsRez() {
        System.out.println("isRez");
        Color color = null;
        Location loc = null;
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.isRez(color, loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canMove method, of class RezLogic.
     */
    @Test
    public void testCanMove() {
        System.out.println("canMove");
        Move mv = null;
        RezLogic instance = null;
        boolean expResult = false;
        boolean result = instance.canMove(mv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class RezLogic.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Move mv = null;
        RezLogic instance = null;
        instance.move(mv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoard method, of class RezLogic.
     */
    @Test
    public void testGetBoard() {
        System.out.println("getBoard");
        RezLogic instance = null;
        BoardInterface expResult = null;
        BoardInterface result = instance.getBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpponent method, of class RezLogic.
     */
    @Test
    public void testGetOpponent() {
        System.out.println("getOpponent");
        RezLogic instance = null;
        Color expResult = null;
        Color result = instance.getOpponent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class RezLogic.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        RezLogic instance = null;
        Color expResult = null;
        Color result = instance.currentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayer method, of class RezLogic.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
        RezLogic instance = null;
        instance.changePlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}