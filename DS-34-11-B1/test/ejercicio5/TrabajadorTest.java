package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class TrabajadorTest {
    
    public TrabajadorTest() {
    }
    
    @Test
    public void testGetNSS(){
        System.out.println("getNSS");
        Dependiente t1 = new Dependiente("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "especialito");
        assertEquals(t1.getNSS(),"10");
    }
    /**
     * Test of getSalario method, of class Trabajador.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Dependiente t1 = new Dependiente("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "especialito");
        Dependiente t2 = new Dependiente("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.MAÑANA, "especialito");
        assertEquals(t1.getSalario(),499.95,0.01);
        assertEquals(t2.getSalario(),349.95,0.01);      
    }
    
    @Test
    public void testCambiarSalario(){
        System.out.println("cambiarSalario");
        Dependiente t1 = new Dependiente("Jose", "Fernández", "González", "1",
                "abc", "986", "12", 400.00, Turno.MAÑANA, "carnicero");
        t1.cambiarSalario(500.00);
        assertEquals(t1.getSalario(), 500.00, 0.01);
    }

    
    @Test
    public void testGetTurno(){
        System.out.println("getTurno");
        Dependiente t1 = new Dependiente("Jose", "Fernández", "González", "1",
                "abc", "986", "12", 400.00, Turno.MAÑANA, "carnicero");
        assertEquals(t1.getTurno(), Turno.MAÑANA);
    }
    
    /**
     * Test of cambiarTurno method, of class Trabajador.
     */
    @Test
    public void testCambiarTurno() {
        System.out.println("cambiarTurno");
        Dependiente t1 = new Dependiente("Pepito", "Fernández", "Domínguez", "1",
                "abc", "986", "10", 349.95, Turno.NOCHE, "especialito");
        t1.cambiarTurno(Turno.TARDE);
        assertEquals(t1.getTurno(),Turno.TARDE);
    }
    
    /**
     * Test of cambiarTurno method, of class Trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajador t = new Reponedor("Pepito", "Fernández", "Domínguez",
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
        assertEquals(t.toString(),expResult);
    }
    
////  ??????
//    public class TrabajadorImpl extends Trabajador {
//
//        public TrabajadorImpl() {
//            super("", "", "", "", "", "", "", 0.0, null);
//        }
//    }
//    
}
