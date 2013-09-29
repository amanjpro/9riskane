/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.board.cells;

import com.rezgame.backend.Color;
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
public class BlackCellTest {
    
    public BlackCellTest() {
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
     * Test of isBlack method, of class BlackCell.
     */
    @Test
    public void testIsBlack() {
        System.out.println("isBlack");
        BlackCell instance = null;
        boolean expResult = false;
        boolean result = instance.isBlack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWhite method, of class BlackCell.
     */
    @Test
    public void testIsWhite() {
        System.out.println("isWhite");
        BlackCell instance = null;
        boolean expResult = false;
        boolean result = instance.isWhite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCell method, of class BlackCell.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        BlackCell expResult = null;
        BlackCell result = BlackCell.getCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class BlackCell.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        BlackCell instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BlackCell.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BlackCell instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}