package ejercicio1.comparadores;

import ejercicio1.Coche;
import java.util.Comparator;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ComparadorPrecio implements Comparator<Coche>{

    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.getPrecio() - c2.getPrecio();
    }
}
