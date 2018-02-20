package modelo.calculadora.estadosMemoria;

import modelo.Operando;
import modelo.calculadora.Memoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class VaciaTest {

    public VaciaTest() {
    }

    /**
     * Test of getInstance method, of class Vacia.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoMemoria expResult = Vacia.getInstance();
        EstadoMemoria result = Vacia.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of leerMemoria method, of class Vacia.
     */
    @Test
    public void testLeerMemoria() {
        System.out.println("leerMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();
        assertEquals(new Operando("0."), e.leerMemoria(m));
    }

    /**
     * Test of escribirMemoria method, of class Vacia.
     */
    @Test
    public void testEscribirMemoria() {
        System.out.println("escribirMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.escribirMemoria(new Operando("10.0"), m);
        assertEquals(m.getDato(), new Operando("10.0"));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of limpiarMemoria method, of class Vacia.
     */
    @Test
    public void testLimpiarMemoria() {
        System.out.println("limpiarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.limpiarMemoria(m);
        assertEquals(m.getDato(), new Operando("0.0"));
        assertEquals(Vacia.getInstance(), m.getEstado());
    }

    /**
     * Test of sumarMemoria method, of class Vacia.
     */
    @Test
    public void testSumarMemoria() {
        System.out.println("sumarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.sumarMemoria(new Operando("1."), m);
        assertEquals(m.getDato(), new Operando("1.0"));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of restarMemoria method, of class Vacia.
     */
    @Test
    public void testRestarMemoria() {
        System.out.println("restarMemoria");
        Memoria m = new Memoria();
        EstadoMemoria e = Vacia.getInstance();

        e.restarMemoria(new Operando("1."), m);
        assertEquals(m.getDato(), new Operando("-1."));
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of toString method, of class Vacia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EstadoMemoria e = Vacia.getInstance();
        assertEquals("Vacía",e.toString());
    }

}
