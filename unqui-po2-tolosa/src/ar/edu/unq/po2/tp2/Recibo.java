package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class Recibo {
	// Atributos
	private LocalDate fechaEmision;
	private String nombre;
	private String direccion; 
	private double sueldoBruto;
	private double retenciones;
	private double sueldoNeto;
	private List<Concepto> desgloce;
	
	
	// Constructor
	public Recibo(Empleado e) {
		this.setFechaEmision(LocalDate.now());
		this.setNombre(e.getNombre());
		this.setDireccion(e.getDireccion());
		this.setSueldoBruto(e.sueldoBruto());
		this.setRetenciones(e.montoTotalRetenciones());
		this.setSueldoNeto(e.sueldoNeto());
		this.setDesgloce(e.desgloceSueldoNeto());
	}
	
	
	// Accessing
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public double getRetenciones() {
		return retenciones;
	}
	public void setRetenciones(double retenciones) {
		this.retenciones = retenciones;
	}
	public double getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	public List<Concepto> getDesgloce() {
		return desgloce;
	}
	public void setDesgloce(List<Concepto> desgloce) {
		this.desgloce = desgloce;
	}
	
}
