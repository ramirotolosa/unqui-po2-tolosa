package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import java.util.ArrayList;

class CounterTestCase {
	
	//Atributos
	private Counter counter;
	private Counter counter2;
	private Counter counter3;

	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.agregarNumero(1);
	counter.agregarNumero(3);
	counter.agregarNumero(5);
	counter.agregarNumero(7);
	counter.agregarNumero(9);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(1);
	counter.agregarNumero(4);
	
	counter2 = new Counter();
	counter2.agregarNumero(152);
	counter2.agregarNumero(1010);
	counter2.agregarNumero(217684);
	counter2.agregarNumero(3);
	counter2.agregarNumero(74130);
	counter2.agregarNumero(100);
	
	counter3 = new Counter();
	
	}
	
	@Test
	public void testPar() {
		int p = 2;
		
		assertTrue(counter.esPar(p));
	}
	
	@Test
	public void testImpar() {
		int p = 3;
		
		assertTrue(counter.esImpar(p));
	}
	
	@Test
	public void testMultiplo() {
		int x = 4;
		int y = 2;
		
		assertTrue(counter.esMultiploDe(x, y));
	}
	
	@Test
	public void testNumerosPares() {
		int cantidad = counter.cantidadDeNumerosPares();
		
		assertEquals(cantidad,1);
	}
	
	@Test
	public void testNumerosImpares() {
		int cantidad = counter.cantidadDeNumerosImpares();
		
		assertEquals(cantidad,9);
	}
	
	@Test
	public void testNumerosMultiplosDeN() {
		int cantidad = counter.cantidadDeMultiplosDe(2);
		
		assertEquals(cantidad,1);
	}
	
	@Test
	public void testCantidadDeDigitosPares() {
		int num = 43671;
		int cantidad = counter.cantidadDeDigitosPares(num);
		
		assertEquals(cantidad, 2);
	}
	
	@Test
	public void testNumeroConMayorCantidadDeDigitosPares() {
		int num = counter2.numeroConMayorCantidadDeDigitosPares();
		
		assertEquals(num, 217684);
	}
		
}
