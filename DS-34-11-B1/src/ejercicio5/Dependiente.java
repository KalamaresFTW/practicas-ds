package ejercicio5;

/**
 * Clase que representa un dependiente. Añade el campo especialidad a la clase 
 * Trabajador.
 * 
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public final class Dependiente extends Trabajador {

    private String especialidad;

    public Dependiente(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono,
            String nss,
            double salario,
            Turno turno,
            String especialidad) {
        super(nombre, apellido1, apellido2, dni, direccion, telefono, nss,
                salario, turno);
        this.especialidad = especialidad;
    }
    
    /**
     * Devuelve el parámetro especialidad del dependiente
     * @return especialidad (String)
     */
    public String getEspecialidad() {
        return especialidad;
    }
    
    /**
     * Permite cambiar la especialidad del ependiente
     * @param especialidad (String)
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nDependiente:"
                + "\n\tEspecialidad: " + especialidad;
    }
}
