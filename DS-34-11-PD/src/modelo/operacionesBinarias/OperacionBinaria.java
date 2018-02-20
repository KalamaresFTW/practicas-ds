package modelo.operacionesBinarias;

import modelo.Operando;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Pablo
 */
public interface OperacionBinaria {

    public Operando operar(Operando op1, Operando op2);

    public MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);

}
