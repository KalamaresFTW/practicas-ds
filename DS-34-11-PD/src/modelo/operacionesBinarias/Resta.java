package modelo.operacionesBinarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Resta implements OperacionBinaria {

    private static OperacionBinaria instance = null;

    private Resta() {
    }

    public static OperacionBinaria getInstance() {
        if (instance == null) {
            instance = new Resta();
        }
        return instance;
    }

    @Override

    public Operando operar(Operando op1, Operando op2) {
        return new Operando(op1.getOperando()
                .subtract(op2.getOperando(), mathContext));
    }

    @Override
    public String toString() {
        return "Resta";
    }
}
