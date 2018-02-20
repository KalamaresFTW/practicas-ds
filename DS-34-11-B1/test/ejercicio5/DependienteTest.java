package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class DependienteTest {
    
    public DependienteTest() {
    }

    /**
     * Test of getEspecialidad method, of class Dependiente.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Dependiente t1 = new Dependiente("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "especialito");
        assertEquals(t1.getEspecialidad(),"especialito");
    }
    /**
     * Test of testToString method, of class Dependiente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dependiente d = new Dependiente("Pepito", "Fernández", "Domínguez",
                "35123645-R", "rúa Nonseiqué", "986541232",
                "321654987", 349.95, Turno.NOCHE,
                "especialito");
        String expResult = "Persona:"
                + "\n\tNombre: Pepito"
                + "\n\tApellidos: Fernández Domínguez"
                + "\n\tDNI: 35123645-R"
                + "\n\tDirección: rúa Nonseiqué"
                + "\n\tTeléfono: 986541232"
                + "\nTrabajador:"
                + "\n\tNSS: 321654987"
                + "\n\tSalario: 349.95"
                + "\n\tTurno: NOCHE"
                + "\nDependiente:"
                + "\n\tEspecialidad: especialito";
        assertEquals(d.toString(), expResult);
        
    }
    
}
