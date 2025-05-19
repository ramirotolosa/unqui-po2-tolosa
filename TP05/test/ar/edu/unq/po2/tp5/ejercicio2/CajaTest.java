package ar.edu.unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	Caja caja;
	Producto producto1;
	ProductoCooperativa producto2;
	
	@BeforeEach
	void setUp() {
		caja = new Caja();
		producto1 = new Producto(10, 500);
		producto2 = new ProductoCooperativa(10, 368);
	}

	@Test
	void test001_Registro() {
		assertEquals(caja.getRegistro().size(), 0);
		
		caja.registrar(producto1);
		caja.registrar(producto2);
		
		assertEquals(caja.getRegistro().size(), 2);
	}
	
	@Test
	void test002_MontoAPagar() {
		assertEquals(caja.montoAPagar(), 0);
		
		caja.registrar(producto1);
		caja.registrar(producto2);
		
		assertEquals(caja.montoAPagar(), 831.2);
		assertEquals(caja.getRegistro().get(0).stockActual(),9);
		assertEquals(caja.getRegistro().get(1).stockActual(),9);
	}

}
