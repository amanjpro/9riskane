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
public class LogicInterfaceTest {
    
    public LogicInterfaceTest() {
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
     * Test of canPutItem method, of class LogicInterface.
     */
    @Test
    public void testCanPutItem() {
        System.out.println("canPutItem");
        Location loc = null;
        LogicInterface instance = new LogicInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.canPutItem(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemove method, of class LogicInterface.
     */
    @Test
    public void testCanRemove() {
        System.out.println("canRemove");
        Location loc = null;
        LogicInterface instance = new LogicInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.canRemove(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRez method, of class LogicInterface.
     */
    @Test
    public void testIsRez() {
        System.out.println("isRez");
        Color color = null;
        Location loc = null;
        LogicInterface instance = new LogicInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.isRez(color, loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canMove method, of class LogicInterface.
     */
    @Test
    public void testCanMove() {
        System.out.println("canMove");
        Move mv = null;
        LogicInterface instance = new LogicInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.canMove(mv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoard method, of class LogicInterface.
     */
    @Test
    public void testGetBoard() {
        System.out.println("getBoard");
        LogicInterface instance = new LogicInterfaceImpl();
        BoardInterface expResult = null;
        BoardInterface result = instance.getBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpponent method, of class LogicInterface.
     */
    @Test
    public void testGetOpponent() {
        System.out.println("getOpponent");
        LogicInterface instance = new LogicInterfaceImpl();
        Color expResult = null;
        Color result = instance.getOpponent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class LogicInterface.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        LogicInterface instance = new LogicInterfaceImpl();
        Color expResult = null;
        Color result = instance.currentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LogicInterfaceImpl implements LogicInterface {

        public boolean canPutItem(Location loc) {
            return false;
        }

        public boolean canRemove(Location loc) {
            return false;
        }

        public boolean isRez(Color color, Location loc) {
            return false;
        }

        public boolean canMove(Move mv) {
            return false;
        }

        public BoardInterface getBoard() {
            return null;
        }

        public Color getOpponent() {
            return null;
        }

        public Color currentPlayer() {
            return null;
        }
    }
}