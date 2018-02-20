/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesUnarias;

import modelo.Operando;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class OpuestaTest {
    
    public OpuestaTest() {
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
     * Test of getInstance method, of class Opuesta.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionUnaria expResult = Opuesta.getInstance();
        OperacionUnaria result = Opuesta.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Opuesta.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando _tres = new Operando("-3");
        Operando cero = new Operando("0");
        Operando tres = new Operando("3");
        assertEquals(tres, Opuesta.getInstance().operar(_tres));
        assertEquals(_tres, Opuesta.getInstance().operar(tres));
        assertEquals(cero, Opuesta.getInstance().operar(cero));
    }
    
}
