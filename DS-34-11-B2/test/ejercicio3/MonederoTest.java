package ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Pablo
 */
public class MonederoTest {

    public MonederoTest() {
    }

    @Test
    public void testInsertarMoneda() {
        System.out.println("insertarMoneda");
        Monedero mdr = new Monedero();
        assertTrue(mdr.insertarMoneda(Moneda.EURO2));
    }

    /**
     * Test of extraerMoneda method, of class Monedero.
     */
    @Test
    public void testExtraerMoneda() {
        System.out.println("extraerMoneda");
        Monedero mdr = new Monedero();
        mdr.insertarMoneda(Moneda.EURO2);
        Moneda m = mdr.extraerMoneda(Moneda.EURO1);
        assertEquals(m, null);
        m = mdr.extraerMoneda(Moneda.EURO2);
        assertEquals(m, Moneda.EURO2);
    }

    /**
     * Test of contarMonedas method, of class Monedero.
     */
    @Test
    public void testContarMonedas_0args() {
        System.out.println("contarMonedas()");
        Monedero mdr = new Monedero();
        assertEquals(mdr.contarMonedas(), 0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        assertEquals(mdr.contarMonedas(), 3);
    }

    /**
     * Test of contarMonedas method, of class Monedero.
     */
    @Test
    public void testContarMonedas_Moneda() {
        System.out.println("contarMonedas");
        Monedero mdr = new Monedero();
        assertEquals(mdr.contarMonedas(Moneda.EURO1), 0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        assertEquals(mdr.contarMonedas(Moneda.EURO2), 3);
        mdr.insertarMoneda(Moneda.EURO1);
        assertEquals(mdr.contarMonedas(Moneda.EURO1), 1);
    }

    /**
     * Test of valorMonedero method, of class Monedero.
     */
    @Test
    public void testValorMonedero() {
        System.out.println("valorMonedero");
        Monedero mdr = new Monedero();
        assertEquals(mdr.valorMonedero(), 0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO1);
        mdr.insertarMoneda(Moneda.CENT50);
        mdr.insertarMoneda(Moneda.CENT20);
        mdr.insertarMoneda(Moneda.CENT10);
        mdr.insertarMoneda(Moneda.CENT5);
        mdr.insertarMoneda(Moneda.CENT2);
        mdr.insertarMoneda(Moneda.CENT1);
        assertEquals(mdr.valorMonedero(), 388);
    }

    /**
     * Test of ordenar method, of class Monedero.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        Monedero m = new Monedero();
        m.insertarMoneda(Moneda.CENT20);
        m.insertarMoneda(Moneda.CENT50);
        m.insertarMoneda(Moneda.EURO1);
        m.insertarMoneda(Moneda.CENT1);
        m.insertarMoneda(Moneda.EURO2);
        m.ordenar();
        Moneda[] expected = {Moneda.CENT1, Moneda.CENT20, Moneda.CENT50, Moneda.EURO1, Moneda.EURO2};
        Moneda[] result = new Moneda[5];
        for (int i = 0; i < m.contarMonedas(); i++) {
            result[i] = m.obtenerMoneda(i);
        }
        assertArrayEquals(expected, result);
    }

    /**
     * Test of obtenerMoneda method, of class Monedero.
     */
    @Test
    public void testObtenerMoneda() {
        System.out.println("obtenerMoneda");
        Monedero m = new Monedero();
        m.insertarMoneda(Moneda.CENT20);
        m.insertarMoneda(Moneda.CENT50);
        m.ordenar();
        assertEquals(m.obtenerMoneda(0), Moneda.CENT20);
        assertEquals(m.obtenerMoneda(1), Moneda.CENT50);
    }

    /**
     * Test of vaciarMonedero method, of class Monedero.
     */
    @Test
    public void testVaciarMonedero() {
        System.out.println("vaciarMonedero");
        Monedero m = new Monedero();
        m.insertarMoneda(Moneda.CENT20);
        m.insertarMoneda(Moneda.CENT50);
        m.insertarMoneda(Moneda.EURO1);
        m.insertarMoneda(Moneda.CENT1);
        m.insertarMoneda(Moneda.EURO2);
        m.vaciarMonedero();
        assertEquals(m.valorMonedero(), 0);
    }

}
