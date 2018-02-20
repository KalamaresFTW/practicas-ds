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
public class OperacionUnariaTest {
    
    public OperacionUnariaTest() {
    }

    /**
     * Test of operar method, of class OperacionUnaria.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando tres = new Operando("3");
        Operando nueve = new Operando("9");
        assertEquals(nueve, Cuadrado.getInstance().operar(tres));
    }

    public class OperacionUnariaImpl implements OperacionUnaria {

        public Operando operar(Operando op1) {
            return null;
        }
    }
    
}
