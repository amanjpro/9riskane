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
public class CellTest {
    
    public CellTest() {
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
     * Test of getColor method, of class Cell.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Cell instance = new CellImpl();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBlack method, of class Cell.
     */
    @Test
    public void testIsBlack() {
        System.out.println("isBlack");
        Cell instance = new CellImpl();
        boolean expResult = false;
        boolean result = instance.isBlack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWhite method, of class Cell.
     */
    @Test
    public void testIsWhite() {
        System.out.println("isWhite");
        Cell instance = new CellImpl();
        boolean expResult = false;
        boolean result = instance.isWhite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Cell.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Cell instance = new CellImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCell method, of class Cell.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        Cell expResult = null;
        Cell result = Cell.getCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CellImpl extends Cell {

        public Color getColor() {
            return null;
        }

        public boolean isBlack() {
            return false;
        }

        public boolean isWhite() {
            return false;
        }

        public boolean isEmpty() {
            return false;
        }
    }
}