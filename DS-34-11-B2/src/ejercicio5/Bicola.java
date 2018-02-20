package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pablo
 * @param <T>
 */
public class Bicola<T> implements Iterable<T> {

    private final List<T> list;
    private boolean ordenada;

    /**
     * ordenada se inicializa a true para que si no se modifica su valor, el
     * iterador sea el por defecto (izquierda -> derecha). Si el valor de
     * ordenada pasa a false, el iterador que devolverá iterator() será inverso
     * (derecha -> izquierda)
     */
    public Bicola() {
        this.list = new ArrayList<>();
        this.ordenada = true;
    }

    public boolean isOrdenada() {
        return ordenada;
    }

    public void setOrdenada(boolean ordenada) {
        this.ordenada = ordenada;
    }

//<editor-fold desc="insertar">
    public void insertarIzq(T elemento) {
        list.add(0, elemento);
    }

    public void insertarDch(T elemento) {
        list.add(list.size(), elemento);
    }
//</editor-fold>

//<editor-fold desc="obtener">
    public T obtenerIzq() {
        return list.get(0);
    }

    public T obtenerDch() {
        return list.get(list.size() - 1);
    }
//</editor-fold>

//<editor-fold desc="sacar">
    public T sacarIzq() {
        return list.remove(0);
    }

    public T sacarDch() {
        return list.remove(list.size() - 1);
    }
//</editor-fold>

    @Override
    public Iterator<T> iterator() {
        return new BicolaIterator<>(ordenada);
    }

//<editor-fold defaultstate="collapsed" desc="inner class Iterator">
    private class BicolaIterator<T> implements Iterator<T> {

        private int index;
        private final boolean ordenada;

        public BicolaIterator(boolean ordenada) {
            this.ordenada = ordenada;
            index = ordenada ? 0 : list.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return ordenada ? index < list.size() : index >= 0;
        }

        @Override
        public T next() {
            return ordenada ? (T) list.get(index++) : (T) list.get(index--);
        }
    }
//</editor-fold>
}
