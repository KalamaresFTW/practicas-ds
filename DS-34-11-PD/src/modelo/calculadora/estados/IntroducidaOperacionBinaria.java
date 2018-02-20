package modelo.calculadora.estados;

import modelo.calculadora.Calculadora;
import modelo.Operando;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;

/**
 *
 * @author Pablo
 */
public class IntroducidaOperacionBinaria implements EstadoCalculadora {
    
    private static EstadoCalculadora instance = null;
    
    public static EstadoCalculadora getInstance() {
        if (instance == null) {
            instance = new IntroducidaOperacionBinaria();
        }
        return instance;
    }
    
    private IntroducidaOperacionBinaria() {
    }
    
    @Override
    public void introducirOperando(Operando o, Calculadora c) {
        c.setOp2(o);
        c.setEstado(IntroduciendoSegundoOperando.getInstance());
    }
    
    @Override
    public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c) {
        c.setOb(ob);
    }
    
    @Override
    public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c) {
        /*
        el resultado de realizar la operacion binaria sobre op1 se guarda en op2
        sin modificar op1.
        */
        
        c.setOu(ou);
        Operando resultado = ou.operar(c.getOp1());
        c.setOp2(resultado);
        c.setEstado(IntroduciendoSegundoOperando.getInstance());
    }
    
    @Override
    public void mostrarResultado(Calculadora c) {
        /*
        se sobreescribe el op2 al valor de op1 y se realiza la operacion Binaria
        */
        
        Operando op1 = c.getOp1();
        c.setOp2(op1);
        Operando op2 = c.getOp2();
        Operando resultado = c.getOb().operar(op1, op2);
        c.setOp1(resultado);
        c.setEstado(MostrandoResultado.getInstance());
    }
    
    @Override
    public String toString() {
        return "Introducida Operación Binaria";
    }
}
