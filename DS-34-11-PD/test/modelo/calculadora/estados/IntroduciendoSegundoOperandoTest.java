/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import modelo.Operando;
import modelo.calculadora.Calculadora;
import modelo.operacionesBinarias.Multiplicacion;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesBinarias.Suma;
import modelo.operacionesUnarias.OperacionUnaria;
import modelo.operacionesUnarias.Opuesta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class IntroduciendoSegundoOperandoTest {

    Operando o;
    Operando o2;
    Calculadora c;

    public IntroduciendoSegundoOperandoTest() {
    }

    @Before
    public void setUp() {
        o = new Operando("3.0");
        o2 = new Operando("4.5");
        c = new Calculadora();
        c.introducirOperando(o);
        c.introducirOperadorBinario(Suma.getInstance());
        c.introducirOperando(o2);
    }

    /**
     * Test of getInstance method, of class IntroduciendoSegundoOperando.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoCalculadora expResult = IntroduciendoSegundoOperando.getInstance();
        EstadoCalculadora result = IntroduciendoSegundoOperando.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of introducirOperando method, of class IntroduciendoSegundoOperando.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");
        Operando o3 = new Operando("-5.0");

        c.introducirOperando(o3);
        assertEquals(c.getOp1(), o);
        assertEquals(c.getOp2(), o3);
        assertEquals(c.getEstado(), IntroduciendoSegundoOperando.getInstance());

    }

    /**
     * Test of introducirOperadorBinario method, of class
     * IntroduciendoSegundoOperando.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");
        OperacionBinaria ob = Multiplicacion.getInstance();
        
        c.introducirOperadorBinario(ob);
        assertEquals(c.getOp1(),new Operando("7.5"));
        assertEquals(c.getOb(), ob);
        assertEquals(c.getEstado(), IntroducidaOperacionBinaria.getInstance());
    }

    /**
     * Test of introducirOperadorUnario method, of class
     * IntroduciendoSegundoOperando.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");
        OperacionUnaria ou = Opuesta.getInstance();
        
        c.introducirOperadorUnario(ou);
        assertEquals(c.getOp1(),o);
        assertEquals(c.getOp2(),Opuesta.getInstance().operar(o2));
        assertEquals(c.getEstado(), IntroduciendoSegundoOperando.getInstance());
    }

    /**
     * Test of mostrarResultado method, of class IntroduciendoSegundoOperando.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");
        
        c.mostrarResultado();
        assertEquals(c.getOp1(), new Operando("7.5"));
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of toString method, of class IntroduciendoSegundoOperando.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(c.getEstado().toString(), "Introduciendo Segundo Operando");
    }

}
