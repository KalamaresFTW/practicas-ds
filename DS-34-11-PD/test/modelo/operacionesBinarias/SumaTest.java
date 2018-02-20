/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesBinarias;

import modelo.Operando;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class SumaTest {
    
    public SumaTest() {
    }

    /**
     * Test of getInstance method, of class Suma.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionBinaria expResult = Suma.getInstance();
        OperacionBinaria result = Suma.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Suma.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando _uno = new Operando("-1");
        Operando cero = new Operando("0");
        Operando uno = new Operando("1");
        Operando dos = new Operando("2");
        Operando tres = new Operando("3");
        
        assertEquals(tres,Suma.getInstance().operar(uno, dos));
        assertEquals(cero,Suma.getInstance().operar(uno, _uno));
    }

    /**
     * Test of toString method, of class Suma.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("Suma", Suma.getInstance().toString());
    }
    
}
