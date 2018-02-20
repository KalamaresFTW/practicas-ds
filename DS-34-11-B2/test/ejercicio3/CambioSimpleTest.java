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
public class CambioSimpleTest {

    public CambioSimpleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of calcularCambio method, of class CambioSimple.
     */
    @Test
    public void testCalcularCambio() {
        Cambio cs = new CambioSimple();
        Monedero m = new Monedero();
        m.insertarMoneda(Moneda.EURO2);
        m.insertarMoneda(Moneda.EURO1);
        assertEquals(cs.calcularCambio(m, 50).valorMonedero(), 200);
    }

}
