package ar.edu.unq.po2.tp2;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Temporal extends Empleado {
	// Atributos
	private LocalDate finDesignacion;
	private int cantidadHorasExtra;
	
	
	// Constructores
	public Temporal(String nom, String dir, EstadoCivil ec, LocalDate fecNac, double sb, LocalDate fd, int he) {
		super(nom,dir,ec,fecNac,sb);
		this.setFinDesignacion(fd);
		this.setCantidadHorasExtra(he);
	}
	
	
	// Accessing
	public LocalDate getFinDesignacion() {
		return finDesignacion;
	}

	public void setFinDesignacion(LocalDate finDesignacion) {
		this.finDesignacion = finDesignacion;
	}

	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	
	// Metodos	
	@Override
	public double montoTotalBeneficios() {
		return(this.montoTotalHorasExtra());
	}
	
	public double montoTotalHorasExtra() {
		return(40 * (this.getCantidadHorasExtra()));
	}

	@Override
	public double montoDescuentoObraSocial() {
		double monto = (this.sueldoBruto()) * 0.1;
		int edad = this.calcularEdad();
		
		if (edad > 50) {
			return(monto + 25);
		} else {
			return(monto);
		}
	}

	@Override
	public double montoDescuentoAportes() {
		double monto = (this.sueldoBruto()) * 0.1;		
		return(monto + (5 * (this.getCantidadHorasExtra())));
	}

	@Override
	public double montoDescuentoGastosAdministrativos() {
		return 0;
	}

	@Override
	public List<Concepto> desgloceSueldoBruto() {
		List<Concepto> desgloce = new ArrayList<Concepto>();
		// items que intervienen en el calculo del sueldo bruto
		desgloce.add(this.generarConcepto("Sueldo basico", this.getSueldoBasico(), 0));
		desgloce.add(this.generarConcepto("Horas Extra", this.montoTotalHorasExtra(), 0));
		
		return desgloce;
	}	

}
