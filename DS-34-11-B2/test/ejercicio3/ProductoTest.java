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
public class ProductoTest {
    
    public ProductoTest() {
    }

    /**
     * Test of getValor method, of class Producto.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Producto p = new Producto(100);
        Producto p2 = new Producto(100);
        assertEquals(p.getValor(),p2.getValor());
    }
    
}
