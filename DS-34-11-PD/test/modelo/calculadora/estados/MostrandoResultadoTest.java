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
import modelo.operacionesUnarias.OperacionUnaria;
import modelo.operacionesUnarias.Opuesta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class MostrandoResultadoTest {

    Calculadora c;
    Operando o;
    Operando o2;

    public MostrandoResultadoTest() {
    }

    @Before
    public void setUp() {
        c = new Calculadora();
        o = new Operando("3.0");
        o2 = new Operando("4.5");
        c.introducirOperando(o);
        c.introducirOperadorBinario(Suma.getInstance());
        c.introducirOperando(o2);
        c.mostrarResultado();
    }

    /**
     * Test of getInstance method, of class MostrandoResultado.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoCalculadora expResult = MostrandoResultado.getInstance();
        EstadoCalculadora result = MostrandoResultado.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of introducirOperando method, of class MostrandoResultado.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");
        Operando o3 = new Operando("125");

        c.introducirOperando(o3);
        assertEquals(c.getOp1(), o3);
        assertEquals(c.getOp2(), o2);
        assertEquals(c.getEstado(), IntroduciendoPrimerOperando.getInstance());
    }

    /**
     * Test of introducirOperadorBinario method, of class MostrandoResultado.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");
        OperacionBinaria ob = Resta.getInstance();

        c.introducirOperadorBinario(ob);
        assertEquals(c.getOp1(), new Operando("7.5"));
        assertEquals(c.getOp2(), o2);
        assertEquals(c.getOb(), ob);
        assertEquals(c.getEstado(), IntroducidaOperacionBinaria.getInstance());
    }

    /**
     * Test of introducirOperadorUnario method, of class MostrandoResultado.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");
        OperacionUnaria ou = Opuesta.getInstance();
        
        c.introducirOperadorUnario(ou);
        assertEquals(c.getOp1(),new Operando("-7.5"));
        assertEquals(c.getOp2(),o2);
        assertEquals(c.getOu(),ou);
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of mostrarResultado method, of class MostrandoResultado.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");
        
        c.mostrarResultado();
        assertEquals(c.getOp1(), new Operando("12.0"));
        assertEquals(c.getOp2(), o2);
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
        
        c.setOb(null);
        c.mostrarResultado();
    }

    /**
     * Test of toString method, of class MostrandoResultado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(c.getEstado().toString(), "Mostrando Resultado");
    }

}
