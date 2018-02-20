package ejercicio1;

import ejercicio1.comparadores.ComparadorPrecio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 */
public class Concesionario implements Comparator<Coche> {

    private final List<Coche> coches;

    public Concesionario() {
        this.coches = new ArrayList<>();
    }

    public void listar() {
        Collections.sort(coches, this);
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }

    public void listar(Comparator<Coche> c) {
        Collections.sort(coches, c);
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }

    public boolean insertarCoche(Coche c) {
        return coches.add(c);
    }

    public boolean eliminarCoche(Coche c) {
        return coches.remove(c);
    }

    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.compareTo(o2);
    }

}
