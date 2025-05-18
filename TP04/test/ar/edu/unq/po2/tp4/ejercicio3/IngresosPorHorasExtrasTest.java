package ar.edu.unq.po2.tp4.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresosPorHorasExtrasTest {

	IngresoPorHorasExtras ingreso1;
	IngresoPorHorasExtras ingreso2;
	
	@BeforeEach
	void setUp() {
		ingreso1 = new IngresoPorHorasExtras("Enero", "Horas extra Enero", 100, 5);
		ingreso2 = new IngresoPorHorasExtras("Febrero", "Horas extra Febrero", 350, 10);

	}

	@Test
	void test001_Constructor() {
		String mesI1 = ingreso1.getMes();
		String conceptoI2 = ingreso2.getConcepto();
		double montoI1 = ingreso1.getMonto();
		int hsExI2 = ingreso2.getCantHoras();
		
		assertEquals(mesI1,"Enero");
		assertEquals(conceptoI2,"Horas extra Febrero");
		assertEquals(montoI1,100);
		assertEquals(hsExI2,10);		
	}
	
	@Test
	void test002_MontoImponible() {
		double monto = ingreso2.montoImponible();
		
		assertEquals(monto, 0);
	}

}
