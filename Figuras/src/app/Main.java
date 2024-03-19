package app;

import modelos.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo rec = new Rectangulo(5,5);
		Circulo cir = new Circulo(2.5);
		
		System.out.println(rec.area());
		System.out.println(rec.perimetro());
		System.out.println(cir.area());
		
		
	
	}

}
