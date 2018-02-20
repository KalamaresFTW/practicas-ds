/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import modelo.Operando;
import modelo.calculadora.Calculadora;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;
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
public class EstadoCalculadoraTest {
    
    public EstadoCalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of introducirOperando method, of class EstadoCalculadora.
     */
    @Test
    public void testIntroducirOperando() {
        System.out.println("introducirOperando");
        Operando o = null;
        Calculadora c = null;
        EstadoCalculadora instance = new EstadoCalculadoraImpl();
        instance.introducirOperando(o, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introducirOperadorBinario method, of class EstadoCalculadora.
     */
    @Test
    public void testIntroducirOperadorBinario() {
        System.out.println("introducirOperadorBinario");
        OperacionBinaria ob = null;
        Calculadora c = null;
        EstadoCalculadora instance = new EstadoCalculadoraImpl();
        instance.introducirOperadorBinario(ob, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introducirOperadorUnario method, of class EstadoCalculadora.
     */
    @Test
    public void testIntroducirOperadorUnario() {
        System.out.println("introducirOperadorUnario");
        OperacionUnaria ou = null;
        Calculadora c = null;
        EstadoCalculadora instance = new EstadoCalculadoraImpl();
        instance.introducirOperadorUnario(ou, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultado method, of class EstadoCalculadora.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");
        Calculadora c = null;
        EstadoCalculadora instance = new EstadoCalculadoraImpl();
        instance.mostrarResultado(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EstadoCalculadoraImpl implements EstadoCalculadora {

        public void introducirOperando(Operando o, Calculadora c) {
        }

        public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c) {
        }

        public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c) {
        }

        public void mostrarResultado(Calculadora c) {
        }
    }
    
}
