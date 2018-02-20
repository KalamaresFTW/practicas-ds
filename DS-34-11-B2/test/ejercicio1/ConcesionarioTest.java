/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.comparadores.ComparadorBastidor;
import java.util.Comparator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ConcesionarioTest {
    Coche coche1 = new Coche(1234, "Lamark", "model 1", 1000, 5, 450, 150);
    Coche coche2 = new Coche(1234, "Tesla", "S", 10000, 5000, 450, 150);
    Coche coche3 = new Coche(5678, "Tesla", "X",10000, 6000, 500, 80);
    Concesionario c = new Concesionario();
    /**
     * Test of listar method, of class Concesionario.
     */
    @Test
    public void testListar_0args() {
        System.out.println("listar");
        c.insertarCoche(coche1);
        c.insertarCoche(coche3);
        c.insertarCoche(coche2);
        c.listar();
        //???
    }

    /**
     * Test of listar method, of class Concesionario.
     */
    @Test
    public void testListar_Comparator() {
        System.out.println("listar");
        c.insertarCoche(coche1);
        c.insertarCoche(coche3);
        c.insertarCoche(coche2);
        Comparator comp = new ComparadorBastidor();
        c.listar(comp);
        //???
    }

    /**
     * Test of insertarCoche method, of class Concesionario.
     */
    @Test
    public void testInsertarCoche() {
        System.out.println("insertarCoche");
        assertTrue(c.insertarCoche(coche1));
        assertTrue(c.insertarCoche(coche3));
    }

    /**
     * Test of eliminarCoche method, of class Concesionario.
     */
    @Test
    public void testEliminarCoche() {
        System.out.println("eliminarCoche");
        c.insertarCoche(coche1);
        c.insertarCoche(coche2);
        assertTrue(c.eliminarCoche(coche1));
        assertFalse(c.eliminarCoche(coche3));
    }

    /**
     * Test of compare method, of class Concesionario.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        int result = c.compare(coche1, coche2);
        assertEquals(0, result);
        assertTrue(c.compare(coche1, coche3) < 0);
        assertFalse(c.compare(coche2, coche3) > 0);
    }
    
}
