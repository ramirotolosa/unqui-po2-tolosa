package ar.edu.unq.po2.tp4.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	// Atributos
	private String nombre;
	private List<Imponible> ingresos;
	
	// Constructor
	public Trabajador(String n) {
		this.setNombre(n);
		this.setIngresos(new ArrayList<>());
	}
	
	// Metodos (Accessing)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Imponible> getIngresos() {
		return ingresos;
	}
	public void setIngresos(List<Imponible> ingresos) {
		this.ingresos = ingresos;
	}
	
	public void registrarImponible(Imponible i) {
		this.getIngresos().add(i);
	}
	
	public double getTotalPercibido() {
		double total = 0;
		List<Imponible> ingresos = this.getIngresos();
		if (ingresos.isEmpty()) {
			return total;
		} else {
			for (Imponible i : ingresos) {
				total = total + (i.getMonto());
			}
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		List<Imponible> ingresos = this.getIngresos();
		if (ingresos.isEmpty()) {
			return total;
		} else {
			for (Imponible i : ingresos) {
				total = total + (i.montoImponible());
			}
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return ((this.getMontoImponible() * 2)/100);
	}
}
