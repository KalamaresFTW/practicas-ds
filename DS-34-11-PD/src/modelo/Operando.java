package modelo;

import java.math.BigDecimal;

/**
 *
 * @author Pablo
 */
public class Operando {

    private final BigDecimal operando;

    public Operando(BigDecimal operando) {
        this.operando = operando;
    }

    public Operando(String operando) throws NumberFormatException {
        this.operando = new BigDecimal(operando);
    }

    public BigDecimal getOperando() {
        return operando;
    }

    @Override
    public String toString() {
        return operando.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operando other = (Operando) obj;
        int result = operando.compareTo(other.getOperando());
        return result == 0;
    }
}
