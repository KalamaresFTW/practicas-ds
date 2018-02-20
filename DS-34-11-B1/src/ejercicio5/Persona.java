package ejercicio5;

import java.util.Objects;

/**
 * Clase abstracta que representa a una persona.
 *
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
public abstract class Persona {

    private final String nombre, apellido1, apellido2, dni;
    private String direccion, telefono;

    /**
     * Constructor de la clase abstracta Persona, que será la superclase de
     * todas las otras clases de este ejercicio.
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dni
     * @param direccion
     * @param telefono
     */
    public Persona(String nombre,
            String apellido1,
            String apellido2,
            String dni,
            String direccion,
            String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //<editor-fold desc="getters/setters">
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //</editor-fold>

    /**
     * Representación en String de la clase Persona
     * @return
     */
    @Override
    public String toString() {
        return "Persona:"
                + "\n\tNombre: " + nombre
                + "\n\tApellidos: " + apellido1 + " " + apellido2
                + "\n\tDNI: " + dni
                + "\n\tDirección: " + direccion
                + "\n\tTeléfono: " + telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        
        return (this.dni).equals(other.dni);
    }
}
