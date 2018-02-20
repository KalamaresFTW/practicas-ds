package modelo.operacionesBinarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Division implements OperacionBinaria {
    
    private static OperacionBinaria instance = null;
    
    private Division() {
    }
    
    public static OperacionBinaria getInstance() {
        if (instance == null) {
            instance = new Division();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1, Operando op2) {
        return new Operando(op1.getOperando()
                .divide(op2.getOperando(), mathContext));
    }

    @Override
    public String toString() {
        return "División";
    }
}
