package modelo.calculadora.estadosMemoria;

import modelo.calculadora.Memoria;
import modelo.Operando;

/**
 *
 * @author Pablo
 */
public interface EstadoMemoria {

    public Operando leerMemoria(Memoria m);

    public void escribirMemoria(Operando nuevoDato, Memoria m);

    public void limpiarMemoria(Memoria m);

    public void sumarMemoria(Operando o, Memoria m);

    public void restarMemoria(Operando o, Memoria m);

}
