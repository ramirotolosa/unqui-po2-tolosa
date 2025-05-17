package ar.edu.unq.po2.tp3.equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo1;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	
	@BeforeEach
	void setUp() {
		equipo1 = new EquipoDeTrabajo("DreamTeam");
		persona1 = new Persona("Pepe", "a", 25);
		persona2 = new Persona("Pepe", "b", 18);
		persona3 = new Persona("Pepe", "c", 60);
		persona4 = new Persona("Pepe", "d", 32);
		
		equipo1.agregarIntegrante(persona1);
		equipo1.agregarIntegrante(persona2);
		equipo1.agregarIntegrante(persona3);
		equipo1.agregarIntegrante(persona4);
	}

	@Test
	void test001_UnEquipoDeTrabajoTieneNombre() {
		String nombre = equipo1.getNombre();
		
		assertEquals(nombre, "DreamTeam");
	}
	
	@Test
	void test002_UnEquipoDeTrabajoTieneIntegrantes() {
		int cant = equipo1.cantidadDeIntegrantes();
		
		assertEquals(cant, 4);
	}
	
	@Test
	void test003_sumaTotalDeEdadesDeIntegrantesDeEquipoDeTrabajo() {
		int sum = equipo1.sumaTotalEdades();
		
		assertEquals(sum, 135);
	}
	
	@Test
	void test004_promedioDeEdadesDeIntegrantesDeEquipoDeTrabajo() {
		int promedio = equipo1.promedioEdadIntegrantes();
		
		assertEquals(promedio, 33);
	}

}
