/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import modelo.Operando;
import modelo.calculadora.Calculadora;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesBinarias.Suma;
import modelo.operacionesUnarias.Cuadrado;
import modelo.operacionesUnarias.OperacionUnaria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class IntroduciendoPrimerOperandoTest {

    public IntroduciendoPrimerOperandoTest() {
    }

    /**
     * Test of getInstance method, of class IntroduciendoPrimerOperando.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EstadoCalculadora expResult = IntroduciendoPrimerOperando.getInstance();
        EstadoCalculadora result = IntroduciendoPrimerOperando.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of introducirOperando method, of class IntroduciendoPrimerOperando.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");
        Operando o = new Operando("3.0");
        Calculadora c = new Calculadora();
        
        c.introducirOperando(o);
        assertEquals(c.getOp1(), o);
        assertEquals(c.getEstado(), IntroduciendoPrimerOperando.getInstance());
        
        o = new Operando ("123");
        
        c.introducirOperando(o);
        assertEquals(c.getOp1(), o);
        assertEquals(c.getEstado(), IntroduciendoPrimerOperando.getInstance());
    }

    /**
     * Test of introducirOperadorBinario method, of class
     * IntroduciendoPrimerOperando.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");
        OperacionBinaria ob = Suma.getInstance();
        Calculadora c = new Calculadora();
        
        c.introducirOperadorBinario(ob);
        assertEquals(c.getOb(), ob);
        assertEquals(c.getEstado(), IntroducidaOperacionBinaria.getInstance());
    }

    /**
     * Test of introducirOperadorUnario method, of class
     * IntroduciendoPrimerOperando.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");
        OperacionUnaria ou = Cuadrado.getInstance();
        Calculadora c = new Calculadora();
        
        c.introducirOperadorUnario(ou);
        assertEquals(c.getOu(), ou);
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
        
        
    }

    /**
     * Test of mostrarResultado method, of class IntroduciendoPrimerOperando.
     */   @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");
        Calculadora c = new Calculadora();
        
        c.introducirOperando(new Operando("1.0"));
        c.introducirOperadorBinario(Suma.getInstance());
        c.introducirOperando(new Operando("2.0"));
        c.mostrarResultado();
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
        
        c.introducirOperando(new Operando("8.0"));
        c.mostrarResultado();
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
        assertEquals(c.getOp1(), new Operando("10.0"));
        
        c.setOp2(null);
        c.setOb(null);
        c.mostrarResultado();
    }

    /**
     * Test of toString method, of class IntroduciendoPrimerOperando.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Calculadora c = new Calculadora();
        
        assertEquals(c.getEstado().toString(), "Introducidendo Primer Operando");
    }

}
