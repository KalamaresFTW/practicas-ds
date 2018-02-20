package modelo.calculadora.estadosMemoria;

import modelo.Operando;
import modelo.calculadora.Memoria;
import modelo.operacionesBinarias.Resta;

/**
 *
 * @author Pablo
 */
public class Vacia implements EstadoMemoria {

    private static EstadoMemoria instance = null;

    public static EstadoMemoria getInstance() {
        if (instance == null) {
            instance = new Vacia();
        }
        return instance;
    }

    private Vacia() {
    }

    @Override
    public Operando leerMemoria(Memoria m) {
        return new Operando("0.");
    }

    @Override
    public void escribirMemoria(Operando nuevoDato, Memoria m) {
        m.setDato(nuevoDato);
        m.setEstado(Llena.getInstance());
    }

    @Override
    public void limpiarMemoria(Memoria m) {

    }

    @Override
    public void sumarMemoria(Operando o, Memoria m) {
        escribirMemoria(o, m);
    }

    @Override
    public void restarMemoria(Operando o, Memoria m) {
        Operando resultado = Resta.getInstance().operar(m.getDato(), o);
        escribirMemoria(resultado, m);
    }

    @Override
    public String toString() {
        return "Vacía";
    }
}
