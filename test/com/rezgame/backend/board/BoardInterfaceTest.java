/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.board;

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
public class BoardInterfaceTest {
    
    public BoardInterfaceTest() {
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
     * Test of getAllEmptyCells method, of class BoardInterface.
     */
    @Test
    public void testGetAllEmptyCells() {
        System.out.println("getAllEmptyCells");
        BoardInterface instance = new BoardInterfaceImpl();
        List expResult = null;
        List result = instance.getAllEmptyCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBlackCells method, of class BoardInterface.
     */
    @Test
    public void testGetAllBlackCells() {
        System.out.println("getAllBlackCells");
        BoardInterface instance = new BoardInterfaceImpl();
        List expResult = null;
        List result = instance.getAllBlackCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWhiteCells method, of class BoardInterface.
     */
    @Test
    public void testGetAllWhiteCells() {
        System.out.println("getAllWhiteCells");
        BoardInterface instance = new BoardInterfaceImpl();
        List expResult = null;
        List result = instance.getAllWhiteCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPossibleMoves method, of class BoardInterface.
     */
    @Test
    public void testGetPossibleMoves() {
        System.out.println("getPossibleMoves");
        Placement current = null;
        BoardInterface instance = new BoardInterfaceImpl();
        List expResult = null;
        List result = instance.getPossibleMoves(current);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPossibleMovesForWhite method, of class BoardInterface.
     */
    @Test
    public void testGetAllPossibleMovesForWhite() {
        System.out.println("getAllPossibleMovesForWhite");
        BoardInterface instance = new BoardInterfaceImpl();
        Map expResult = null;
        Map result = instance.getAllPossibleMovesForWhite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPossibleMovesForBlack method, of class BoardInterface.
     */
    @Test
    public void testGetAllPossibleMovesForBlack() {
        System.out.println("getAllPossibleMovesForBlack");
        BoardInterface instance = new BoardInterfaceImpl();
        Map expResult = null;
        Map result = instance.getAllPossibleMovesForBlack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfBlackCells method, of class BoardInterface.
     */
    @Test
    public void testGetNumberOfBlackCells() {
        System.out.println("getNumberOfBlackCells");
        BoardInterface instance = new BoardInterfaceImpl();
        int expResult = 0;
        int result = instance.getNumberOfBlackCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfWhiteCells method, of class BoardInterface.
     */
    @Test
    public void testGetNumberOfWhiteCells() {
        System.out.println("getNumberOfWhiteCells");
        BoardInterface instance = new BoardInterfaceImpl();
        int expResult = 0;
        int result = instance.getNumberOfWhiteCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prettyPrint method, of class BoardInterface.
     */
    @Test
    public void testPrettyPrint() {
        System.out.println("prettyPrint");
        BoardInterface instance = new BoardInterfaceImpl();
        String expResult = "";
        String result = instance.prettyPrint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BoardInterfaceImpl implements BoardInterface {

        public List<Placement> getAllEmptyCells() {
            return null;
        }

        public List<Placement> getAllBlackCells() {
            return null;
        }

        public List<Placement> getAllWhiteCells() {
            return null;
        }

        public List<Move> getPossibleMoves(Placement current) {
            return null;
        }

        public Map<Placement, List<Move>> getAllPossibleMovesForWhite() {
            return null;
        }

        public Map<Placement, List<Move>> getAllPossibleMovesForBlack() {
            return null;
        }

        public int getNumberOfBlackCells() {
            return 0;
        }

        public int getNumberOfWhiteCells() {
            return 0;
        }

        public String prettyPrint() {
            return "";
        }
    }
}