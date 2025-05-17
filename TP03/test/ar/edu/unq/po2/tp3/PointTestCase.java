package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point puntoA;
	private Point puntoB;

	@BeforeEach
	void setUp() {
		puntoA = new Point();
		puntoB = new Point(1,2);
	}

	@Test
	void test001_ConstructorPuntoEnOrigen() {
		int x = puntoA.getX();
		int y = puntoA.getY();
		
		assertEquals(x, 0);
		assertEquals(y, 0);
	}
	
	@Test
	void test002_ConstructorPuntoEnCoordenadaEspecifica() {
		int x = puntoB.getX();
		int y = puntoB.getY();
		
		assertEquals(x, 1);
		assertEquals(y, 2);
	}
	
	@Test
	void test003_ConstructorPuntoEnCoordenadaEspecifica() {
		puntoB.moverA(6, 9);
		int x = puntoB.getX();
		int y = puntoB.getY();
		
		assertEquals(x, 6);
		assertEquals(y, 9);
	}
	
	@Test
	void test004_SumaDePuntos() {
		puntoA.moverA(2, 2);
		
		Point puntoC = puntoA.sumarPuntos(puntoA, puntoB);
		
		int x = puntoC.getX();
		int y = puntoC.getY();
		
		assertEquals(x, 3);
		assertEquals(y, 4);
	}	
}
