package ar.com.repaso;

import java.util.List;

public class Logger { // concreteSubject (observable)
	
	// Atributos
	private List<ISistema> sistemasRegistrados;
	
	// Constructor
	public Logger(List<ISistema> ls) {
		this.setSistemasRegistrados(ls);
	}
	
	// Metodos
	public List<ISistema> getSistemasRegistrados(){
		return this.sistemasRegistrados;
	}
	
	public void setSistemasRegistrados(List<ISistema> ls) {
		this.sistemasRegistrados = ls;
	}
	
	public void registrarSistema(ISistema s) {
		this.getSistemasRegistrados().add(s);
	}
	
	public void borrarSistemaRegistrado(ISistema s) {
		this.getSistemasRegistrados().remove(s);
	}
	
	public void recibirMensaje(String msj, NivelSeveridad ns) {
		List<ISistema> sistemas = this.getSistemasRegistrados();
		
		for (ISistema s : sistemas) {
			s.procesarMensaje(msj, ns);
		}
	}
	
}
