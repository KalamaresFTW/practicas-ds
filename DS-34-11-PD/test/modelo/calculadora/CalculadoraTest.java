/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora;

import modelo.Operando;
import modelo.calculadora.estados.IntroducidaOperacionBinaria;
import modelo.calculadora.estados.IntroduciendoPrimerOperando;
import modelo.calculadora.estados.MostrandoResultado;
import modelo.operacionesBinarias.Suma;
import modelo.operacionesUnarias.Cuadrado;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CalculadoraTest {

    Calculadora c;
    Operando o1;
    Operando o2;
    
    public CalculadoraTest() {
    }

    @Before
    public void setUp() {
        c = new Calculadora();
        o1 = new Operando("0.0");
        o2 = new Operando("2.0");
    }

    /**
     * Test of introducirOperando method, of class Calculadora.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");

        c.introducirOperando(o1);
        assertEquals(c.getOp1(), o1);
        assertEquals(c.getEstado(), IntroduciendoPrimerOperando.getInstance());
    }

    /**
     * Test of introducirOperadorBinario method, of class Calculadora.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");

        c.introducirOperadorBinario(Suma.getInstance());
        assertEquals(c.getOb(), Suma.getInstance());
        assertEquals(c.getEstado(), IntroducidaOperacionBinaria.getInstance());
    }

    /**
     * Test of introducirOperadorUnario method, of class Calculadora.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");

        c.introducirOperadorUnario(Cuadrado.getInstance());
        assertEquals(c.getOu(), Cuadrado.getInstance());
        assertEquals(c.getOp1(), o1);
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of mostrarResultado method, of class Calculadora.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");

        c.mostrarResultado();
        assertEquals(c.getOp1(), o1);
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of leerMemoria method, of class Calculadora.
     */
    @Test
    public void testLeerMemoria() {
        System.out.println("leerMemoria");

        assertEquals(c.leerMemoria(), o1);
    }

    /**
     * Test of escribirMemoria method, of class Calculadora.
     */
    @Test
    public void testEscribirMemoria() {
        System.out.println("escribirMemoria");

        c.escribirMemoria(new Operando("2.0"));
        assertEquals(c.leerMemoria(), new Operando("2.0"));
    }

    /**
     * Test of limpiarMemoria method, of class Calculadora.
     */
    @Test
    public void testLimpiarMemoria() {
        System.out.println("limpiarMemoria");

        c.limpiarMemoria();
        assertEquals(c.getMem().getDato(), o1);
    }

    /**
     * Test of sumarMemoria method, of class Calculadora.
     */
    @Test
    public void testSumarMemoria() {
        System.out.println("sumarMemoria");

        c.sumarMemoria(new Operando("1.0"));
        assertEquals(c.getMem().getDato(), new Operando("1.0"));
    }

    /**
     * Test of restarMemoria method, of class Calculadora.
     */
    @Test
    public void testRestarMemoria() {
        System.out.println("restarMemoria");

        c.restarMemoria(new Operando("1.0"));
        assertEquals(c.getMem().getDato(), new Operando("-1.0"));
    }

    /**
     * Test of limpiarPantalla method, of class Calculadora.
     */
    @Test
    public void testLimpiarPantalla() {
        System.out.println("limpiarPantalla");

        c.limpiarPantalla();
        assertEquals(c.getOp1(), o1);
    }

    /**
     * Test of resetear method, of class Calculadora.
     */
    @Test
    public void testResetear() {
        System.out.println("resetear");
        c.escribirMemoria(new Operando("1.1"));
        c.resetear();
        assertEquals(c.getMem().getDato(), o1);
    }

    /**
     * Test of getEstado method, of class Calculadora.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        assertEquals(c.getEstado(), IntroduciendoPrimerOperando.getInstance());
    }

    /**
     * Test of setEstado method, of class Calculadora.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        c.setEstado(MostrandoResultado.getInstance());
        assertEquals(c.getEstado(), MostrandoResultado.getInstance());
    }

    /**
     * Test of getMem method, of class Calculadora.
     */
    @Test
    public void testGetMem() {
        System.out.println("getMem");
        assertEquals(c.getMem().getDato(), o1);
    }

    /**
     * Test of setMem method, of class Calculadora.
     */
    @Test
    public void testSetMem() {
        System.out.println("setMem");
        Memoria m2 = new Memoria();
        c.setMem(m2);
        assertEquals(c.getMem().getDato(), o1);

    }

    /**
     * Test of getOb method, of class Calculadora.
     */
    @Test
    public void testGetOb() {
        System.out.println("getOb");
        assertEquals(c.getOb(), null);
    }

    /**
     * Test of setOb method, of class Calculadora.
     */
    @Test
    public void testSetOb() {
        System.out.println("setOb");
        c.setOb(Suma.getInstance());
        assertEquals(c.getOb(), Suma.getInstance());
    }

    /**
     * Test of getOu method, of class Calculadora.
     */
    @Test
    public void testGetOu() {
        System.out.println("getOu");
        assertEquals(c.getOu(), null);
    }

    /**
     * Test of setOu method, of class Calculadora.
     */
    @Test
    public void testSetOu() {
        System.out.println("setOu");
        c.setOu(Cuadrado.getInstance());
        assertEquals(c.getOu(), Cuadrado.getInstance());
    }

    /**
     * Test of getOp1 method, of class Calculadora.
     */
    @Test
    public void testGetOp1() {
        System.out.println("getOp1");
        c.introducirOperando(o1);
        assertEquals(c.getOp1(), o1);
    }

    /**
     * Test of setOp1 method, of class Calculadora.
     */
    @Test
    public void testSetOp1() {
        System.out.println("setOp1");
        c.setOp1(new Operando("1.0"));
        assertEquals(c.getOp1(), new Operando("1.0"));
    }

    /**
     * Test of getOp2 method, of class Calculadora.
     */
    @Test
    public void testGetOp2() {
        System.out.println("getOp2");
        c.introducirOperando(o1);
        c.introducirOperadorBinario(Suma.getInstance());
        c.introducirOperando(new Operando("2.0"));
        assertEquals(c.getOp2(), new Operando("2.0"));
    }

    /**
     * Test of setOp2 method, of class Calculadora.
     */
    @Test
    public void testSetOp2() {
        System.out.println("setOp2");
        c.introducirOperando(o1);
        c.introducirOperadorBinario(Suma.getInstance());
        c.setOp2(new Operando("2.0"));
        assertEquals(c.getOp2(), new Operando("2.0"));
    }

    /**
     * Test of toString method, of class Calculadora.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(c.toString(),"Calculadora: Memoria: Vacía dato = 0, ob=null, op1=0, op2=0, estado=Introducidendo Primer Operando");
    }

}
