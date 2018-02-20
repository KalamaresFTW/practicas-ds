package modelo.operacionesUnarias;

import java.math.BigDecimal;
import modelo.Operando;

/**
 *
 * @author Pablo
 */
public class RaizCuadrada implements OperacionUnaria {

    private static OperacionUnaria instance = null;

    private RaizCuadrada() {
    }

    public static OperacionUnaria getInstance() {
        if (instance == null) {
            instance = new RaizCuadrada();
        }
        return instance;
    }
    
    @Override
    public Operando operar(Operando op1) {
        if (op1.getOperando().signum() != (-1)) {
            return new Operando(new BigDecimal(Math
                    .sqrt(op1.getOperando().doubleValue()), mathContext));
        }
        throw new ArithmeticException();
    }
}
