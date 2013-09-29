/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.board;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author amanj
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.rezgame.backend.board.BoardTest.class, com.rezgame.backend.board.cells.CellsSuite.class, com.rezgame.backend.board.BoardInterfaceTest.class})
public class BoardSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}