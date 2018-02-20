/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author usuario
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({modelo.calculadora.estados.EstadoCalculadoraTest.class, modelo.calculadora.estados.IntroduciendoSegundoOperandoTest.class, modelo.calculadora.estados.IntroducidaOperacionBinariaTest.class, modelo.calculadora.estados.MostrandoResultadoTest.class, modelo.calculadora.estados.IntroduciendoPrimerOperandoTest.class})
public class EstadosSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
