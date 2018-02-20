package ejercicio1.comparadores;

import ejercicio1.Coche;
import java.util.Comparator;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ComparadorMarcaModelo implements Comparator<Coche> {

    @Override
    public int compare(Coche c1, Coche c2) {
        String s1 = c1.getMarca() + c1.getModelo();
        String s2 = c2.getMarca() + c2.getModelo();
        return (s1.toLowerCase()).compareTo(s2.toLowerCase());
    }

}
