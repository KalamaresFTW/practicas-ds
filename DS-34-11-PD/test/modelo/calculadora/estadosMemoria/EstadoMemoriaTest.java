package modelo.calculadora.estadosMemoria;

import modelo.Operando;
import modelo.calculadora.Memoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class EstadoMemoriaTest {
    
    public EstadoMemoriaTest() {
    }

    /**
     * Test of leerMemoria method, of class EstadoMemoria.
     */
    @Test
    public void testLeerMemoria() {
        System.out.println("leerMemoria");
        Memoria m = null;
        EstadoMemoria instance = new EstadoMemoriaImpl();
        Operando expResult = null;
        Operando result = instance.leerMemoria(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribirMemoria method, of class EstadoMemoria.
     */
    @Test
    public void testEscribirMemoria() {
        System.out.println("escribirMemoria");
        Operando nuevoDato = null;
        Memoria m = null;
        EstadoMemoria instance = new EstadoMemoriaImpl();
        instance.escribirMemoria(nuevoDato, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarMemoria method, of class EstadoMemoria.
     */
    @Test
    public void testLimpiarMemoria() {
        System.out.println("limpiarMemoria");
        Memoria m = null;
        EstadoMemoria instance = new EstadoMemoriaImpl();
        instance.limpiarMemoria(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarMemoria method, of class EstadoMemoria.
     */
    @Test
    public void testSumarMemoria() {
        System.out.println("sumarMemoria");
        Operando o = null;
        Memoria m = null;
        EstadoMemoria instance = new EstadoMemoriaImpl();
        instance.sumarMemoria(o, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restarMemoria method, of class EstadoMemoria.
     */
    @Test
    public void testRestarMemoria() {
        System.out.println("restarMemoria");
        Operando o = null;
        Memoria m = null;
        EstadoMemoria instance = new EstadoMemoriaImpl();
        instance.restarMemoria(o, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EstadoMemoriaImpl implements EstadoMemoria {

        public Operando leerMemoria(Memoria m) {
            return null;
        }

        public void escribirMemoria(Operando nuevoDato, Memoria m) {
        }

        public void limpiarMemoria(Memoria m) {
        }

        public void sumarMemoria(Operando o, Memoria m) {
        }

        public void restarMemoria(Operando o, Memoria m) {
        }
    }
    
}
