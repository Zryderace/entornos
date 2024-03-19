package modelos;

public class Triangulo {

    /**
     * Default constructor base 1
     */
    public Triangulo() {
    	base = 1;
    	altura = 1;
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * constructor dando 2 int
     * @param base 
     * @param altura
     */
    public Triangulo(int base, int altura) {
        // TODO implement here
    	this.base = base;
    	this.altura = altura;
    }

    /**
     * devuelve base
     * @return
     */
    public int getBase() {
        // TODO implement here
        return base;
    }

    /**
     * devuelve altura
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return altura;
    }

    /**
     * settea base
     * @param base
     */
    public void setBase(int base) {
        // TODO implement here
    	this.base = base;
    }

    /**
     * settea altura
     * @param altura settea altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    	this.altura = altura;
    }

    /**
     * devuelve (base x altura) /2
     * @return
     */
    public double area() {
        // TODO implement here
        return (base*altura)/2;
    }

}