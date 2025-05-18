package ar.edu.unq.po2.tp4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	// Atributos
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	// Constructores
	public Supermercado(String n, String d) { // por defecto la lista de productos tiene 0 productos.
		this.setNombre(n);
		this.setDireccion(d);
		this.setProductos(new ArrayList<>());
	}
	
	// Metodos (Accessing)
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProducto(Producto p) {
		this.getProductos().add(p);
	}
	
	public int getCantidadDeProductos() {
		return (this.getProductos().size());
	}
	
	public double getPrecioTotal() {
		double total = 0;
		if (this.getProductos().isEmpty()) {
			return total;
		} else {
			for (Producto p : (this.getProductos())) {
				total = total + p.getPrecio();
			}
		}
		return total;
	}
	
}
