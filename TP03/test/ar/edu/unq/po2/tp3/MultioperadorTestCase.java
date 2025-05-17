package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multi;

	@BeforeEach
	void setUp() {
		//Se crea el multioperador
		multi = new Multioperador();
		//Se agregan los numeros.
		multi.agregarNumero(1);
		multi.agregarNumero(3);
		multi.agregarNumero(5);
		multi.agregarNumero(7);
		multi.agregarNumero(9);
		multi.agregarNumero(1);
		multi.agregarNumero(1);
		multi.agregarNumero(1);
		multi.agregarNumero(1);
		multi.agregarNumero(4);
	}

	@Test
	void test001_SumaDeTodosLosNumerosDeLaLista() {
		int total = multi.sumaTotal();
		
		assertEquals(total, 33);
	}
	
	@Test
	void test002_RestaDeTodosLosNumerosDeLaLista() {
		int total = multi.restaTotal();
		
		assertEquals(total, -33);
	}
	
	@Test
	void test003_ProductoDeTodosLosNumerosDeLaLista() {
		int total = multi.productoTotal();
		
		assertEquals(total, 3780);
	}

}
