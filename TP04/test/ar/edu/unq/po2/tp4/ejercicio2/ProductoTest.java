package ar.edu.unq.po2.tp4.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9, true);
		vino = new Producto("Vino", 55);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.getPrecio());
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55, vino.getPrecio());
		assertFalse(vino.esPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrecio());
	}

}
