/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.comparadores;

import ejercicio1.Coche;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ComparadorBastidorTest {
    Coche coche1 = new Coche(1234, "Lamark", "model 1", 1000, 5000, 450, 150);
    Coche coche2 = new Coche(1234, "Tesla", "S", 10000, 5000, 450, 150);
    Coche coche3 = new Coche(5678, "Tesla", "X",10000, 6000, 500, 80);
    
    /**
     * Test of compare method, of class ComparadorBastidor.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        ComparadorBastidor comp = new ComparadorBastidor();
        assertTrue(comp.compare(coche1,coche2) ==0);
        assertTrue(comp.compare(coche3, coche2) > 0);
        assertFalse(comp.compare(coche1,coche3)>0);
    }
    
}
