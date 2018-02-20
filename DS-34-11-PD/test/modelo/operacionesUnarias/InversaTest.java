package modelo.operacionesUnarias;

import modelo.Operando;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class InversaTest {
    
    public InversaTest() {
    }

    /**
     * Test of getInstance method, of class Inversa.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionUnaria expResult = Inversa.getInstance();
        OperacionUnaria result = Inversa.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Inversa.
     */
    @Test (expected = ArithmeticException.class)
    public void testOperar(){
        System.out.println("operar");
        Operando _dos = new Operando("-2");
        Operando _medio = new Operando("-0.5");
        Operando cero = new Operando("0");
        Operando medio = new Operando("0.5");
        Operando dos = new Operando("2");
        assertEquals(_medio, Inversa.getInstance().operar(_dos));
        assertEquals(medio, Inversa.getInstance().operar(dos));
        Inversa.getInstance().operar(cero);
    }
    
}
