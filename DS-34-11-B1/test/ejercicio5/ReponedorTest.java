package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ReponedorTest {
    
    public ReponedorTest() {
    }

    /**
     * Test of getDatosEmpresa method, of class Reponedor.
     */
    @Test
    public void testGetDatosEmpresa() {
        System.out.println("getDatosEmpresa");
        Reponedor r = new Reponedor("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "Empresa Empresarial");
        assertEquals(r.getDatosEmpresa(),"Empresa Empresarial");
    }
    
    @Test
    public void testSetDatosEmpresa(){
        System.out.println("setDatosEmpresa");
        Reponedor r = new Reponedor("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "Empresa Empresarial");
        r.setDatosEmpresa("nuevos datos");
        assertEquals(r.getDatosEmpresa(),"nuevos datos");
    }
    
    @Test
    public void testToString(){
        System.out.println("toString");
        Reponedor r = new Reponedor("Pepito", "Fernández", "Domínguez",
                "35123645-R", "rúa Nonseiqué", "986541232",
                "321654987", 349.95, Turno.NOCHE,
                "Empresa Empresarial");
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
                + "\nReponedor:"
                + "\n\tDatos Empresa: Empresa Empresarial";
        System.out.println(expResult);
        assertEquals(r.toString(),expResult);
    }
}
