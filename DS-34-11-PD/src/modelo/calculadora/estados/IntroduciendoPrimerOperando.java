package modelo.calculadora.estados;

import modelo.calculadora.Calculadora;
import modelo.Operando;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;

/**
 *
 * @author Pablo
 */
public class IntroduciendoPrimerOperando implements EstadoCalculadora {

    private static EstadoCalculadora instance = null;

    public static EstadoCalculadora getInstance() {
        if (instance == null) {
            instance = new IntroduciendoPrimerOperando();
        }
        return instance;
    }

    private IntroduciendoPrimerOperando() {
    }

    @Override
    public void introducirOperando(Operando o, Calculadora c) {
        c.setOp1(o);
    }

    @Override
    public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c) {
        c.setOb(ob);
        c.setEstado(IntroducidaOperacionBinaria.getInstance());
    }

    @Override
    public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c) {
        c.setOu(ou);
        Operando op1 = c.getOp1();
        c.setOp1(ou.operar(op1));
        c.setEstado(MostrandoResultado.getInstance());
    }

    @Override
    public void mostrarResultado(Calculadora c) {
        Operando op1 = c.getOp1();
        Operando op2 = c.getOp2();
        if (op2 != null && c.getOb() != null) {
            c.setOp1(c.getOb().operar(op1, op2));
        }
        c.setEstado(MostrandoResultado.getInstance());
    }
    
    @Override
    public String toString() {
        return "Introducidendo Primer Operando";
    }

}
