package ar.edu.unq.po2.tp4.ejercicio3;

public class IngresoPorHorasExtras extends Ingreso {
	// Atributos
	private int cantHoras;
	
	//Constructor
	public IngresoPorHorasExtras(String mes, String co, double mon, int ca) {
		super(mes, co, mon);
		this.setCantHoras(ca);
	}
	
	// Metodos (Accessing)
	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}
	
}
