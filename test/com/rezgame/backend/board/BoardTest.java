/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.board;

import com.rezgame.backend.Color;
import com.rezgame.backend.Placement;
import com.rezgame.backend.Move;
import java.util.List;
import java.util.Map;
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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of placeItem method, of class Board.
     */
    @Test
    public void testPlaceItem() {
        System.out.println("placeItem");
        Placement loc = null;
        Color color = null;
        Board instance = new Board();
        instance.placeItem(loc, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Board.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Move mv = null;
        Board instance = new Board();
        instance.move(mv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmptyCells method, of class Board.
     */
    @Test
    public void testGetAllEmptyCells() {
        System.out.println("getAllEmptyCells");
        Board instance = new Board();
        List expResult = null;
        List result = instance.getAllEmptyCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBlackCells method, of class Board.
     */
    @Test
    public void testGetAllBlackCells() {
        System.out.println("getAllBlackCells");
        Board instance = new Board();
        List expResult = null;
        List result = instance.getAllBlackCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWhiteCells method, of class Board.
     */
    @Test
    public void testGetAllWhiteCells() {
        System.out.println("getAllWhiteCells");
        Board instance = new Board();
        List expResult = null;
        List result = instance.getAllWhiteCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPossibleMoves method, of class Board.
     */
    @Test
    public void testGetPossibleMoves() {
        System.out.println("getPossibleMoves");
        Placement current = null;
        Board instance = new Board();
        List expResult = null;
        List result = instance.getPossibleMoves(current);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPossibleMovesForWhite method, of class Board.
     */
    @Test
    public void testGetAllPossibleMovesForWhite() {
        System.out.println("getAllPossibleMovesForWhite");
        Board instance = new Board();
        Map expResult = null;
        Map result = instance.getAllPossibleMovesForWhite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPossibleMovesForBlack method, of class Board.
     */
    @Test
    public void testGetAllPossibleMovesForBlack() {
        System.out.println("getAllPossibleMovesForBlack");
        Board instance = new Board();
        Map expResult = null;
        Map result = instance.getAllPossibleMovesForBlack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Board.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Placement loc = null;
        Board instance = new Board();
        instance.removeItem(loc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfBlackCells method, of class Board.
     */
    @Test
    public void testGetNumberOfBlackCells() {
        System.out.println("getNumberOfBlackCells");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getNumberOfBlackCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfWhiteCells method, of class Board.
     */
    @Test
    public void testGetNumberOfWhiteCells() {
        System.out.println("getNumberOfWhiteCells");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getNumberOfWhiteCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPossibleMove method, of class Board.
     */
    @Test
    public void testIsPossibleMove() {
        System.out.println("isPossibleMove");
        Move mv = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isPossibleMove(mv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Board.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Placement loc = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isEmpty(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAllSet method, of class Board.
     */
    @Test
    public void testIsAllSet() {
        System.out.println("isAllSet");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isAllSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBlack method, of class Board.
     */
    @Test
    public void testIsBlack() {
        System.out.println("isBlack");
        Placement loc = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isBlack(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWhite method, of class Board.
     */
    @Test
    public void testIsWhite() {
        System.out.println("isWhite");
        Placement loc = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isWhite(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWithinBounds method, of class Board.
     */
    @Test
    public void testIsWithinBounds() {
        System.out.println("isWithinBounds");
        Placement loc = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isWithinBounds(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCorner method, of class Board.
     */
    @Test
    public void testIsCorner() {
        System.out.println("isCorner");
        Placement loc = null;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isCorner(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClockWiseAdjacent method, of class Board.
     */
    @Test
    public void testGetClockWiseAdjacent() {
        System.out.println("getClockWiseAdjacent");
        Placement loc = null;
        Board instance = new Board();
        Placement expResult = null;
        Placement result = instance.getClockWiseAdjacent(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCounterClockWiseAdjacent method, of class Board.
     */
    @Test
    public void testGetCounterClockWiseAdjacent() {
        System.out.println("getCounterClockWiseAdjacent");
        Placement loc = null;
        Board instance = new Board();
        Placement expResult = null;
        Placement result = instance.getCounterClockWiseAdjacent(loc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterValid method, of class Board.
     */
    @Test
    public void testFilterValid() {
        System.out.println("filterValid");
        List<Placement> locs = null;
        Board instance = new Board();
        List expResult = null;
        List result = instance.filterValid(locs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prettyPrint method, of class Board.
     */
    @Test
    public void testPrettyPrint() {
        System.out.println("prettyPrint");
        Board instance = new Board();
        String expResult = "";
        String result = instance.prettyPrint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}