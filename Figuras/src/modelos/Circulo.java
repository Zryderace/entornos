package modelos;

public class Circulo {
	
    /**
     * 
     */
    private double radio;

    /**
     * Default constructor
     */
    public Circulo() {
    	radio = 1;
    }


    /**
     * crear circulo dando radio
     * @param radio
     */
    public Circulo(double radio) {
        // TODO implement here
    	this.radio = radio;
    }

    /**
     * @return radio
     */
    public double getRadio() {
        // TODO implement here
        return radio;
    }

    /**
     * @param radio
     */
    public void setRadio(double radio) {
        // TODO implement here
    	this.radio = radio;
    }

    /**
     * @return PI*r^2
     */
    public double area() {
        // TODO implement here
        return Math.PI*(radio*radio);
    }

    /**
     * @return PI*diametro
     */
    public double perimetro() {
        // TODO implement here
        return Math.PI*2*radio;
    }

}