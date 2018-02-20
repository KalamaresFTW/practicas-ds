package modelo.operacionesBinarias;

import modelo.Operando;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class DivisionTest {

    public DivisionTest() {
    }

    /**
     * Test of getInstance method, of class Division.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        OperacionBinaria expResult = Suma.getInstance();
        OperacionBinaria result = Suma.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of operar method, of class Division.
     */
    @Test (expected = ArithmeticException.class)
    public void testOperar() {
        System.out.println("operar");
        Operando _tres = new Operando("-3");
        Operando _uno = new Operando("-1");
        Operando cero = new Operando("0");
        Operando uno = new Operando("1");
        Operando dos = new Operando("2");
        Operando tres = new Operando("3");
        Operando cuatro = new Operando("4");

        assertEquals(dos, Division.getInstance().operar(cuatro, dos));
        assertEquals(_tres, Division.getInstance().operar(tres, _uno));
        assertEquals(_uno, Division.getInstance().operar(_uno, uno));
        Division.getInstance().operar(tres, cero);
    }

    /**
     * Test of toString method, of class Division.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("División", Division.getInstance().toString());
    }
}
