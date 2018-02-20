package modelo.operacionesUnarias;

import java.math.BigDecimal;
import modelo.Operando;


/**
 *
 * @author Pablo
 */
public class Inversa implements OperacionUnaria {
    
    private static OperacionUnaria instance = null;

    private Inversa() {
    }

    public static OperacionUnaria getInstance() {
        if (instance == null) {
            instance = new Inversa();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1) {
        return new Operando((new BigDecimal(1))
                .divide(op1.getOperando(), mathContext));
    }
}
