/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesBinarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author usuario
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({modelo.operacionesBinarias.RestaTest.class, modelo.operacionesBinarias.MultiplicacionTest.class, modelo.operacionesBinarias.DivisionTest.class, modelo.operacionesBinarias.OperacionBinariaTest.class, modelo.operacionesBinarias.SumaTest.class})
public class OperacionesBinariasSuite {

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
