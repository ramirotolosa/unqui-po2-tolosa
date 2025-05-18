package ar.edu.unq.po2.tp4.ejercicio3;

public class Ingreso implements Imponible {
	// Atributos
	private String mes;
	private String concepto;
	private double monto;
	
	//Constructor
	public Ingreso(String mes, String c, double mon) {
		this.setMes(mes);
		this.setConcepto(c);
		this.setMonto(mon);
	}
	
	// Metodos (Accessing)
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public double montoImponible() {
		return (this.getMonto());
	}
	

}
