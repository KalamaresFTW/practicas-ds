package ejercicio5;

/**
 * Clase que representa un cliente. Añade los campos codCliente y numCompras a
 * la clase Persona
 * 
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public final class Cliente extends Persona {

    private final String codCliente;
    private int numCompras;

    /**
     * Constructor de la clase Cliente que permite instanciar un cliente con un
     * número de compras proporcionado por parámetro.
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param direccion
     * @param telefono
     * @param codCliente
     * @param numCompras
     */
    public Cliente(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono,
            String codCliente,
            int numCompras) {
        super(nombre, apellido1, apellido2, dni, direccion, telefono);
        this.codCliente = codCliente;
        this.numCompras = numCompras;
    }
    
    /**
     * Constructor de la clase Cliente que permite instanciar un cliente con el
     * número de compras a 0.
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param direccion
     * @param telefono
     * @param codCliente
     */
    public Cliente(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono,
            String codCliente) {
        this(nombre, apellido1, apellido2, dni, direccion, telefono, codCliente,
                0);
    }

    /**
     * Aumenta en uno el número de compras del cliente
     *
     * @return el número de compras del cliente tras haber realizado la compra
     */
    public int comprar() {
        return ++numCompras;
    }

    /**
     * Calcula el descuento que se le aplica al cliente. 
     * Por cada 100 compras se le aplica un 1% de descuento. 
     * @return 
     */
    public double getDescuento() {
        return (numCompras/100)  * 0.01D;
    }
    
    /**
     * Devuelve el número de compras que ha efectuado un cliente
     * @return numCompras (int)
     */
    public int getNumCompras() {
        return numCompras;
    }
    
    /**
     * Permite cambiar el valor del atributo numCompras
     * @param numCompras (int)
     */
    public void setNumCompras(int numCompras){
        this.numCompras = numCompras;
    }
    
    /**
     * Devuelve el código del cliente
     * @return codCliente (String)
     */
    public String getCodCliente() {
        return codCliente;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCliente:" 
                + "\n\tCódigo de cliente: " + codCliente
                + "\n\tNúmero de compras: " + numCompras;
    }
    
}
