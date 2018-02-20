package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author pablo.aragunde
 */
public class OperableTest {
    Racional r_12 = new Racional (-1,2);// -1/2
    Racional r12 = new Racional (1,2);  // 1/2
    Racional r22 = new Racional (2,2);  // 1
    Racional r32 = new Racional (3,2);  // 3/2
    Racional r34 = new Racional (3,4);  // 3/4
    Racional r21 = new Racional (2,1);  // 2
    Racional r44 = new Racional (4,4);  // 1

    
    /**
     * Test of suma method, of class Operable.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        assertEquals(r32, r12.suma(r44));
    }

    /**
     * Test of resta method, of class Operable.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        assertEquals(r_12, (r12.resta(r22)));
    }

    /**
     * Test of multiplicacion method, of class Operable.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        assertEquals(r34, (r12.multiplicacion(r32)));
    }

    /**
     * Test of division method, of class Operable.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        assertEquals(r12,(r12.division(r22)));
    }

    //testéase así?
    //hai algo máis que testiar wei?!!1!?
    
}