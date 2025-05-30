package ar.edu.unq.po2.tp4.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {

	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9, true);
		detergente = new Producto("Detergente", 75);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9, supermercado.getPrecioTotal());
	}

}
