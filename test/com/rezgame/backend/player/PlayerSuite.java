/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.player;

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
@Suite.SuiteClasses({com.rezgame.backend.player.RandomPlayerTest.class, com.rezgame.backend.player.HumanPlayerTest.class, com.rezgame.backend.player.PlayerTest.class, com.rezgame.backend.player.KapraPlayerTest.class})
public class PlayerSuite {

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