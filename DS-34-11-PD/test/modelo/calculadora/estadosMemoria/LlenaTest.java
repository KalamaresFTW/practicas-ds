package modelo.calculadora.estadosMemoria;

import modelo.Operando;
import modelo.calculadora.Memoria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class LlenaTest {

    public LlenaTest() {
    }

    /**
     * Test of getInstance method, of class Llena.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoMemoria expResult = Llena.getInstance();
        EstadoMemoria result = Llena.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of leerMemoria method, of class Llena.
     */
    @Test
    public void testLeerMemoria() {
        System.out.println("leerMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Llena.getInstance();

        m.setDato(new Operando("13."));
        assertEquals(new Operando("13.0"), e.leerMemoria(m));
        m.setDato(new Operando("0.5"));
        assertEquals(new Operando("0.5"), e.leerMemoria(m));
    }

    /**
     * Test of escribirMemoria method, of class Llena.
     */
    @Test
    public void testEscribirMemoria() {
        System.out.println("escribirMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.escribirMemoria(new Operando("13.31"), m);
        assertEquals(m.getDato(), new Operando("13.31"));
        assertEquals(Llena.getInstance(), m.getEstado());

        e.escribirMemoria(new Operando("13.13"), m);
        assertEquals(m.getDato(), new Operando("13.13"));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of limpiarMemoria method, of class Llena.
     */
    @Test
    public void testLimpiarMemoria() {
        System.out.println("limpiarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Llena.getInstance();

        e.limpiarMemoria(m);
        assertEquals(m.getDato(), new Operando("0.0"));
        assertEquals(Vacia.getInstance(), m.getEstado());

    }

    /**
     * Test of restarMemoria method, of class Llena.
     */
    @Test
    public void testSumarMemoria() {
        System.out.println("restarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.sumarMemoria(new Operando("1.0"), m);
        assertTrue(m.getDato().equals(new Operando("1.0")));
        assertEquals(Llena.getInstance(), m.getEstado());
        
        e.sumarMemoria(new Operando("3.0"), m);
        assertEquals(m.getDato(), new Operando("3.0"));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of restarMemoria method, of class Llena.
     */
    @Test
    public void testRestarMemoria() {
        System.out.println("restarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.restarMemoria(new Operando("1.0"), m);
        assertEquals(m.getDato(), new Operando("-1.0"));
        assertEquals(Llena.getInstance(), m.getEstado());

        e.restarMemoria(new Operando("-3.0"), m);
        assertEquals(m.getDato(), new Operando("2.0"));
        assertEquals(Llena.getInstance(), m.getEstado());
        
        e.restarMemoria(new Operando("2.0"), m);
        assertEquals(m.getDato(), new Operando("0.0"));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of toString method, of class Llena.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EstadoMemoria e = Llena.getInstance();
        assertEquals("Llena", e.toString());
    }

}
