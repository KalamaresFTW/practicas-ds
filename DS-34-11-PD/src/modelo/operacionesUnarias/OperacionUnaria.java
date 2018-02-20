package modelo.operacionesUnarias;

import modelo.Operando;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Pablo
 */
public interface OperacionUnaria {

    public Operando operar(Operando op1);

    public MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);

}
