package modelo.calculadora.estados;

import modelo.calculadora.Calculadora;
import modelo.Operando;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;


/**
 *
 * @author Pablo
 */
public class MostrandoResultado implements EstadoCalculadora {

    private static EstadoCalculadora instance = null;

    public static EstadoCalculadora getInstance() {
        if (instance == null) {
            instance = new MostrandoResultado();
        }
        return instance;
    }

    private MostrandoResultado() {
    }

    @Override
    public void introducirOperando(Operando o, Calculadora c) {
        c.setOp1(o);
        c.setEstado(IntroduciendoPrimerOperando.getInstance());
    }

    @Override
    public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c) {
        c.setOb(ob);
        c.setEstado(IntroducidaOperacionBinaria.getInstance());
    }

    @Override
    public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c) {
        Operando op1 = c.getOp1();
        Operando resultado = ou.operar(op1);
        c.setOu(ou);
        c.setOp1(resultado);
    }

    @Override
    public void mostrarResultado(Calculadora c) {
        Operando op1 = c.getOp1();
        Operando op2 = c.getOp2();
        OperacionBinaria ob = c.getOb();
        if (ob != null) {
            Operando resultado = ob.operar(op1, op2);
            c.setOp1(resultado);
        }
    }
    
    @Override
    public String toString() {
        return "Mostrando Resultado";
    }

}
