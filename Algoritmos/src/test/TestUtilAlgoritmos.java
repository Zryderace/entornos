package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestUtilAlgoritmos {

	@BeforeAll
	static void setUp() {
		
	}
	
	@Test
	void Sumatorio1() {
		int numeroEsperado = 10;
		int numeroObtenido = Algoritmos.sumatorio(4);
		assertEquals(numeroEsperado,numeroObtenido);
	}
	
	@Test
	void sumatorio2() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> Algoritmos.sumatorio(-1));
		
		String esperado = "El numero debe ser  => 0";
		String obtenido = excepcion.getMessage();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void Factorial() {
		int numeroEsperado = 24;
		int numeroObtenido = Algoritmos.factorial(4);
		assertEquals(numeroEsperado,numeroObtenido);
	}

}
