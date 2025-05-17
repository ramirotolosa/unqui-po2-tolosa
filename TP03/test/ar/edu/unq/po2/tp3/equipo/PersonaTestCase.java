package ar.edu.unq.po2.tp3.equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona persona;

	@BeforeEach
	void setUp() {
		persona = new Persona("Peter", "Parker", 21);
	}

	@Test
	void test001_UnaPersonaTieneNombre() {
		String nombre = persona.getNombre();
		
		assertEquals(nombre, "Peter");
	}
	
	@Test
	void test002_UnaPersonaTieneApellido() {
		String apellido = persona.getApellido();
		
		assertEquals(apellido, "Parker");
	}
	
	@Test
	void test003_UnaPersonaTieneEdad() {
		int edad = persona.getEdad();
		
		assertEquals(edad, 21);
	}

}
