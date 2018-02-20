package ejercicio5;

/**
 * Clase que representa un reponedor, añade a trabajador el campo datosEmpresa.
 * En este campo se podría poner una clase que representase una empresa con
 * todos sus datos, pero hemos puesto un String en el que se guarda el nombre de
 * la empresa de procedencia, por hacerlo mas sencillo más que nada.
 *
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public class Reponedor extends Trabajador {

    private String datosEmpresa;

    /**
     * Constructor de la clase reponedor
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param direccion
     * @param telefono
     * @param nss
     * @param salario
     * @param turno
     * @param datosEmpresa
     */
    public Reponedor(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono,
            String nss,
            double salario,
            Turno turno,
            String datosEmpresa) {
        super(nombre, apellido1, apellido2, dni, direccion, telefono,
                nss, salario, turno);
        this.datosEmpresa = datosEmpresa;
    }
    
    /**
     * Devuelve el atributo datosEmpresa
     * @return datosEmpresa (String)
     */
    public String getDatosEmpresa() {
        return datosEmpresa;
    }
    
    /**
     * Permite cambiar el atributo datosEmpresa
     * @param datosEmpresa (String)
     */
    public void setDatosEmpresa(String datosEmpresa){
        this.datosEmpresa = datosEmpresa;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nReponedor:"
                + "\n\tDatos Empresa: " + datosEmpresa;
    }
}
