/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class MonedaTest {
    
    public MonedaTest() {
    }
    
    @Test
    public void testValues() {
        System.out.println("values");
        Moneda[] expResult = new Moneda [8];
            expResult[0] = Moneda.EURO2;
            expResult[1] = Moneda.EURO1;
            expResult[2] = Moneda.CENT50;
            expResult[3] = Moneda.CENT20;
            expResult[4] = Moneda.CENT10;
            expResult[5] = Moneda.CENT5;
            expResult[6] = Moneda.CENT2;
            expResult[7] = Moneda.CENT1;
        Moneda[] result = Moneda.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Moneda.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "CENT1";
        Moneda expResult = Moneda.CENT1;
        Moneda result = Moneda.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class Moneda.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor()");
        Moneda instance = Moneda.EURO1;
        int expResult = 100;
        int result = instance.getValor();
        assertEquals(expResult, result);
    }
    
}
