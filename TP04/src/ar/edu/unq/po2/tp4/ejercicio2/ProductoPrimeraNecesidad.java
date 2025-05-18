package ar.edu.unq.po2.tp4.ejercicio2;


public class ProductoPrimeraNecesidad extends Producto {
	// Atributos
	private double porcentajeDescuento;

	// Constructor
	public ProductoPrimeraNecesidad(String n, double p, boolean b, double pd) { // constructor con todos los parametros
		super(n,p,b);
		this.setPorcentajeDescuento(pd);
		
	}
	
	public ProductoPrimeraNecesidad(String n, double p, double pd) { // por default el producto no pertenece a precios cuidados
		super(n,p);
		this.setPorcentajeDescuento(pd);
	}
	
	// Metodos (Accessing)
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	// Metodos 
	public double calcularPrecio() {
		double precioActual       = this.getPrecio();
		double descuento          = this.getPorcentajeDescuento();
		double precioConDescuento = precioActual * ((100 - descuento)/100);
		double precioRedondeado   = Math.round(precioConDescuento * 100) / 100.0;
		
		
		return precioRedondeado;
				
	}
	
}
