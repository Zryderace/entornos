package modelos;
/**
 * clase rectangulo - permite crear rectangulos y calcular su area y perimetro
 * 
 * @author alejandroM
 */
public class Rectangulo extends Figura{

    private int base;
    private int altura;
    
    /**
     * Constructor que crea un rectangulo con base y altura 1 en metros
     */
    public Rectangulo() {
    	this.altura = 1;
    	this.base = 1;
    }

    /**
     * constructor que crea un rectangulo con la base y la altura que recibe en metros
     * 
     * @param base la base del rectangulo en metros
     * @param altura la altura del rectangulo en metros
     */
    public Rectangulo(int base, int altura) {
    	this.altura = altura;
    	this.base = base;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
    	this.base = base;
    }

    public void setAltura(int altura) {
    	this.altura = altura;
    }

    /**
     * @see modelos.Figura#area()
     */
    @Override
    public double area() {
        return base*altura;
    }

    /**
     * @see modelos.Figura#perimetro()
     */
    @Override
    public double perimetro() {
        return 2*base+2*altura;
    }

}