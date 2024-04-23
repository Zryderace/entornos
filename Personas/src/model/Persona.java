package model;

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
     * @param nombre: String 
     * @param apellidos: String 
     * @param edad: int
     * 
     * @throws IllegalArgumentException si la edad es <0 o >130
     */
    public Persona(String nombre, String apellidos, int edad) {
        // TODO implement here
    	if (edad<0||edad>130) {
    		throw new IllegalArgumentException("La edad no puede ser menor a 0 ni mayor a 130");
		}
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
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
    /**
     * dice si es menor de edad, mayor de edad o jubilado dependiendo de su edad
     * 
     */
    
    public void mostrarEdad(){
    	
    	if (edad<18) {
			System.out.println("Menor de edad");
		} else if (edad>=65) {
			System.out.println("Jubilado");
		} else {
			System.out.println("Mayor de edad");
		}
    	
    }
    
    public String toString() {
    	return "nombre: " + this.nombre + " apellidos: " + this.apellidos + " edad: " + this.edad;
    }

}