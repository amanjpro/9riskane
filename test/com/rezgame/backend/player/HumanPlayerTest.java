/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.player;

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
public class HumanPlayerTest {
    
    public HumanPlayerTest() {
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
     * Test of removeItem method, of class HumanPlayer.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        LogicInterface logic = null;
        HumanPlayer instance = null;
        Placement expResult = null;
        Placement result = instance.removeItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class HumanPlayer.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        LogicInterface logic = null;
        HumanPlayer instance = null;
        Placement expResult = null;
        Placement result = instance.getItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveItem method, of class HumanPlayer.
     */
    @Test
    public void testMoveItem() {
        System.out.println("moveItem");
        LogicInterface logic = null;
        HumanPlayer instance = null;
        Move expResult = null;
        Move result = instance.moveItem(logic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HumanPlayer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HumanPlayer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}