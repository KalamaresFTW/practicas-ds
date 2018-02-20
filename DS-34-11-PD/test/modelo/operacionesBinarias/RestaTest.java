/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesBinarias;

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
public class RestaTest {
    
    public RestaTest() {
    }

    /**
     * Test of getInstance method, of class Resta.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionBinaria expResult = Resta.getInstance();
        OperacionBinaria result = Resta.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Resta.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando _uno = new Operando("-1");
        Operando cero = new Operando("0");
        Operando uno = new Operando("1");
        Operando dos = new Operando("2");
        Operando tres = new Operando("3");
        
        assertEquals(uno,Resta.getInstance().operar(tres, dos));
        assertEquals(dos,Resta.getInstance().operar(uno,_uno));
        
    }

    /**
     * Test of toString method, of class Resta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("Resta", Resta.getInstance().toString());
    }
    
}
