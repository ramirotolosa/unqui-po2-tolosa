package ar.edu.unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto1;
	
	@BeforeEach
	void setUp() {
		producto1 = new Producto(10, 350.25);
	}

	@Test
	void test001_Constructor() {
		int stock = producto1.getStock();
		double precio = producto1.getPrecioBase();
		
		assertEquals(stock,10);
		assertEquals(precio, 350.25);
	}
	
	@Test
	void test002_PrecioFinal() {
		double precioFinal = producto1.precioFinal();
		
		assertEquals(precioFinal, 350.25);
	}
	
	@Test
	void test003_DecrementarStock() {
		assertEquals((producto1.getStock()),10);
		
		producto1.decrementarStock();
		
		assertEquals((producto1.getStock()),9);
	}

}
