/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 * @author p.costa          (Pablo Costa Oubiña)
 */
public class MonederoTest {
    
    public MonederoTest() {
    }
    
    @Test
    public void testInsertarMoneda() {
        System.out.println("insertarMoneda");
        Monedero mdr = new Monedero();
        assertTrue(mdr.insertarMoneda(Moneda.EURO2));
    }

    /**
     * Test of extraerMoneda method, of class Monedero.
     */
    @Test
    public void testExtraerMoneda() {
        System.out.println("extraerMoneda");
        Monedero mdr = new Monedero();
        mdr.insertarMoneda(Moneda.EURO2);
        Moneda m = mdr.extraerMoneda(Moneda.EURO1);
        assertEquals(m,null);
        m = mdr.extraerMoneda(Moneda.EURO2);
        assertEquals(m,Moneda.EURO2);    
    }

    /**
     * Test of contarMonedas method, of class Monedero.
     */
    @Test
    public void testContarMonedas_0args() {
        System.out.println("contarMonedas()");
        Monedero mdr = new Monedero();
        assertEquals(mdr.contarMonedas(),0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        assertEquals(mdr.contarMonedas(),3);
    }

    /**
     * Test of contarMonedas method, of class Monedero.
     */
    @Test
    public void testContarMonedas_Moneda() {
        System.out.println("contarMonedas");
        Monedero mdr = new Monedero();
        assertEquals(mdr.contarMonedas(Moneda.EURO1),0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO2);
        assertEquals(mdr.contarMonedas(Moneda.EURO2),3);
        mdr.insertarMoneda(Moneda.EURO1);
        assertEquals(mdr.contarMonedas(Moneda.EURO1),1);
    }

    /**
     * Test of valorMonedero method, of class Monedero.
     */
    @Test
    public void testValorMonedero() {
        System.out.println("valorMonedero");
        Monedero mdr = new Monedero();
        assertEquals(mdr.valorMonedero(),0);
        mdr.insertarMoneda(Moneda.EURO2);
        mdr.insertarMoneda(Moneda.EURO1);
        mdr.insertarMoneda(Moneda.CENT50);
        mdr.insertarMoneda(Moneda.CENT20);
        mdr.insertarMoneda(Moneda.CENT10);
        mdr.insertarMoneda(Moneda.CENT5);
        mdr.insertarMoneda(Moneda.CENT2);
        mdr.insertarMoneda(Moneda.CENT1);
        assertEquals(mdr.valorMonedero(),388);
    }
    
}
