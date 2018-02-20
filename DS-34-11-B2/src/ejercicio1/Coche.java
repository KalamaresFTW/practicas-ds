package ejercicio1;

/**
 *
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class Coche implements Comparable<Coche> {
    //<editor-fold desc="atributes">
    private final int numBastidor;
    private final String marca;
    private final String modelo;
    private int precio;           //en céntimos
    private final int caballos;   //en ponies
    private final int longitud;   //en centimétros
    private final int alutra;     //en centimétros
    //</editor-fold>
    
    //<editor-fold desc="getters/setters">
    public int getNumBastidor() {
        return numBastidor;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getAlutra() {
        return alutra;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //</editor-fold>

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.numBastidor;
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
        final Coche other = (Coche) obj;
        return (this.numBastidor == other.numBastidor);
    }
    
    @Override
    public String toString() {
        return "Coche:" + "\tnumBastidor=" + numBastidor 
                + "\n\tmarca=" + marca 
                + "\n\tmodelo=" + modelo 
                + "\n\tprecio=" + precio 
                + "\n\tcaballos=" + caballos 
                + "\n\tlongitud=" + longitud 
                + "\n\taltura=" + alutra;
    }
    
    @Override
    public int compareTo(Coche o) {
        return this.numBastidor - o.getNumBastidor();
    }
    
    public Coche(int numBastidor, String marca, String modelo, int precio,
            int caballos, int longitud, int alutra) {
        this.numBastidor = numBastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.caballos = caballos;
        this.longitud = longitud;
        this.alutra = alutra;
    }
}
