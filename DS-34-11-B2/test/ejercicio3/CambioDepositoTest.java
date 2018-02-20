package ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class CambioDepositoTest {

    public CambioDepositoTest() {
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

    @Test
    public void testCalcularCambio() {
        System.out.println("calcularCambio");
        Cambio cd = new CambioDeposito();
        Monedero m = new Monedero();
        m.insertarMoneda(Moneda.EURO1);
        m.insertarMoneda(Moneda.EURO1);
        assertEquals(cd.calcularCambio(m, 150).valorMonedero(), 50);

    }

}
