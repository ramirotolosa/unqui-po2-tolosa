package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratado extends Empleado {
	// Atributos
	private int numeroContrato;
	private String medioDePago;
	
	
	// Constructores
	public Contratado(String nom, String dir, EstadoCivil ec, LocalDate fecNac, double sb, int nc, String mdp) {
		super(nom,dir,ec,fecNac,sb);
		this.setNumeroContrato(nc);
		this.setMedioDePago(mdp);
	}
	
	
	//Accessing

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	
	// Metodos
	@Override
	public double montoTotalBeneficios() {
		return 0;
	}

	@Override
	public double montoDescuentoObraSocial() {
		return 0;
	}

	@Override
	public double montoDescuentoAportes() {
		return 0;
	}

	@Override
	public double montoDescuentoGastosAdministrativos() {
		return 50;
	}

	@Override
	public List<Concepto> desgloceSueldoBruto() {
		List<Concepto> desgloce = new ArrayList<Concepto>();
		// items que intervienen en el calculo del sueldo bruto
		desgloce.add(this.generarConcepto("Sueldo basico", this.getSueldoBasico(), 0));
		
		return desgloce;
	}

}
