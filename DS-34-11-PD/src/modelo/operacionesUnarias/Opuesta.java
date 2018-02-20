package modelo.operacionesUnarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Opuesta implements OperacionUnaria {

    private static OperacionUnaria instance = null;

    private Opuesta() {
    }

    public static OperacionUnaria getInstance() {
        if (instance == null) {
            instance = new Opuesta();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1) {
        return new Operando(op1.getOperando().negate());
    }
}
