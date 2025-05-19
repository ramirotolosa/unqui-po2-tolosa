package ar.edu.unq.po2.tp5.ejercicio2;

public class ProductoCooperativa extends Producto {
	// atributos
	private double porcentajeDescuento;
	
	// constructor
	public ProductoCooperativa(int s, double p) {
		super(s,p);
		this.setPorcentajeDescuento(10);
	}
	
	// accessing
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	// metodos
	@Override
	public double precioFinal() {
		return ((this.getPrecioBase()) - ((this.getPrecioBase()*this.getPorcentajeDescuento())/100));
	}
	

	
}
