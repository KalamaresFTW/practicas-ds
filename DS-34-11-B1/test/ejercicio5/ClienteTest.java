package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    /**
     * Test of comprar method, of class Cliente.
     */
    @Test
    public void testComprar() {
        System.out.println("comprar");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        p.comprar();
        p.comprar();
        assertEquals(p.getNumCompras(),2);
    }

    /**
     * Test of getDescuento method, of class Cliente.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02",100);
        assertEquals(p.getDescuento(),0.01D,0.001D);
    }

    /**
     * Test of getNumCompras method, of class Cliente.
     */
    @Test
    public void testGetNumCompras() {
        System.out.println("getNumCompras");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        for (int i = 0; i < 100; i++) {
            p.comprar();
        }
        p.comprar();
        assertEquals(p.getNumCompras(),101);
    }
    
    /**
     * Test of setNumCompras method, of class Cliente.
     */
    @Test
    public void testSetNumCompras() {
        System.out.println("setNumCompras");
        Cliente p =new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02", 150);
        p.setNumCompras(10);
        assertEquals(p.getNumCompras(),10);
    }

    /**
     * Test of getCodCliente method, of class Cliente.
     */
    @Test
    public void testGetCodCliente() {
        System.out.println("getCodCliente");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        assertEquals(p.getCodCliente(),"02");
    }
    
    /**
     * Test of setNumCompras method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente c = new Cliente("Pepito", "Fernández", "Domínguez",
                "35123645-R", "rúa Nonseiqué", "986541232", "312", 112);
        String expResult = "Persona:"
                + "\n\tNombre: Pepito"
                + "\n\tApellidos: Fernández Domínguez"
                + "\n\tDNI: 35123645-R"
                + "\n\tDirección: rúa Nonseiqué"
                + "\n\tTeléfono: 986541232"
                + "\nCliente:"
                + "\n\tCódigo de cliente: 312"
                + "\n\tNúmero de compras: 112";
        assertEquals(c.toString(),expResult);
    }
}
