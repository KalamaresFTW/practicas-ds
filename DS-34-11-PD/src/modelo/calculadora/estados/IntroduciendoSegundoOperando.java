package modelo.calculadora.estados;

import modelo.calculadora.Calculadora;
import modelo.Operando;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;

/**
 *
 * @author Pablo
 */
public class IntroduciendoSegundoOperando implements EstadoCalculadora {

    private static EstadoCalculadora instance = null;

    public static EstadoCalculadora getInstance() {
        if (instance == null) {
            instance = new IntroduciendoSegundoOperando();
        }
        return instance;
    }

    @Override
    public void introducirOperando(Operando o, Calculadora c) {
        c.setOp2(o);
    }

    @Override
    public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c) {
        /**
         * se realiza la operacion binaria que estaba introducida y 
         */
        OperacionBinaria ob_aux = c.getOb();
        Operando op1 = c.getOp1();
        Operando op2 = c.getOp2();
        c.setOp1(ob_aux.operar(op1, op2));
        c.setOb(ob);
        c.setEstado(IntroducidaOperacionBinaria.getInstance());
    }

    @Override
    public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c) {
        Operando op2 = c.getOp2();
        c.setOp2(ou.operar(op2));
    }

    @Override
    public void mostrarResultado(Calculadora c) {
        OperacionBinaria ob = c.getOb();
        Operando op1 = c.getOp1();
        Operando op2 = c.getOp2();
        Operando resultado = ob.operar(op1, op2);
        c.setOp1(resultado);    
        c.setEstado(MostrandoResultado.getInstance());
    }
    
    @Override
    public String toString() {
        return "Introduciendo Segundo Operando";
    }

}
