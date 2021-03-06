package modelo.operacionesBinarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Multiplicacion implements OperacionBinaria {
    
    private static OperacionBinaria instance = null;
    
    private Multiplicacion() {
    }
    
    public static OperacionBinaria getInstance() {
        if (instance == null) {
            instance = new Multiplicacion();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1, Operando op2) {
        return new Operando(
                op1.getOperando().multiply(op2.getOperando(), mathContext));
    }

    @Override
    public String toString() {
        return "Multiplicación";
    }
}
