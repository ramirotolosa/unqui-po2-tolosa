package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	private Cuadrado cuadrado1;
	private Cuadrado cuadrado2;
	
	@BeforeEach
	void setUp() {
		cuadrado1 = new Cuadrado(4); // cuadrado en origen;
		cuadrado2 = new Cuadrado(new Point(3,3), 7); // cuadrado en un punto xy;
	}

	@Test
	void test001_ConstructorEnOrigenPorDefecto() {
		Point p = cuadrado1.getOrigen();
		int px = p.getX();
		int py = p.getY();
		
		assertEquals(px, 0);
		assertEquals(py, 0);
	}
	
	@Test
	void test002_ConstructorEnOrigenEspecifico() {
		Point p = cuadrado2.getOrigen();
		int px = p.getX();
		int py = p.getY();
		
		assertEquals(px, 3);
		assertEquals(py, 3);
	}
	
	@Test
	void test003_CalculoDeArea() {
		int area = cuadrado1.area();
		
		assertEquals(area, 16);
	}
	
	@Test
	void test004_CalculoDePerimetro() {
		int perimetro = cuadrado2.perimetro();
		
		assertEquals(perimetro, 28);
	}

}
