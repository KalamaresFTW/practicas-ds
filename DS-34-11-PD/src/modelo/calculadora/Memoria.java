package modelo.calculadora;

import modelo.Operando;
import modelo.calculadora.estadosMemoria.EstadoMemoria;
import modelo.calculadora.estadosMemoria.Vacia;

/**
 *
 * @author Pablo
 */
public class Memoria {

    private Operando dato;

    private EstadoMemoria estado;

    public Memoria() {
        this.dato = new Operando("0.");
        this.estado = Vacia.getInstance();
    }

    public Operando leerMemoria() {
        return estado.leerMemoria(this);
    }

    public void escribirMemoria(Operando nuevoDato) {
        estado.escribirMemoria(nuevoDato, this);
    }

    public void limpiarMemoria() {
        estado.limpiarMemoria(this);
    }

    public void sumarMemoria(Operando o) {
        estado.sumarMemoria(o, this);
    }

    public void restarMemoria(Operando o) {
        estado.restarMemoria(o, this);
    }

    public Operando getDato() {
        return dato;
    }

    public void setDato(Operando dato) {
        this.dato = dato;
    }

    public void setEstado(EstadoMemoria estado) {
        this.estado = estado;
    }
    
    public EstadoMemoria getEstado(){
        return this.estado;
    }

    @Override
    public String toString() {
        return "Memoria: " + estado.toString() + " dato = " + dato;
    }
}
