package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmpleadoTest {
	private Empleado empleadoPermanente;
	private Empleado empleadoTemporal;
	private Empleado empleadoContratado;
	
	@BeforeEach
	public void setUp() {
		//empleado permanente
		EstadoCivil casado = new Casado();
		LocalDate fecNac1 = LocalDate.parse("1999-10-22");
		empleadoPermanente = new Permanente("Rami","Calle falsa 123",casado,fecNac1,500,3,5);
		
		// empleado temporal
		EstadoCivil soltero = new Soltero();
		LocalDate fecNac4 = LocalDate.parse("2000-01-20");
		LocalDate fecFin4 = LocalDate.parse("2025-06-12");
		empleadoTemporal = new Temporal("Pepita","Cuis 123",soltero,fecNac4,250,fecFin4,25);
		
		// empleado contratado
		LocalDate fecNac5 = LocalDate.parse("1980-05-25");
		empleadoContratado = new Contratado("Pepo","Segurola y la Habana",soltero,fecNac5,360,101010,"Mercado Pago");		
	}

	@Test
	public void testEmpleadoEdad() {
		assertEquals(25,empleadoPermanente.calcularEdad());
		assertEquals(25, empleadoTemporal.calcularEdad());
		assertEquals(44, empleadoContratado.calcularEdad());
	}
	
	@Test
	public void testEmpleadoSueldoBruto() {
		assertEquals(1300, empleadoPermanente.sueldoBruto());
		assertEquals(1250, empleadoTemporal.sueldoBruto());
		assertEquals(360, empleadoContratado.sueldoBruto());
	}
	
	@Test
	public void testEmpleadomontoTotalRetenciones() {
		assertEquals(385, empleadoPermanente.montoTotalRetenciones());
		assertEquals(375, empleadoTemporal.montoTotalRetenciones());
		assertEquals(50, empleadoContratado.montoTotalRetenciones());
	}
	
	@Test
	public void testEmpleadoSueldoNeto() {
		assertEquals(915, empleadoPermanente.sueldoNeto());
		assertEquals(875, empleadoTemporal.sueldoNeto());
		assertEquals(310, empleadoContratado.sueldoNeto());
	}
	
}	


