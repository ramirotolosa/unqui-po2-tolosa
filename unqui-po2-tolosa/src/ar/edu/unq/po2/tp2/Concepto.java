package ar.edu.unq.po2.tp2;

public class Concepto {
	// Atributos
	private String descripcion;
	private double montoRemuneracion;
	private double montoDescuento;
	
	
	// Constructor
	public Concepto(String descripcion, double montoRemuneracion, double montoDescuento) {
		this.setDescripcion(descripcion);
		this.setMontoRemuneracion(montoRemuneracion);
		this.setMontoDescuento(montoDescuento);
	}
	
	
	// Accsessing
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getMontoRemuneracion() {
		return montoRemuneracion;
	}
	public void setMontoRemuneracion(double montoRemuneracion) {
		this.montoRemuneracion = montoRemuneracion;
	}
	public double getMontoDescuento() {
		return montoDescuento;
	}
	public void setMontoDescuento(double montoDescuento) {
		this.montoDescuento = montoDescuento;
	}
	
}
