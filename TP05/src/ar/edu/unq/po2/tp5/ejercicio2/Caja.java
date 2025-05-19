package ar.edu.unq.po2.tp5.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	// atributos
	private List<Registrable> registro;
	
	// constructor
	public Caja() {
		this.setRegistro(new ArrayList<>());
	}
	
	// accesing
	public List<Registrable> getRegistro() {
		return registro;
	}

	public void setRegistro(List<Registrable> registro) {
		this.registro = registro;
	}
	
	// metodos
	public void registrar(Registrable r) {
		this.getRegistro().add(r);
	}
	
	public double montoAPagar() {
		double total = 0;
		List<Registrable> registro = this.getRegistro(); 
		
		if (registro.isEmpty()) {
			return total;
		} else {
			for (Registrable r : registro) {
				total = total + r.precioFinal();
				r.decrementarStock();
			}
		}
		
		return total;
	}
	
	
}
