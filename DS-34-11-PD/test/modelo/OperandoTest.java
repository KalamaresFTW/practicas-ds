/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class OperandoTest {

    public OperandoTest() {
    }

    /**
     * Test of getOperando method, of class Operando.
     */
    @Test
    public void testGetOperando() {
        System.out.println("getOperando");
        Operando ceroO = new Operando("0");
        BigDecimal ceroBD = new BigDecimal("0.");
        assertEquals(ceroO.getOperando(), ceroBD);
    }

    /**
     * Test of toString method, of class Operando.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Operando cero = new Operando("0.");
        assertEquals("0", cero.toString());
    }

    /**
     * Test of equals method, of class Operando.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Operando cero = new Operando("0.");
        Operando ceroO = new Operando("0.0");
        assertEquals(cero, ceroO);
        assertFalse(cero.equals(new Operando("1.0")));
        assertTrue(cero.equals(cero));
        assertFalse(cero.equals(new String ("hey im false")));
    }

}
