package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 * @author p.costa (Pablo Costa Oubiña)
 */
public class UtilidadesFechaTest {

    @Test
    public void testEsBisiesto() {
        assertTrue(UtilidadesFecha.esBisiesto(-4));
        assertTrue(UtilidadesFecha.esBisiesto(0));
        assertTrue(UtilidadesFecha.esBisiesto(4));
        assertFalse(UtilidadesFecha.esBisiesto(100));
        assertTrue(UtilidadesFecha.esBisiesto(400));
        assertFalse(UtilidadesFecha.esBisiesto(2007));
        assertTrue(UtilidadesFecha.esBisiesto(2008));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiasMes() {
        assertEquals(31, UtilidadesFecha.diasMes(1, 4));
        assertEquals(29, UtilidadesFecha.diasMes(2, 4));
        assertEquals(28, UtilidadesFecha.diasMes(2, -5));
        assertEquals(31, UtilidadesFecha.diasMes(3, 4));
        assertEquals(30, UtilidadesFecha.diasMes(4, 4));
        assertEquals(31, UtilidadesFecha.diasMes(5, 4));
        assertEquals(30, UtilidadesFecha.diasMes(6, 4));
        assertEquals(31, UtilidadesFecha.diasMes(7, 4));
        assertEquals(31, UtilidadesFecha.diasMes(8, 4));
        assertEquals(30, UtilidadesFecha.diasMes(9, 4));
        assertEquals(31, UtilidadesFecha.diasMes(10, 4));
        assertEquals(30, UtilidadesFecha.diasMes(11, 4));
        assertEquals(31, UtilidadesFecha.diasMes(12, 4));
        UtilidadesFecha.diasMes(13, 5);
    }

    @Test
    public void testConvertirISO() {
        assertEquals("2001/01/32", UtilidadesFecha.convertirISO("32 de Enero de 2001"));
        assertEquals("2001/02/29", UtilidadesFecha.convertirISO("29 de Febrero de 2001"));
        assertEquals("2001/03/32", UtilidadesFecha.convertirISO("32 de Marzo de 2001"));
        assertEquals("2001/04/32", UtilidadesFecha.convertirISO("32 de Abril de 2001"));
        assertEquals("2000/05/50", UtilidadesFecha.convertirISO("50 de Mayo de 2000"));
        assertEquals("2000/06/00", UtilidadesFecha.convertirISO("00 de Junio de 2000"));
        assertEquals("2000/07/01", UtilidadesFecha.convertirISO("01 de Julio de 2000"));
        assertEquals("2000/08/25", UtilidadesFecha.convertirISO("25 de Agosto de 2000"));
        assertEquals("2000/09/99", UtilidadesFecha.convertirISO("99 de Septiembre de 2000"));
        assertEquals("2000/10/123", UtilidadesFecha.convertirISO("123 de Octubre de 2000"));
        assertEquals("2000/11/041", UtilidadesFecha.convertirISO("041 de Noviembre de 2000"));
        assertEquals("2000/12/24", UtilidadesFecha.convertirISO("24 de Diciembre de 2000"));
        assertEquals("2001/01/32", UtilidadesFecha.convertirISO("32 de enero de 2001"));
        assertEquals("2001/02/29", UtilidadesFecha.convertirISO("29 de febrero de 2001"));
        assertEquals("2001/03/32", UtilidadesFecha.convertirISO("32 de marzo de 2001"));
        assertEquals("2001/04/32", UtilidadesFecha.convertirISO("32 de abril de 2001"));
        assertEquals("2000/05/50", UtilidadesFecha.convertirISO("50 de mayo de 2000"));
        assertEquals("2000/06/00", UtilidadesFecha.convertirISO("00 de junio de 2000"));
        assertEquals("2000/07/01", UtilidadesFecha.convertirISO("01 de julio de 2000"));
        assertEquals("2000/08/25", UtilidadesFecha.convertirISO("25 de agosto de 2000"));
        assertEquals("2000/09/99", UtilidadesFecha.convertirISO("99 de septiembre de 2000"));
        assertEquals("2000/10/123", UtilidadesFecha.convertirISO("123 de octubre de 2000"));
        assertEquals("2000/11/041", UtilidadesFecha.convertirISO("041 de noviembre de 2000"));
        assertEquals("2000/12/24", UtilidadesFecha.convertirISO("24 de diciembre de 2000"));
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testConvertirISOException(){
        UtilidadesFecha.convertirISO("123 de Febererero de 1984");
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testConvertirISOnull(){
        UtilidadesFecha.convertirISO(null);
    }

    @Test
    public void testComprobarFechaISO() {
        assertTrue(UtilidadesFecha.comprobarFechaISO("2000/02/29"));
        assertFalse(UtilidadesFecha.comprobarFechaISO("2001/02/29"));
        assertFalse(UtilidadesFecha.comprobarFechaISO("2000/03/00"));
        assertFalse(UtilidadesFecha.comprobarFechaISO("1994/03/-1"));
        assertFalse(UtilidadesFecha.comprobarFechaISO("lagarto"));
    }

}
