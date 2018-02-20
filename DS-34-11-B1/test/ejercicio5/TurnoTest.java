package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class TurnoTest {
    
    public TurnoTest() {
    }
    
    /**
     * Test of values method, of class Turno.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Turno[] expResult = new Turno[3];
            expResult[0] = Turno.MAÑANA;
            expResult[1] = Turno.TARDE;
            expResult[2] = Turno.NOCHE;
        Turno[] result = Turno.values();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "MAÑANA";
        Turno expResult = Turno.MAÑANA;
        Turno result = Turno.valueOf(name);
        assertEquals(expResult, result);
    }
}
