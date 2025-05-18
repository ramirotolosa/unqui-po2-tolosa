package ar.edu.unq.po2.tp4.ejercicio2;

public class Producto {
	// Atributos
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	// Constructor
	public Producto(String n, double p, boolean b) { // constructor con todos los atribs
		this.setNombre(n);
		this.setPrecio(p);
		this.setPrecioCuidado(b);
	}
	
	public Producto(String n, double p) { // por default el producto no pertenece a precios cuidados
		this.setNombre(n);
		this.setPrecio(p);
		this.setPrecioCuidado(false);
	}
	
	// Metodos (Accessing)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean getPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	// Metodos
	public boolean esPrecioCuidado() {
		return(this.getPrecioCuidado());
	}
	
	public void aumentarPrecio(double np) {
		double precioActual = this.getPrecio();
		double precioNuevo = precioActual + np;
		this.setPrecio(precioNuevo);
	}
	

}
