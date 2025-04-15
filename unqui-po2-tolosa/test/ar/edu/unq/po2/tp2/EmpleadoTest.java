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
		LocalDate fecNac1 = LocalDate.parse("1999-10-22");
		empleadoPermanente = new Permanente("Rami","Calle falsa 123",false,fecNac1,500,3,5);
		// empleado temporal
		LocalDate fecNac4 = LocalDate.parse("2000-01-20");
		LocalDate fecFin4 = LocalDate.parse("2025-06-12");
		empleadoTemporal = new Temporal("Pepita","Cuis 123",false,fecNac4,250,fecFin4,25);
		// empleado contratado
		LocalDate fecNac5 = LocalDate.parse("1980-05-25");
		empleadoContratado = new Contratado("Jijito","Segurola y la Habana",true,fecNac5,360,101010,"Mercado Pago");
		
	}

	@Test
	public void testEmpleadoEdad() {
		assertEquals(25,empleadoPermanente.edad());
		assertEquals(25, empleadoTemporal.edad());
		assertEquals(44, empleadoContratado.edad());
	}
	@Test
	public void testEmpleadoSueldoNeto() {
		assertEquals(840, empleadoPermanente.sueldoNeto());
		assertEquals(875, empleadoTemporal.sueldoNeto());
		assertEquals(310, empleadoContratado.sueldoNeto());
	}

}
