package ar.edu.unq.po2.tp4.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8.0, false,10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.calcularPrecio());
		leche.setPorcentajeDescuento(25);
		assertEquals(6, leche.calcularPrecio());
		leche.aumentarPrecio(2.5);
		assertEquals(7.88, leche.calcularPrecio());
	}

}
