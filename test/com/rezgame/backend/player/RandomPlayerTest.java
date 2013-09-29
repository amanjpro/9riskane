/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.player;

import com.rezgame.backend.Location;
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
public class RandomPlayerTest {
    
    public RandomPlayerTest() {
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
     * Test of getItem method, of class RandomPlayer.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        LogicInterface logic = null;
        RandomPlayer instance = null;
        Location expResult = null;
        Location result = instance.getItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveItem method, of class RandomPlayer.
     */
    @Test
    public void testMoveItem() {
        System.out.println("moveItem");
        LogicInterface logic = null;
        RandomPlayer instance = null;
        Move expResult = null;
        Move result = instance.moveItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class RandomPlayer.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        LogicInterface logic = null;
        RandomPlayer instance = null;
        Location expResult = null;
        Location result = instance.removeItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RandomPlayer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RandomPlayer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}