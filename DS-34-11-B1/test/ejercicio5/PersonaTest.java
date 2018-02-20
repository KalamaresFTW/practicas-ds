package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "Pepito";
        String result = p.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellido1 method, of class Persona.
     */
    @Test
    public void testGetApellido1() {
        System.out.println("getApellido1");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "Fernández";
        String result = p.getApellido1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellido2 method, of class Persona.
     */
    @Test
    public void testGetApellido2() {
        System.out.println("getApellido2");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "Domínguez";
        String result = p.getApellido2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDni method, of class Persona.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "1";
        String result = p.getDni();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "abc";
        String result = p.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        String expResult = "123";
        String result = p.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        p.setDireccion("cba");
        assertEquals(p.getDireccion(),"cba");
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        Cliente p = new Cliente("Pepito", "Fernández", "Domínguez", "1", "abc",
                "123", "02");
        p.setTelefono("321");
        assertEquals(p.getTelefono(),"321");
    }
    
    /**
     * Test of toString method, of class Persona
     */
    @Test
    public void testToString(){
        System.out.println("toString");
        Persona p = new Cliente("Pepito", "Fernández", "Domínguez",
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
        assertEquals(p.toString(),expResult);
    }
    
    @Test
    public void testEquals(){
        System.out.println("equals");
        Persona p = new Cliente("Pepito", "Fernández", "Domínguez",
                "35123645-R", "rúa Nonseiqué", "986541232", "312", 112);
        Persona p1 = new Cliente("Juanito", "González", "Ramírez",
                "35123645-R", "rúa Nonseiqué", "986541232", "312", 112);
        Persona p2 = new Cliente("Pepito", "Fernández", "Domínguez",
                "35123645-S", "rúa Nonseiqué", "986541232", "312", 112);
        assertTrue(p.equals(p));
        assertFalse(p.equals(null));
        assertFalse(p.equals(new String()));
        assertTrue(p.equals(p1));
        assertFalse(p.equals(p2));
    }
    
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Persona p = new Cliente("Pepito", "Fernández", "Domínguez",
                "35123645-R", "rúa Nonseiqué", "986541232", "312", 112);
        Persona p1 = new Cliente("Juanito", "González", "Ramírez",
                "35123645-R", "rúa Nonseiqué", "986541232", "312", 112);
        Persona p2 = new Cliente("Pepito", "Fernández", "Domínguez",
                "35123645-S", "rúa Nonseiqué", "986541232", "312", 112);
        assertEquals(p.hashCode(),p1.hashCode());
        assertNotEquals(p.hashCode(),p2.hashCode());
    }
////  ??????
//    public class PersonaImpl extends Persona {
//
//        public PersonaImpl() {
//            super("", "", "", "", "", "");
//        }
//    }
//    
}
