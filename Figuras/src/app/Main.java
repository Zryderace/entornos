package app;

import modelos.*;

public class Main {

	public static void main(String[] args) {

		Triangulo trian = new Triangulo(1, 2);
		
		double areatrian = trian.area();
		
		System.out.println(areatrian);
		
		trian.setBase(2);
		
		areatrian = trian.area();
		
		System.out.println(areatrian);
		
		Circulo circu = new Circulo(2);
		
		double areacircu = circu.area();
		
		circu.setRadio(3);
		
		double perimetrocircu = circu.perimetro();
		
		System.out.println(perimetrocircu);
	
	}

}
