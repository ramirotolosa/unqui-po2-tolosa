package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectanguloH;
	private Rectangulo rectanguloV;
	
	@BeforeEach
	void setUp() {
		rectanguloH = new Rectangulo(20,10);
		rectanguloV = new Rectangulo(new Point(5,5), 8,16);
	}

	@Test
	void test001_ConstructorEnOrigenPorDefecto() {
		Point p = rectanguloH.getOrigen();
		int px = p.getX();
		int py = p.getY();
		
		assertEquals(px, 0);
		assertEquals(py, 0);
	}
	
	@Test
	void test002_ConstructorEnOrigenEspecifico() {
		Point p = rectanguloV.getOrigen();
		int px = p.getX();
		int py = p.getY();
		
		assertEquals(px, 5);
		assertEquals(py, 5);
	}
	
	@Test
	void test003_CalculoDeArea() {
		int area = rectanguloH.area();
		
		assertEquals(area, 200);
	}
	
	@Test
	void test004_CalculoDePerimetro() {
		int perimetro = rectanguloV.perimetro();
		
		assertEquals(perimetro, 48);
	}
	
	@Test
	void test005_OrientacionDelRectangulo() {
		boolean bh = rectanguloH.estaHorizontal();
		boolean bv = rectanguloH.estaVertical();
		
		assertTrue(bh);
		assertFalse(bv);
	}

}
