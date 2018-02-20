package modelo.operacionesUnarias;

import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class Cuadrado implements OperacionUnaria {
    
    private static OperacionUnaria instance = null;

    private Cuadrado() {
    }

    public static OperacionUnaria getInstance() {
        if (instance == null) {
            instance = new Cuadrado();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1) {
        return new Operando(op1.getOperando().pow(2, mathContext));
    }
}
