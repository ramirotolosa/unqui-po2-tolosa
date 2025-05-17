package ar.edu.unq.po2.tp3.equipo;

import java.util.HashSet;
import java.util.Set;

public class EquipoDeTrabajo {
	// Atributos
	private String nombre;
	private Set<Persona> integrantes;
	
	// Constructor
	public EquipoDeTrabajo(String n) { // constructor default con el conjunto de integrantes vacio.
		this.setNombre(n);
		this.setIntegrantes(new HashSet<>());
	}
	
	// Metodos (accessing)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Persona> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(Set<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public void agregarIntegrante(Persona p) {
		this.getIntegrantes().add(p);
	}
	
	public int cantidadDeIntegrantes() {
		Set<Persona> integrantes = this.getIntegrantes();
		
		return(integrantes.size());
	}
	
	public int sumaTotalEdades() {
		Set<Persona> integrantes = this.getIntegrantes();
		int total = 0;
		
		if (integrantes.isEmpty()) {
			return total;
		} else {
			for (Persona i : integrantes) {
				total = total + i.getEdad();
			}
		}
		return total;
	}
	
	public int promedioEdadIntegrantes() {
		return(this.sumaTotalEdades()/this.cantidadDeIntegrantes());
	}
	
}
