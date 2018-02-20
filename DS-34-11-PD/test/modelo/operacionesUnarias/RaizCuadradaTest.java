/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesUnarias;

import modelo.Operando;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class RaizCuadradaTest {
    
    public RaizCuadradaTest() {
    }

    /**
     * Test of getInstance method, of class RaizCuadrada.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionUnaria expResult = RaizCuadrada.getInstance();
        OperacionUnaria result = RaizCuadrada.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class RaizCuadrada.
     */
    @Test (expected = ArithmeticException.class)
    public void testOperar() {
        System.out.println("operar");
        Operando _tres = new Operando("-3");
        Operando cero = new Operando("0");
        Operando tres = new Operando("3");
        Operando nueve = new Operando("9");
        assertEquals(tres, RaizCuadrada.getInstance().operar(nueve));
        assertEquals(cero, RaizCuadrada.getInstance().operar(cero));
        RaizCuadrada.getInstance().operar(_tres);
    }
    
}
