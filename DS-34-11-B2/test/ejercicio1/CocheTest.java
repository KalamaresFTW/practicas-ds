package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class CocheTest {
    Coche coche1 = new Coche(1234, "Lamark", "model 1", 1000, 5, 450, 150);
    Coche coche2 = new Coche(1234, "Tesla", "S", 10000, 5000, 450, 150);
    Coche coche3 = new Coche(5678, "Tesla", "X",10000, 6000, 500, 80);
    
    /**
     * Test of getNumBastidor method, of class Coche.
     */
    @Test
    public void testGetNumBastidor() {
        System.out.println("getNumBastidor");
        int expResult = 1234;
        int result = coche1.getNumBastidor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMarca method, of class Coche.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        String expResult = "Lamark";
        String result = coche1.getMarca();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModelo method, of class Coche.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        String expResult = "model 1";
        String result = coche1.getModelo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecio method, of class Coche.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        int expResult = 1000;
        int result = coche1.getPrecio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCaballos method, of class Coche.
     */
    @Test
    public void testGetCaballos() {
        System.out.println("getCaballos");
        int expResult = 5;
        int result = coche1.getCaballos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLongitud method, of class Coche.
     */
    @Test
    public void testGetLongitud() {
        System.out.println("getLongitud");
        int expResult = 450;
        int result = coche1.getLongitud();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlutra method, of class Coche.
     */
    @Test
    public void testGetAlutra() {
        System.out.println("getAlutra");
        int expResult = 150;
        int result = coche1.getAlutra();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class Coche.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 2000;
        coche1.setPrecio(precio);
        assertEquals(coche1.getPrecio(),precio);
    }

    /**
     * Test of hashCode method, of class Coche.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = coche2.hashCode();
        int result = coche1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Coche.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        assertTrue(coche1.equals(coche1));
        assertFalse(coche1.equals(null));
        assertFalse(coche1.equals(new String()));
        assertTrue(coche1.equals(coche2));
        assertFalse(coche1.equals(coche3));
    }

    /**
     * Test of compareTo method, of class Coche.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int expResult = 0;
        int result = coche1.compareTo(coche2);
        assertEquals(expResult, result);
        assertTrue(coche1.compareTo(coche3) < 0);
        assertTrue(coche3.compareTo(coche1) > 0);
    }

    /**
     * Test of toString method, of class Coche.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Coche:"
                + "\tnumBastidor=1234"
                + "\n\tmarca=Lamark"
                + "\n\tmodelo=model 1"
                + "\n\tprecio=1000"
                + "\n\tcaballos=5"
                + "\n\tlongitud=450"
                + "\n\taltura=150";
        String result = coche1.toString();
        assertEquals(expResult, result);
    }
    
}
