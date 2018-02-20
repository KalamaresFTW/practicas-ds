package ejercicio2;

import java.math.BigInteger;

/**
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 * @author p.costa          (Pablo Costa Oubiña)
 */
public class Racional implements Operable <Racional>{
    private final int numerador;
    private final int denominador;

    //<editor-fold desc="Getters">
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    //</editor-fold>
    
    /**
     * función que dado un Racional r devuelve el int que representa el máximo
     * común divisor de numerador y denominador
     * @param r
     * @return el mcd de numerador y denominador
     */
    private static int mcd(Racional r) {
        int a = r.numerador;
        BigInteger b1 = BigInteger.valueOf(a);
        int b = r.denominador;
        BigInteger b2 = BigInteger.valueOf(b);
        
        BigInteger mcd = b1.gcd(b2);
        return mcd.intValue();
    }
    
    /**
     * función que simplifica la relación entre numerador y denominador a 
     * su expresión mínima
     * @return la forma simplificada del Racional al que se aplica
     */
    public Racional simplificar(){
        int mcd = mcd(this);
        return (new Racional(this.numerador / mcd, this.denominador / mcd));
    }
    
    //<editor-fold desc="Operable interface methods">
    /**
     * función que suma dos Racionales
     * @param obj
     * @return la suma de los dos racionales
     */
    @Override
    public Racional suma(Racional obj) {
        int num = this.numerador * obj.denominador
                + this.denominador * obj.numerador;
        int den = this.denominador * obj.denominador;
        return (new Racional (num,den).simplificar());
    }
    
    /**
     * función que resta dos Racionales
     * @param obj
     * @return 
     */
    @Override
    public Racional resta(Racional obj) {

        int num = this.numerador * obj.denominador 
                - this.denominador * obj.numerador;
        int den = this.denominador * obj.denominador;
        return (new Racional(num, den)).simplificar();
    }
    
    /**
     * función que multiplica dos Racionales
     * @param obj
     * @return 
     */
    @Override
    public Racional multiplicacion(Racional obj) {
        int num = this.numerador * obj.numerador;
        int den = this.denominador * obj.denominador;
        return (new Racional(num, den)).simplificar();

    }
    
    /**
     * función que divide dos Racionales
     * @param obj
     * @return 
     */
    @Override
    public Racional division(Racional obj) {
        int num = this.numerador * obj.denominador;
        int den = this.denominador * obj.numerador;
        return (new Racional(num, den)).simplificar();

    }
    //</editor-fold>
    
    //<editor-fold desc="Java default methods">
    @Override
    public String toString(){
        String num = String.valueOf(this.numerador);
        String den = String.valueOf(this.denominador);
        return num+"/"+den;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numerador;
        hash = 53 * hash + this.denominador;
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
        final Racional other = (Racional) obj;
        
        //son equivalentes si multiplicando en cruz son iguales
        return ((this.numerador) * (other.denominador)
                == (this.denominador * other.numerador));
    }
    //</editor-fold>
    
    //<editor-fold desc="Constructors">
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        }
        else {
            throw new IllegalArgumentException("El denominador no puede ser 0!");
        }       
    }
    
    public Racional(Racional r){
        this.numerador = r.numerador;
        this.denominador = r.denominador;
    }
    //</editor-fold>
}
