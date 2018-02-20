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
public class CuadradoTest {
    
    public CuadradoTest() {
    }

    /**
     * Test of getInstance method, of class Cuadrado.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionUnaria expResult = Cuadrado.getInstance();
        OperacionUnaria result = Cuadrado.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Cuadrado.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Operando _tres = new Operando("-3");
        Operando cero = new Operando("0");
        Operando tres = new Operando("3");
        Operando nueve = new Operando("9");
        assertEquals(nueve, Cuadrado.getInstance().operar(tres));
        assertEquals(cero, Cuadrado.getInstance().operar(cero));
        assertEquals(nueve, Cuadrado.getInstance().operar(_tres));
    }
    
}
