package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Persona;

class TestPersona {

	private static Persona perso;
	
	@BeforeAll
	static void setUp() {
		perso = new Persona();
	}
	
	@Test void pm1(){
		
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> perso = new Persona(null, null, -1));
		
		String esperado = "La edad no puede ser menor a 0 ni mayor a 130";
		String obtenido = excepcion.getMessage();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm131(){
		
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> perso = new Persona(null, null, 131));
		
		String esperado = "La edad no puede ser menor a 0 ni mayor a 130";
		String obtenido = excepcion.getMessage();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm0(){
		
		perso.setEdad(0);
		
		String esperado = "Menor de edad";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm17(){
		
		perso.setEdad(17);
		
		String esperado = "Menor de edad";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm18(){
		
		perso.setEdad(18);
		
		String esperado = "Mayor de edad";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm65(){
		
		perso.setEdad(65);
		
		String esperado = "Mayor de edad";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm66(){
		
		perso.setEdad(66);
		
		String esperado = "Jubilado";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test void pm130(){
		
		perso.setEdad(130);
		
		String esperado = "Jubilado";
		String obtenido = perso.mostrarEdad();
		
		assertEquals(esperado, obtenido);
	}
	
	
	
	
	
}
