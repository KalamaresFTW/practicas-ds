package modelo.operacionesBinarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Suma implements OperacionBinaria {
    
    private static OperacionBinaria instance = null;

    private Suma() {
    }

    public static OperacionBinaria getInstance() {
        if (instance == null) {
            instance = new Suma();
        }
        return instance;
    }

    
    @Override
    public Operando operar(Operando op1, Operando op2) {
        return new Operando(op1.getOperando()
                .add(op2.getOperando(), mathContext));
    }

    @Override
    public String toString() {
        return "Suma";
    }

    
}
