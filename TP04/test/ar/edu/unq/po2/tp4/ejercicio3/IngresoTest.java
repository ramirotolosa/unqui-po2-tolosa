package ar.edu.unq.po2.tp4.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	Ingreso ingreso1;
	Ingreso ingreso2;
	Ingreso ingreso3;
	
	@BeforeEach
	void setUp() {
		ingreso1 = new Ingreso("Enero", "Pago Mensual", 250.80);
		ingreso2 = new Ingreso("Febrero", "Pago Mensual", 250.80);
		ingreso3 = new Ingreso("Marzo", "Pago Mensual", 100);
	}

	@Test
	void test001_Constructor() {
		String mesI1 = ingreso1.getMes();
		String conceptoI2 = ingreso2.getConcepto();
		double montoI3 = ingreso3.getMonto();
		
		assertEquals(mesI1,"Enero");
		assertEquals(conceptoI2,"Pago Mensual");
		assertEquals(montoI3,100);		
	}
	
	@Test
	void test002_MontoImponible() {
		double monto = ingreso1.montoImponible();
		
		assertEquals(monto, 250.80);
	}
}
