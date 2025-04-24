package ar.edu.unq.po2.tp2;

import java.util.Set;
import java.util.HashSet;

public class Empresa {
	// Atributos
	private String nombre;
	private String cuit;
	private Set<Empleado> empleados;
	private Set<Recibo> recibos;
	
	
	// Constructor
	public Empresa(String nom, String cuit, Set<Empleado> es, Set<Recibo> rs) {
		this.setNombre(nom);
		this.setCuit(cuit);
		this.setEmpleados(es);
		this.setRecibos(rs);
	}
	
	public Empresa(String nom, String cuit) { // constructor con sets vacios de entrada
		this.setNombre(nom);
		this.setCuit(cuit);
		this.setEmpleados(new HashSet<Empleado>());
		this.setRecibos(new HashSet<Recibo>());
	}
	
	// Accessing
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public Set<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}
	public Set<Recibo> getRecibos() {
		return recibos;
	}
	public void setRecibos(Set<Recibo> recibos) {
		this.recibos = recibos;
	}
	
	
	// Metodos
	public void agregarEmpleado(Empleado e) {
		this.getEmpleados().add(e);
	}
	
	public double montoTotalSueldosNetos() {
		double monto = 0;
		for (Empleado e : (this.getEmpleados())) {
			monto = monto + (e.sueldoNeto());
		}
		return monto;
	}
	
	public double montoTotalSueldosBrutos() {
		double monto = 0;
		for (Empleado e : (this.getEmpleados())) {
			monto = monto + (e.sueldoBruto());
		}
		return monto;
	}
	
	public double montoTotalRetenciones() {
		double monto = 0;
		for (Empleado e : (this.getEmpleados())) {
			monto = monto + (e.montoTotalRetenciones());
		}
		return monto;
	}
	
	public void liquidacionDeSueldos() {
		for (Empleado e : (this.getEmpleados())) {
			this.liquidarSueldoA(e);
		}
	}
	
	public void liquidarSueldoA(Empleado e) {
		this.archivarReciboDeSueldo(this.reciboDeSueldoPara(e));
	}
	
	public Recibo reciboDeSueldoPara(Empleado e) {
		return(new Recibo(e));
	}
	
	public void archivarReciboDeSueldo(Recibo r) {
		this.getRecibos().add(r);
	}
	
}
