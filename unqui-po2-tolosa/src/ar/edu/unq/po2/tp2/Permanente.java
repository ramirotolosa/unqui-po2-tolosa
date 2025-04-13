package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.List;       
import java.util.ArrayList;

public class Permanente extends Empleado {
	// Atributos
	private int cantidadHijos;
	private int antiguedad;
	
	//Constructor
	public Permanente() {}
	
	public Permanente(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento, double sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre,direccion,esCasado,fechaDeNacimiento,sueldoBasico);
		this.cantidadHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	// Metodos
	public double montoAsignacionPorHijo() {
		int cantHijos = this.cantidadHijos;
		double monto = cantHijos * 150;
		return monto;
	}
	public double montoAsignacionPorConyuge() {
		if (this.getEsCasado()) {
			return 100;
		} else {
			return 0;
		}	
	}
	public double montoAsignacionPorAntiguedad() {
		int cantAnios = this.getAntiguedad();
		double monto = cantAnios * 50;
		return monto;
	}
	public double salarioFamiliar() {
		double hijos = this.montoAsignacionPorHijo();
		double conyuge = this.montoAsignacionPorConyuge();
		double antiguedad = this.montoAsignacionPorAntiguedad();
		return (hijos + conyuge + antiguedad);
	}
	public double sueldoBruto() {
		double sueldoBasico = this.getSueldoBasico();
		double salarioFamiliar = this.salarioFamiliar();
		return (sueldoBasico + salarioFamiliar);
	}
	public double montoObraSocial() {
		double montoSB = this.sueldoBruto() * 0.1;
		double montoPorHijo = this.getCantidadHijos() * 20;
		return (montoSB + montoPorHijo);
	}
	public double montoAportesJubilatorios() {
		double montoSB = this.sueldoBruto() * 0.15;
		return montoSB;
	}
	public double retenciones() {
		double montoOS = this.montoObraSocial();
		double montoAJ = this.montoAportesJubilatorios();
		return (montoOS + montoAJ);
	}
	public List<Concepto> desgloceDeConceptos(){
		//remuneraciones
		Concepto sueldoBasico = new Concepto("Sueldo basico", this.getSueldoBasico(),0);
		Concepto asignacionHijos = new Concepto("Asignacion por hijo(Salario Familiar)", this.montoAsignacionPorHijo(),0);
		Concepto asignacionConyuge = new Concepto("Asignacion por conyuge(Salario Familiar)", this.montoAsignacionPorConyuge(),0);
		Concepto antiguedad = new Concepto("Asignacion por antiguedad(Salario Familiar)", this.montoAsignacionPorAntiguedad(),0);
		//descuentos
		Concepto obraSocial = new Concepto("Obra Social",0,this.montoObraSocial());
		Concepto aportes = new Concepto("Aportes jubilatorios",0,this.montoAportesJubilatorios());
		
		List<Concepto> conceptos = new ArrayList<>();
		
		conceptos.add(sueldoBasico);
		conceptos.add(asignacionHijos);
		conceptos.add(asignacionConyuge);
		conceptos.add(antiguedad);
		conceptos.add(obraSocial);
		conceptos.add(aportes);
		
		return conceptos;
	}
		
	//Accessors
	public int getCantidadHijos() {
		return this.cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public int getAntiguedad() {
		return this.antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}

