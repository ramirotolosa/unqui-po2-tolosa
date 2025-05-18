package ar.edu.unq.po2.tp4.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	Trabajador trabajador;
	Ingreso ingreso1;
	IngresoPorHorasExtras ingreso2;
	Ingreso ingreso3;
	IngresoPorHorasExtras ingreso4;
	Ingreso ingreso5;
	
	@BeforeEach
	void setUp() {
		trabajador = new Trabajador("Pepe");
		ingreso1 = new Ingreso("Enero", "Pago Mensual", 250.80);
		ingreso2 = new IngresoPorHorasExtras("Enero", "Horas extra Enero", 100, 5);
		ingreso3 = new Ingreso("Febrero", "Pago Mensual", 250.80);
		ingreso4 = new IngresoPorHorasExtras("Febrero", "Horas extra Febrero", 350, 10);
		ingreso5 = new Ingreso("Marzo", "Pago Mensual", 100);
	}

	@Test
	void test001_RegistroDeImponibles() {
		trabajador.registrarImponible(ingreso1);
		trabajador.registrarImponible(ingreso2);
		assertEquals((trabajador.getIngresos().size()),2);
		
	}
	
	@Test
	void test002_TotalPercibido() {
		trabajador.registrarImponible(ingreso1);
		trabajador.registrarImponible(ingreso2);
		trabajador.registrarImponible(ingreso3);
		trabajador.registrarImponible(ingreso4);
		trabajador.registrarImponible(ingreso5);
		
		assertEquals(trabajador.getTotalPercibido(), 1051.6);
	}
	
	@Test
	void test003_MontoImponible() {
		trabajador.registrarImponible(ingreso1);
		trabajador.registrarImponible(ingreso2);
		trabajador.registrarImponible(ingreso3);
		trabajador.registrarImponible(ingreso4);
		trabajador.registrarImponible(ingreso5);
		
		assertEquals(trabajador.getMontoImponible(), 601.6);
	}
	
	@Test
	void test004_ImpuestoAPagar() {
		trabajador.registrarImponible(ingreso1);
		trabajador.registrarImponible(ingreso2);
		trabajador.registrarImponible(ingreso3);
		trabajador.registrarImponible(ingreso4);
		trabajador.registrarImponible(ingreso5);
		
		assertEquals(trabajador.getImpuestoAPagar(), 12.032);
	}
	
}
