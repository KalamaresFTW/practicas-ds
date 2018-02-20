package ejercicio1.comparadores;

import ejercicio1.Coche;
import java.util.Comparator;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class ComparadorCilindrada implements Comparator<Coche>{

    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.getCaballos() - c2.getCaballos();
    }
    
}
