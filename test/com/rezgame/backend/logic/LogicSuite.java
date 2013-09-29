/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rezgame.backend.logic;

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
@Suite.SuiteClasses({com.rezgame.backend.logic.GameHistoryManagerTest.class, com.rezgame.backend.logic.LogicInterfaceTest.class, com.rezgame.backend.logic.RezLogicTest.class, com.rezgame.backend.logic.RezSessionControllerTest.class})
public class LogicSuite {

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