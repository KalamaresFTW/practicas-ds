package ejercicio4;

import java.util.ArrayList;

/**
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 * @author p.costa          (Pablo Costa Oubiña)
 */
public class Monedero {
    
    private ArrayList<Moneda> monedas;

    /**
     * constructor de un monedero (crea un ArrayList de tipo Moneda)
     */
    public Monedero() {
        this.monedas = new ArrayList<>();
    }
    
    /**
     * función que inserta una moneda en el monedero
     * @param m, la moneda a insertar
     * @return true si se ha insertado correctamente, false en caso contrario
     */
    public boolean insertarMoneda(Moneda m){
        return monedas.add(m);
    }
    /**
     * función que saca una moneda del monedero. Si la moneda que se quiere
     * sacar no está en el monedero, el monedero se queda como estaba.
     * @param m, la moneda a extraer
     * @return la moneda que se quiere sacar del monedero o null si no exsite
     */
    public Moneda extraerMoneda(Moneda m){
        for (Moneda moneda : monedas) {
            if (m.getValor() == moneda.getValor()){
                monedas.remove(m);
                return m;
            }
        }
        return null;
    }
    
    /**
     * función que cuenta el número de monedas que hay en un monedero
     * @return el número de monedas en el monedero
     */
    public int contarMonedas(){
        return monedas.size();
    }
    
    /**
     * función que cuenta el número de monedas del tipo m que hay en un
     * monedero
     * @param m, el tipo de monedas que se quiere contar
     * @return el número de monedas m que hay en el monedero
     */
    public int contarMonedas(Moneda m){
        int count = 0;
        for (Moneda moneda : monedas) {
            if (m.getValor() == moneda.getValor()) count++;
        }
        
        return count;
    }
    
    /**
     * función que calcula el valor de las monedas que hay en el monedero
     * @return el valor de las monedas que hay en el monedero (en céntimos)
     */
    public int valorMonedero(){
        int count = 0;
        for (Moneda moneda : monedas) {
            count += moneda.getValor();
        }
        return count;
    }
    
}
