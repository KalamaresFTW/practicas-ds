package ejercicio5;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicolaTest {

    Bicola<Integer> bicola;

    public BicolaTest() {
    }

    @Before
    public void setUp() {
        bicola = new Bicola<>();
    }

    /**
     * Test of isOrdenada method, of class Bicola.
     */
    @Test
    public void testIsOrdenada() {
        System.out.println("isOrdenada");
        assertTrue(bicola.isOrdenada());
        bicola.setOrdenada(false);
        assertFalse(bicola.isOrdenada());
    }

    /**
     * Test of setOrdenada method, of class Bicola.
     */
    @Test
    public void testSetOrdenada() {
        System.out.println("setOrdenada");
        assertTrue(bicola.isOrdenada());
        bicola.setOrdenada(false);
        assertFalse(bicola.isOrdenada());
    }

    /**
     * Test of insertarIzq method, of class Bicola.
     */
    @Test
    public void testInsertarIzq() {
        System.out.println("insertarIzq");
        bicola.insertarIzq(1);
        assertEquals(bicola.obtenerIzq(), new Integer(1));
        bicola.insertarIzq(2);
        assertEquals(bicola.obtenerIzq(), new Integer(2));
    }

    /**
     * Test of insertarDch method, of class Bicola.
     */
    @Test
    public void testInsertarDch() {
        System.out.println("insertarDch");
        bicola.insertarDch(1);
        assertEquals(bicola.obtenerDch(), new Integer(1));
        bicola.insertarDch(2);
        assertEquals(bicola.obtenerDch(), new Integer(2));
    }

    /**
     * Test of obtenerIzq method, of class Bicola.
     */
    @Test
    public void testObtenerIzq() {
        System.out.println("obtenerIzq");
        bicola.insertarIzq(1);
        assertEquals(bicola.obtenerIzq(), new Integer(1));
        bicola.insertarIzq(2);
        assertEquals(bicola.obtenerIzq(), new Integer(2));
    }

    /**
     * Test of obtenerDch method, of class Bicola.
     */
    @Test
    public void testObtenerDch() {
        System.out.println("obtenerDch");
        bicola.insertarDch(1);
        assertEquals(bicola.obtenerDch(), new Integer(1));
        bicola.insertarDch(2);
        assertEquals(bicola.obtenerDch(), new Integer(2));
    }

    /**
     * Test of sacarIzq method, of class Bicola.
     */
    @Test
    public void testSacarIzq() {
        System.out.println("testSacarIzq");
        bicola.insertarIzq(1);
        bicola.insertarIzq(2);
        assertEquals(bicola.sacarIzq(), new Integer(2));
        assertEquals(bicola.sacarIzq(), new Integer(1));

    }

    /**
     * Test of sacarDch method, of class Bicola.
     */
    @Test
    public void testSacarDch() {
        System.out.println("sacarDch");
        bicola.insertarDch(1);
        bicola.insertarDch(2);
        assertEquals(bicola.sacarDch(), new Integer(2));
        assertEquals(bicola.sacarDch(), new Integer(1));
    }

    /**
     * Test of iterator method, of class Bicola.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        bicola.insertarIzq(2);
        bicola.insertarIzq(1);
        bicola.insertarDch(3);
        bicola.insertarDch(4);
        Integer[] expected = {1, 2, 3, 4};
        Integer[] result = {0, 0, 0, 0};
        int i = 0;
        for (Integer integer : bicola) {
            result[i++] = integer;
        }
        assertArrayEquals(expected, result);

        bicola.setOrdenada(false);
        Integer[] expected2 = {4, 3, 2, 1};
        i = 0;
        for (Integer integer : bicola) {
            result[i++] = integer;
        }
        assertArrayEquals(expected2, result);

    }
}
