package ar.edu.unq.po2.tp5.ejercicio2;

public class Producto implements Registrable{
	// atributos
	private int stock;
	private double precioBase;
	
	// constructores
	public Producto(int s, double p) {
		this.setStock(s);
		this.setPrecioBase(p);
	}
	
	// accessing
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}
	
	// metodos
	@Override
	public double precioFinal() {
		return this.getPrecioBase();		
	}

	@Override
	public void decrementarStock() {
		this.setStock((this.getStock())-1);
	}
	
	@Override
	public int stockActual() {
		return this.getStock();
	}
	
	
}
