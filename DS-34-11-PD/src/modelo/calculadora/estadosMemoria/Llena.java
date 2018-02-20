package modelo.calculadora.estadosMemoria;

import modelo.Operando;
import modelo.calculadora.Memoria;
import modelo.operacionesBinarias.Resta;
import modelo.operacionesBinarias.Suma;


/**
 *
 * @author Pablo
 */
public class Llena implements EstadoMemoria {

    private static EstadoMemoria instance = null;

    public static EstadoMemoria getInstance() {
        if (instance == null) {
            instance = new Llena();
        }
        return instance;
    }

    @Override
    public Operando leerMemoria(Memoria m) {
        return m.getDato();
    }

    @Override
    public void escribirMemoria(Operando nuevoDato, Memoria m) {
        m.setDato(nuevoDato);
    }

    @Override
    public void limpiarMemoria(Memoria m) {
        m.setDato(new Operando("0."));
        m.setEstado(Vacia.getInstance());
    }

    @Override
    public void sumarMemoria(Operando o, Memoria m) {
        Operando resultado = Suma.getInstance().operar(m.getDato(), o);
        escribirMemoria(resultado, m);
    }

    @Override
    public void restarMemoria(Operando o, Memoria m) {
        Operando resultado = Resta.getInstance().operar(m.getDato(), o);
        escribirMemoria(resultado, m);
    }

    @Override
    public String toString() {
        return "Llena";
    }
}
