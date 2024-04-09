package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestUtilAlgoritmos {

	@BeforeAll
	static void setUp() {
		
	}
	
	@Test
	void Algoritmo() {
		int numeroEsperado = 10;
		int numeroObtenido = Algoritmos.sumatorio(4);
		assertEquals(numeroEsperado,numeroObtenido);
	}
	


}
