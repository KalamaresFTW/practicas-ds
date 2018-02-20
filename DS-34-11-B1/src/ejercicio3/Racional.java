package ejercicio3;

import java.math.BigInteger;

/**
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 * @author p.costa          (Pablo Costa Oubiña)
 */
public class Racional {
    private final int numerador;
    private final int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

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
    
    /**
     * función que suma dos Racionales
     * @param r
     * @return la suma de los dos racionales
     */
    public Racional mas(Racional r){
        int num = this.numerador * r.denominador
                + this.denominador * r.numerador;
        int den = this.denominador * r.denominador;

        return (new Racional(num, den)).simplificar();
        
    }
    
    public Racional menos(Racional r){
        int num = this.numerador * r.denominador 
                - this.denominador * r.numerador;
        int den = this.denominador * r.denominador;
        return (new Racional(num, den)).simplificar();
    }
    
    public Racional por(Racional r){
        int num = this.numerador * r.numerador;
        int den = this.denominador * r.denominador;
        return (new Racional(num, den)).simplificar();
    }
    
    public Racional entre(Racional r){
        int num = this.numerador * r.denominador;
        int den = this.denominador * r.numerador;
        return (new Racional(num, den)).simplificar();
    }
    
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
       
}
