package ar.edu.unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {
	ProductoCooperativa producto1;
	
	@BeforeEach
	void setUp() {
		producto1 = new ProductoCooperativa(5, 200);
	}

	@Test
	void test001_Constructor() {
		int stock = producto1.getStock();
		double precio = producto1.getPrecioBase();
		
		assertEquals(stock,5);
		assertEquals(precio, 200);
	}
	
	@Test
	void test002_PrecioFinal() {
		double precioFinal = producto1.precioFinal();
		
		assertEquals(precioFinal, 180);
	}
	
	@Test
	void test003_DecrementarStock() {
		assertEquals((producto1.getStock()),5);
		
		producto1.decrementarStock();
		
		assertEquals((producto1.getStock()),4);
	}

}
