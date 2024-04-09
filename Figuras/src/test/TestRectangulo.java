package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelos.Rectangulo;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	static Rectangulo r3;
	static Rectangulo r4;
	
	@BeforeAll
	static void setUp() {
		
		r1 = new Rectangulo();
		r2 = new Rectangulo(2,3);
		r3 = new Rectangulo(0,0);
		
	}
	
	@Test
	
	void areaR1() {
		double areaEsperada = 1;
		double areaObtenida = r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void areaR2() {
		double areaEsperada = 5;
		double areaObtenida = r2.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void perimetroR1() {
		double perimetroEsperado = 4;
		double perimetroObtenido = r1.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}
	
	@Test
	void perimetroR2() {
		double perimetroEsperado = 10;
		double perimetroObtenido = r2.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

}
