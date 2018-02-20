package ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class MaquinaElectronicaTest {
    
    MaquinaElectronica maquina;
    Monedero monedas;
    Cambio cambioSimple, cambioDeposito;
    Producto producto;
    
    public MaquinaElectronicaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        monedas = new Monedero();
        monedas.insertarMoneda(Moneda.EURO1);
        monedas.insertarMoneda(Moneda.CENT50);
        monedas.insertarMoneda(Moneda.CENT20);
        cambioDeposito = new CambioDeposito();
        cambioSimple = new CambioSimple();
        producto = new Producto(165);
        
    }
    
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of comprar method, of class MaquinaElectronica.
     */
    @Test
    public void testComprar() {
        System.out.println("comprar");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        assertEquals(maquina.comprar().valorMonedero(), 0);
        maquina.setCambio(cambioDeposito);
        //Volvemos a llenar el monedero
        monedas.insertarMoneda(Moneda.EURO1);
        monedas.insertarMoneda(Moneda.CENT50);
        monedas.insertarMoneda(Moneda.CENT20);
        maquina.setMonedas(monedas);
        assertEquals(maquina.comprar().valorMonedero(), 5);
        
    }

    /**
     * Test of cancelar method, of class MaquinaElectronica.
     */
    @Test
    public void testCancelar() {
        System.out.println("cancelar");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        assertEquals(maquina.cancelar().valorMonedero(), 170);
        assertEquals(maquina.getMonedas().valorMonedero(), 0);
    }

    /**
     * Test of getMonedas method, of class MaquinaElectronica.
     */
    @Test
    public void testGetMonedas() {
        System.out.println("getMonedas");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        assertEquals(maquina.getMonedas().valorMonedero(), 170);
    }

    /**
     * Test of setMonedas method, of class MaquinaElectronica.
     */
    @Test
    public void testSetMonedas() {
        System.out.println("setMonedas");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        Monedero m2 = new Monedero();
        m2.insertarMoneda(Moneda.CENT1);
        maquina.setMonedas(m2);
        assertEquals(maquina.getMonedas().valorMonedero(), 1);
    }

    /**
     * Test of getCambio method, of class MaquinaElectronica.
     */
    @Test
    public void testGetCambio() {
        System.out.println("getCambio");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        maquina.setCambio(cambioDeposito);
        assertEquals(maquina.getCambio(), cambioDeposito);
    }

    /**
     * Test of setCambio method, of class MaquinaElectronica.
     */
    @Test
    public void testSetCambio() {
        System.out.println("setCambio");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        maquina.setCambio(cambioDeposito);
        assertEquals(maquina.getCambio(), cambioDeposito);
    }

    /**
     * Test of getProducto method, of class MaquinaElectronica.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        assertEquals(maquina.getProducto(), producto);
    }

    /**
     * Test of setProducto method, of class MaquinaElectronica.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        maquina = new MaquinaElectronica(monedas, cambioSimple, producto);
        Producto producto2 = new Producto(151);
        maquina.setProducto(producto2);
        assertEquals(maquina.getProducto(), producto2);
    }
    
}
