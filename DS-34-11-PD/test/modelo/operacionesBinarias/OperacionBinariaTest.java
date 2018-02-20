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
public class OperacionBinariaTest {

    public OperacionBinariaTest() {

    }

    /**
     * Test of operar method, of class OperacionBinaria.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando _uno = new Operando("-1");
        Operando cero = new Operando("0");
        Operando uno = new Operando("1");
        Operando dos = new Operando("2");
        Operando tres = new Operando("3");

        assertEquals(tres, Suma.getInstance().operar(uno, dos));
        assertEquals(cero, Suma.getInstance().operar(uno, _uno));
    }

    public class OperacionBinariaImpl implements OperacionBinaria {

        public Operando operar(Operando op1, Operando op2) {
            return null;
        }
    }

}
