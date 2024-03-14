/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    private String dni;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellidos;

    /**
     * 
     */
    private int edad;

    /**
     * @param dni: String 
     * @param nombre: String 
     * @param apellidos: String 
     * @param edad: int
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        // TODO implement here
    	this.dni = dni;
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
    }

    /**
     * modifica el dni de la persona
     * @param dni: String
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * modifica el nombre de la persona
     * @param nombre: String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * modifica el apellido de la persona
     * @param apellidos: String
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * modifica la edad de la persona
     * @param edad: int
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * devuelve el dni de la persona
     * @return
     */
    public String getDni() {
        // TODO implement here
        return dni;
    }

    /**
     * devuelve el nombre de la persona
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return nombre;
    }

    /**
     * devuelve el apellido de la persona
     * @return
     */
    public String getApellidos() {
        // TODO implement here
        return apellidos;
    }

    /**
     * devuelve la edad de la persona
     * @return
     */
    public int getEdad() {
        // TODO implement here
        return edad;
    }
    
    public String toString() {
    	return "nombre: " + this.nombre + " apellidos: " + this.apellidos + " DNI: " + this.dni + " edad: " + this.edad;
    }

}