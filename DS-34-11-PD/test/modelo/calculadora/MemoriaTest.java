/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora;

import modelo.Operando;
import modelo.calculadora.estadosMemoria.EstadoMemoria;
import modelo.calculadora.estadosMemoria.Llena;
import modelo.calculadora.estadosMemoria.Vacia;
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
public class MemoriaTest {

    Memoria m;
    Operando cero = new Operando("0.0");

    public MemoriaTest() {
    }

    @Before
    public void setUp() {
        m = new Memoria();
    }

    /**
     * Test of leerMemoria method, of class Memoria.
     */
    @Test
    public void testLeerMemoria() {
        System.out.println("leerMemoria");
        assertEquals(m.leerMemoria(), cero);
        m.escribirMemoria(new Operando("3.4"));
        assertEquals(m.leerMemoria(), new Operando("3.4"));
    }

    /**
     * Test of escribirMemoria method, of class Memoria.
     */
    @Test
    public void testEscribirMemoria() {
        System.out.println("escribirMemoria");
        m.escribirMemoria(new Operando("3.4"));
        assertEquals(m.getDato(), new Operando("3.4"));
        m.escribirMemoria(new Operando("5.0"));
        assertEquals(m.getDato(), new Operando("5.0"));
    }

    /**
     * Test of limpiarMemoria method, of class Memoria.
     */
    @Test
    public void testLimpiarMemoria() {
        System.out.println("limpiarMemoria");
        m.limpiarMemoria();
        assertEquals(m.getDato(), cero);

        m.escribirMemoria(new Operando("5.5"));
        m.limpiarMemoria();
        assertEquals(m.getDato(), cero);
    }

    /**
     * Test of sumarMemoria method, of class Memoria.
     */
    @Test
    public void testSumarMemoria() {
        System.out.println("sumarMemoria");
        
        m.sumarMemoria(new Operando("1.0"));
        assertEquals(m.getDato(), new Operando("1.0"));
        
        m.sumarMemoria(new Operando("1.0"));
        assertEquals(m.getDato(), new Operando("2.0"));
    }

    /**
     * Test of restarMemoria method, of class Memoria.
     */
    @Test
    public void testRestarMemoria() {
        System.out.println("restarMemoria");
        
        m.restarMemoria(new Operando("1.0"));
        assertEquals(m.getDato(), new Operando("-1.0"));
        
        m.restarMemoria(new Operando("-2.0"));
        assertEquals(m.getDato(), new Operando("1.0"));
    }

    /**
     * Test of getDato method, of class Memoria.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        
        m.escribirMemoria(new Operando("1.1"));
        assertEquals(m.getDato(), new Operando("1.1"));
    }

    /**
     * Test of setDato method, of class Memoria.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        
        m.setDato(new Operando("1.1"));
        assertEquals(m.getDato(), new Operando("1.1"));
        assertEquals(m.getEstado(), Vacia.getInstance());
    }

    /**
     * Test of setEstado method, of class Memoria.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        
        m.setEstado(Llena.getInstance());
        assertEquals(m.getDato(), cero);
        assertEquals(m.getEstado(), Llena.getInstance());
    }

    /**
     * Test of getEstado method, of class Memoria.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        
        assertEquals(Vacia.getInstance(), m.getEstado());
        m.escribirMemoria(cero);
        assertEquals(Llena.getInstance(), m.getEstado());
    }

    /**
     * Test of toString method, of class Memoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(m.toString(),"Memoria: Vacía dato = 0");
    }

}
