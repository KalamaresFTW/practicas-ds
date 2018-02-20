package ejercicio1.comparadores;

import ejercicio1.Coche;
import java.util.Comparator;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ComparadorBastidor implements Comparator<Coche>{

    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.compareTo(c2);
    }
}
