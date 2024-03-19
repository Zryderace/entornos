
import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
    	this.altura = 1;
    	this.base = 1;
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
     * @param base 
     * @param altura
     */
    public void Rectangulo(int base, int altura) {
        // TODO implement here
    	this.altura = altura;
    	this.base = base;
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
     * @param altura settea altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    	this.altura = altura;
    }

    /**
     * devuelve base x altura
     * @return
     */
    public int area() {
        // TODO implement here
        return base*altura;
    }

    /**
     * devuelve 2B + 2A
     * @return
     */
    public int perimetro() {
        // TODO implement here
        return 2*base+2*altura;
    }

}