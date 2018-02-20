/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import modelo.Operando;
import modelo.calculadora.Calculadora;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesBinarias.Resta;
import modelo.operacionesBinarias.Suma;
import modelo.operacionesUnarias.Cuadrado;
import modelo.operacionesUnarias.OperacionUnaria;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author usuario
 */
public class IntroducidaOperacionBinariaTest {

    Operando o;
    Calculadora c;

    public IntroducidaOperacionBinariaTest() {
    }

    @Before
    public void setUp() throws Exception {
        o = new Operando("3.0");
        c = new Calculadora();
        c.introducirOperando(o);
        c.introducirOperadorBinario(Suma.getInstance());
    }

    /**
     * Test of getInstance method, of class IntroducidaOperacionBinaria.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoCalculadora expResult = IntroducidaOperacionBinaria.getInstance();
        EstadoCalculadora result = IntroducidaOperacionBinaria.getInstance();
        assertEquals(expResult, result);

    }

    /**
     * Test of introducirOperando method, of class IntroducidaOperacionBinaria.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");
        Operando o2 = new Operando("3.0");

        c.introducirOperando(o2);
        assertEquals(c.getOp1(), o);
        assertEquals(c.getOp2(), o2);
        assertEquals(c.getEstado(), IntroduciendoSegundoOperando.getInstance());
    }

    /**
     * Test of introducirOperadorBinario method, of class
     * IntroducidaOperacionBinaria.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");
        OperacionBinaria ob = Resta.getInstance();

        c.introducirOperadorBinario(ob);
        assertEquals(c.getOb(), ob);
        assertEquals(c.getEstado(), IntroducidaOperacionBinaria.getInstance());

    }

    /**
     * Test of introducirOperadorUnario method, of class
     * IntroducidaOperacionBinaria.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");
        OperacionUnaria ou = Cuadrado.getInstance();

        c.introducirOperadorUnario(ou);
        assertEquals(c.getOu(), ou);
        assertEquals(c.getEstado(), IntroduciendoSegundoOperando.getInstance());
    }

    /**
     * Test of mostrarResultado method, of class IntroducidaOperacionBinaria.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");

        c.mostrarResultado();
        assertEquals(c.getOp1(), new Operando("6.0"));
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of toString method, of class IntroducidaOperacionBinaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(c.getEstado().toString(), "Introducida Operación Binaria");
    }

}
