/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.player;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import com.rezgame.backend.logic.LogicInterface;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getColor method, of class Player.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Player instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Player.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        LogicInterface logic = null;
        Player instance = null;
        Placement expResult = null;
        Placement result = instance.getItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveItem method, of class Player.
     */
    @Test
    public void testMoveItem() {
        System.out.println("moveItem");
        LogicInterface logic = null;
        Player instance = null;
        Move expResult = null;
        Move result = instance.moveItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Player.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        LogicInterface logic = null;
        Player instance = null;
        Placement expResult = null;
        Placement result = instance.removeItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super(null);
        }

        public Placement getItem(LogicInterface logic) {
            return null;
        }

        public Move moveItem(LogicInterface logic) {
            return null;
        }

        public Placement removeItem(LogicInterface logic) {
            return null;
        }
    }
}