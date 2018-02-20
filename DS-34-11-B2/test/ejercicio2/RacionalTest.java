package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo.aragunde
 */
public class RacionalTest {
    Racional r_12 = new Racional (-1,2);// -1/2
    Racional r12 = new Racional (1,2);  // 1/2
    Racional r22 = new Racional (2,2);  // 1
    Racional r32 = new Racional (3,2);  // 3/2
    Racional r34 = new Racional (3,4);  // 3/4
    Racional r21 = new Racional (2,1);  // 2
    Racional r44 = new Racional (4,4);  // 1
    
    @Test (expected = IllegalArgumentException.class)
    public void testConstructor() {
        Racional r_imposible = new Racional(1,0);  
    }
    
    /**
     * Test of getNumerador method, of class Racional.
     */
    @Test
    public void testGetNumerador() {
        assertEquals(1, r12.getNumerador());
    }

    /**
     * Test of getDenominador method, of class Racional.
     */
    @Test
    public void testGetDenominador() {
        assertEquals(2, r12.getDenominador());
    }

    /**
     * Test of simplificar method, of class Racional.
     */
    @Test
    public void testSimplificar() {
        System.out.println("simplificar");
        assertEquals(r22,r44.simplificar());
    }

    /**
     * Test of suma method, of class Racional.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        assertEquals(r32,(r12.suma(r22)));
        assertEquals(r21,(r32.suma(r12)));
    }

    /**
     * Test of resta method, of class Racional.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        assertEquals(r_12, (r12.resta(r22)));
    }

    /**
     * Test of multiplicacion method, of class Racional.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        assertEquals(r34, (r12.multiplicacion(r32)));
    }

    /**
     * Test of division method, of class Racional.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        assertEquals(r12,(r12.division(r22)));
    }

    /**
     * Test of toString method, of class Racional.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(r12.toString(),"1/2");
    }

    /**
     * Test of hashCode method, of class Racional.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Racional r = new Racional (1,2);
        assertEquals(r.hashCode(), (new Racional(r)).hashCode());
    }

    /**
     * Test of equals method, of class Racional.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        assertTrue((new Racional(1,1)).equals(new Racional (8,8)));
        assertFalse((new Racional (1,1).equals(new Racional (1,123))));
        assertTrue(r12.equals(r12));
        assertFalse(r12.equals(null));
        assertFalse(r12.equals(new String()));
    }
    
}
