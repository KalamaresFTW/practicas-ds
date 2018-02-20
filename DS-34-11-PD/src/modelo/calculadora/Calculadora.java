package modelo.calculadora;

import modelo.Operando;
import modelo.calculadora.estados.*;
import modelo.operacionesBinarias.*;
import modelo.operacionesUnarias.OperacionUnaria;

/**
 *
 * @author Pablo
 */
public class Calculadora {

    private Memoria memoria;
    private OperacionBinaria ob;
    private OperacionUnaria ou;
    private Operando op1, op2;
    private EstadoCalculadora estado;

    public Calculadora() {
        this.memoria = new Memoria();
        this.op1 = new Operando("0.");
        this.op2 = new Operando("0.");
        this.estado = IntroduciendoPrimerOperando.getInstance();
    }

    public void introducirOperando(Operando o) {
        estado.introducirOperando(o, this);
    }

    public void introducirOperadorBinario(OperacionBinaria ob) {
        estado.introducirOperadorBinario(ob, this);
    }

    public void introducirOperadorUnario(OperacionUnaria ou) {
        estado.introducirOperadorUnario(ou, this);
    }

    public void mostrarResultado() {
        estado.mostrarResultado(this);
    }

    public Operando leerMemoria() {
        Operando op = memoria.leerMemoria();
        op1 = op;
        return op;
    }

    public void escribirMemoria(Operando nuevoDato) {
        memoria.escribirMemoria(nuevoDato);
    }

    public void limpiarMemoria() {
        memoria.limpiarMemoria();
    }

    public void sumarMemoria(Operando o) {
        memoria.sumarMemoria(o);
    }

    public void restarMemoria(Operando o) {
        memoria.restarMemoria(o);
    }

    public void limpiarPantalla() { //C
        op2 = new Operando("0.");
    }

    public void resetear() { //AC
        this.memoria = new Memoria();
        this.op1 = new Operando("0.");
        this.op2 = new Operando("0.");
        this.ob = null;
        this.ou = null;
        this.estado = IntroduciendoPrimerOperando.getInstance();
    }

    public EstadoCalculadora getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoCalculadora estado) {
        this.estado = estado;
    }

//<editor-fold defaultstate="collapsed" desc="getsetters">
    public Memoria getMem() {
        return memoria;
    }

    public void setMem(Memoria mem) {
        this.memoria = mem;
    }

    public OperacionBinaria getOb() {
        return ob;
    }

    public void setOb(OperacionBinaria ob) {
        this.ob = ob;
    }

    public OperacionUnaria getOu() {
        return ou;
    }

    public void setOu(OperacionUnaria ou) {
        this.ou = ou;
    }

    public Operando getOp1() {
        return op1;
    }

    public void setOp1(Operando op1) {
        this.op1 = op1;
    }

    public Operando getOp2() {
        return op2;
    }

    public void setOp2(Operando op2) {
        this.op2 = op2;
    }

//</editor-fold>
    
    @Override
    public String toString() {
        return "Calculadora: " + memoria + ", ob=" + ob + ", op1=" + op1 + ", op2=" + op2 + ", estado=" + estado;
    }

}
