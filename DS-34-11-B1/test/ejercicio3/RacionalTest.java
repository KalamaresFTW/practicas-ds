package ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 * @author p.costa          (Pablo Costa Oubiña)
 */
public class RacionalTest {
    Racional r_12 = new Racional (-1,2);// -1/2
    Racional r12 = new Racional (1,2);  // 1/2
    Racional r22 = new Racional (2,2);  // 1
    Racional r32 = new Racional (3,2);  // 3/2
    Racional r21 = new Racional (2,1);  // 2
    
    @Test
    public void testSuma() {
        System.out.println("suma");
        assertEquals(r32,(r12.mas(r22)));
        assertEquals(r21,(r32.mas(r12)));
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        assertEquals(r_12, (r12.menos(r22)));
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("producto");
        assertEquals(r12, (r12.por(r22)));
    }

    @Test
    public void testDivision() {
        System.out.println("división");
        assertEquals(r12,(r12.entre(r22)));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testConstructor() {
        //constructor "original" vs constructor "copia"
        assertEquals(r12,(new Racional(r12)));
        //construcción imposible
        Racional r_imposible = new Racional(1,0);  
    }
    
    @Test
    public void testEquals() {
        assertTrue((new Racional(1,1)).equals(new Racional (8,8)));
        assertFalse((new Racional (1,1).equals(new Racional (1,123))));
        assertTrue(r12.equals(r12));
        assertFalse(r12.equals(null));
        assertFalse(r12.equals(new String()));
    }
    
    @Test
    public void testHashCode() {
        Racional r = new Racional (1,2);
        assertEquals(r.hashCode(), (new Racional(r)).hashCode());
    }
    
    @Test
    public void testGetNumerador() {
        assertEquals(1, r12.getNumerador());
    }
    
    @Test
    public void testGetDenominador() {
        assertEquals(2, r12.getDenominador());
    }
    
    @Test
    public void testToString() {
        assertEquals(r12.toString(),"1/2");
    }
    
    
}
