/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend;

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
@Suite.SuiteClasses({com.rezgame.backend.player.PlayerSuite.class, com.rezgame.backend.logic.LogicSuite.class, com.rezgame.backend.MoveTest.class, com.rezgame.backend.ColorTest.class, com.rezgame.backend.board.BoardSuite.class, com.rezgame.backend.LocationTest.class, com.rezgame.backend.UndoManagerTest.class})
public class BackendSuite {

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