package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class CollatzTest {

    int[] collatz6 = new int[Collatz.MAX_ARRAY_SIZE];
    int[] collatz19 = new int[Collatz.MAX_ARRAY_SIZE];
    
    @Before
    public void setUp() throws Exception {
        //Preparamos un array con la serie de Collatz generada a partir del 6
        //6, 3, 10, 5, 16, 8, 4, 2, 1
        collatz6[0] = 6;
        collatz6[1] = 3;
        collatz6[2] = 10;
        collatz6[3] = 5;
        collatz6[4] = 16;
        collatz6[5] = 8;
        collatz6[6] = 4;
        collatz6[7] = 2;
        collatz6[8] = 1;
        //Preparamos un array con la serie de Collatz generada a partir del 19
        //19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.
        collatz19[0] = 19;
        collatz19[1] = 58;
        collatz19[2] = 29;
        collatz19[3] = 88;
        collatz19[4] = 44;
        collatz19[5] = 22;
        collatz19[6] = 11;
        collatz19[7] = 34;
        collatz19[8] = 17;
        collatz19[9] = 52;
        collatz19[10] = 26;
        collatz19[11] = 13;
        collatz19[12] = 40;
        collatz19[13] = 20;
        collatz19[14] = 10;
        collatz19[15] = 5;
        collatz19[16] = 16;
        collatz19[17] = 8;
        collatz19[18] = 4;
        collatz19[19] = 2;
        collatz19[20] = 1;
    }

    @Test
    public void testCollatz() {
        assertArrayEquals(collatz6, Collatz.collatz(6));
        assertArrayEquals(collatz19, Collatz.collatz(19));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testCollatzException(){
        Collatz.collatz(0);
    }

    @Test
    public void testLengthCollatz() {
        assertEquals(9, Collatz.lengthCollatz(collatz6));
        assertEquals(21, Collatz.lengthCollatz(collatz19));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testLengthCollatzException(){
        Collatz.lengthCollatz(null);
    }

}
