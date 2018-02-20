package ejercicio2;

/**
 *
 * @author pablo.aragunde
 */
public class Complejo implements Operable<Complejo> {

    private final double real;
    private final double imaginaria;

    //<editor-fold desc="Operable interface methods">
    @Override
    public Complejo suma(Complejo obj) {
        double a = this.real + obj.real;
        double b = this.imaginaria + obj.imaginaria;
        return new Complejo(a, b);
    }

    @Override
    public Complejo resta(Complejo obj) {
        double a = this.real - obj.real;
        double b = this.imaginaria - obj.imaginaria;
        return new Complejo(a, b);
    }

    @Override
    public Complejo multiplicacion(Complejo obj) {
        double a = (this.real * obj.real)
                - (this.imaginaria * obj.imaginaria);
        double b = (this.real * obj.imaginaria)
                + (this.imaginaria * obj.real);

        return new Complejo(a, b);
    }

    @Override
    public Complejo division(Complejo obj) {
        double a = ((this.real * obj.real) + (this.imaginaria * obj.imaginaria))
                / (Math.pow(obj.real, 2d) + (Math.pow(obj.imaginaria, 2d)));
        double b = ((this.imaginaria * obj.real) - (this.real * obj.imaginaria))
                / (Math.pow(obj.real, 2d) + (Math.pow(obj.imaginaria, 2d)));
        return new Complejo(a, b);
    }
    //</editor-fold>

    //<editor-fold desc="Getters">
    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }
    //</editor-fold>

    //<editor-fold desc="Java default methods">
    @Override
    public String toString() {
        return real + " + " + imaginaria + 'i';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.real)
                ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.imaginaria)
                ^ (Double.doubleToLongBits(this.imaginaria) >>> 32));
        return hash;
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
        final Complejo other = (Complejo) obj;

        //use this?? Double.doubleToLongBits
        return (this.real == other.real)
                && (this.imaginaria == other.imaginaria);
    }
    //</editor-fold>

    /**
     * Constructor of class Complejo
     *
     * @param real
     * @param imaginaria
     */
    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
}
