package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo.aragunde
 */
public class ComplejoTest {
    Complejo c11 = new Complejo(1d, 1d);
    Complejo c12 = new Complejo(1d, 2d);
    Complejo c22 = new Complejo(2d, 2d);
    Complejo c_13 = new Complejo(-1d, 3d);
    Complejo c06_02 = new Complejo(0.6d, -0.2d);
    /**
     * Test of suma method, of class Complejo.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        assertEquals(c22, c11.suma(c11));
    }

    /**
     * Test of resta method, of class Complejo.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        assertEquals(c11,c22.resta(c11));

    }

    /**
     * Test of multiplicacion method, of class Complejo.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        assertEquals(c_13,c11.multiplicacion(c12));
    }

    /**
     * Test of division method, of class Complejo.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        assertEquals(c06_02, c11.division(c12));
    }

    /**
     * Test of getReal method, of class Complejo.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        assertEquals(1.0d, c11.getReal(), 10e-5d);
    }

    /**
     * Test of getImaginaria method, of class Complejo.
     */
    @Test
    public void testGetImaginaria() {
        System.out.println("getImaginaria");
        assertEquals(1.0d, c11.getImaginaria(), 10e-5d);
    }

    /**
     * Test of toString method, of class Complejo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("1.0 + 1.0i", c11.toString());
    }

    /**
     * Test of hashCode method, of class Complejo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int h = (new Complejo(1d,1d)).hashCode();
        assertEquals(h, c11.hashCode());
    }

    /**
     * Test of equals method, of class Complejo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        assertTrue(c11.equals(c11));
        assertFalse(c11.equals(null));
        assertFalse(c11.equals(new String()));
        assertFalse(c11.equals(c12));
        assertFalse(c11.equals(c22));
        assertTrue(c11.equals(new Complejo(1.0d,1.0d)));
    }
    
}
