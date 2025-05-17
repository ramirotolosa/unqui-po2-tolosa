package ar.edu.unq.po2.tp3.persona;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona persona1;
	private Persona persona2;

	@BeforeEach
	void setUp() {
		persona1 = new Persona("Pepita", LocalDate.of(1999, 12, 31));
		persona2 = new Persona("Pepe", LocalDate.of(2005, 5, 25));
	}

	@Test
	void test001_EdadDeUnaPersona() {
		int edad = persona1.edad();
		
		assertEquals(edad, 25);
	}
	
	@Test
	void test002_NombreDeUnaPersona() {
		String nombre = persona1.getNombre();
		
		assertEquals(nombre, "Pepita");
	}
	
	@Test
	void test003_FechaDeNacimientoDeUnaPersona() {
		String fecha = persona1.getFechaNacimiento().toString();
		
		assertEquals(fecha, "1999-12-31");
	}
	
	@Test
	void test004_UnaPersonaEsMenorQueOtraPersona() {		
		assertTrue(persona2.menorQue(persona1));
	}
	
	

}
