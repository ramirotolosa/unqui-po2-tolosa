package ar.edu.unq.po2.tp4.ejercicio1;

public class ProductoPrimeraNecesidad extends Producto {
	// Constructor
	public ProductoPrimeraNecesidad(String n, double p, boolean b) { // constructor con todos los parametros
		super(n,(p*0.9),b);
	}
	
	public ProductoPrimeraNecesidad(String n, double p) { // por default el producto no pertenece a precios cuidados
		super(n,(p*0.9));
	}
}
