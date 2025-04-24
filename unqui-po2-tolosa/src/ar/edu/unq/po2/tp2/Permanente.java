package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Permanente extends Empleado {
	// Atributos
	private int cantidadHijos;
	private int antiguedad;
	
	
	// Constructor
	public Permanente(String nom, String dir, EstadoCivil ec, LocalDate fecNac, double sb, int ch, int ant) {
		super(nom, dir, ec, fecNac, sb);
		this.setCantidadHijos(ch);
		this.setAntiguedad(ant);
	}

	
	// Accessing
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	// Metodos
	
	@Override
	public double montoTotalBeneficios() {
		return(this.montoSalarioFamiliar());
	}
	
	public double montoSalarioFamiliar() {
		return((this.montoAsignacionPorHijo()) + (this.montoAsignacionPorConyuge()) + (this.montoAsignacionPorAntiguedad()));
	}
	
	public double montoAsignacionPorHijo() {
		double montoBase = 150;
		return(montoBase * (this.getCantidadHijos()));
	}
	
	public double montoAsignacionPorConyuge() {
		return(this.getEstadoCivil().montoPorConyuge());
	}
	
	public double montoAsignacionPorAntiguedad() {
		double montoBase = 50;
		return(montoBase * (this.getAntiguedad()));
	}
	
	@Override
	public double montoDescuentoObraSocial() {
		double porcentajeDelSueldoBruto = (this.sueldoBruto()) * 0.1;
		double descuentoTotalPorHijo = 20 * (this.getCantidadHijos());
		return(porcentajeDelSueldoBruto + descuentoTotalPorHijo);
	}

	@Override
	public double montoDescuentoAportes() {
		return((this.sueldoBruto()) * 0.15);
	}

	@Override
	public double montoDescuentoGastosAdministrativos() {
		return 0;
	}

	@Override
	public List<Concepto> desgloceSueldoBruto(){
		List<Concepto> desgloce = new ArrayList<Concepto>();
		// items que intervienen en el calculo del sueldo bruto
		desgloce.add(this.generarConcepto("Sueldo basico", this.getSueldoBasico(), 0));
		desgloce.add(this.generarConcepto("Asignacion por hijo", this.montoAsignacionPorHijo(), 0));
		desgloce.add(this.generarConcepto("Asignacion por conyuge", this.montoAsignacionPorConyuge(), 0));
		desgloce.add(this.generarConcepto("Asignacion por antiguedad", this.montoAsignacionPorAntiguedad(), 0));
		
		return desgloce;
	}

}
