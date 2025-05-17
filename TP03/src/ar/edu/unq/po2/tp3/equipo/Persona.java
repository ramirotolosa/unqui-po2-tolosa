package ar.edu.unq.po2.tp3.equipo;

public class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	// Constructores
	public Persona(String n, String a, int e) {
		this.setNombre(n);
		this.setApellido(a);
		this.setEdad(e);
	}
	
	// Metodos (Accessing)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodos (Concretos)
}
