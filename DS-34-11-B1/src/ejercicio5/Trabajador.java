package ejercicio5;

/**
 * Clase que representa a un trabajador, añade a persona los campos nss, salario
 * y turno.
 *
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public abstract class Trabajador extends Persona {

    private final String nss;
    private double salario;
    private Turno turno;

    /**
     * Constructor de la clase trabajador
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
     */
    public Trabajador(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono,
            String nss,
            double salario,
            Turno turno) {
        super(nombre, apellido1, apellido2, dni, direccion, telefono);
        this.nss = nss;
        this.salario = salario;
        this.turno = turno;
    }
    
    /**
     * Devuelve el número de la seguridad social
     * @return nss (String)
     */
    public String getNSS(){
        return this.nss;
    }
    
    /**
     * Permite cambiar el salario de un trabajador
     * @param s (double), el nuevo salario del trabajador
     */
    public void cambiarSalario(double s){
        this.salario = s;
    }
    
    /**
     * Devuelve el salario del trabajador
     *
     * @return el salario en función del turno en el que trabaja
     */
    public double getSalario() {
        if (turno == Turno.NOCHE) {
            return salario + 150;
        }
        return salario;
    }

    /**
     * Cambia el turno actual por t
     *
     * @param t
     */
    public void cambiarTurno(Turno t) {
        this.turno = t;
    }
    
    /**
     * Devuelve el turno del trabajador (tipo enumerado Turno)
     * 
     * @return 
     */
    public Turno getTurno(){
        return turno;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nTrabajador:"
                + "\n\tNSS: " + nss 
                + "\n\tSalario: " + salario
                + "\n\tTurno: " + turno;
    }
}
