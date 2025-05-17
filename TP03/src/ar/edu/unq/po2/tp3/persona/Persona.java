package ar.edu.unq.po2.tp3.persona;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	// Atributos
	private String nombre;
	private LocalDate fechaNacimiento;
	
	// Constructores
	public Persona(String n, LocalDate f) {
		this.setNombre(n);
		this.setFechaNacimiento(f);
	}
	
	// Metodos (accesing)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// Metodos (Concretos)
	public int edad() {
		LocalDate fn = this.getFechaNacimiento();
		LocalDate fa = LocalDate.now();
		int edad = Period.between(fn, fa).getYears();
		
		return edad;
	}

	public boolean menorQue(Persona p) {
		int edad1 = this.edad();
		int edad2 = p.edad();
		
		return (edad1 < edad2);
	}

}
