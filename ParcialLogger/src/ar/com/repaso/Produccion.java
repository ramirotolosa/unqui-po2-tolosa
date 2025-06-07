package ar.com.repaso;

import java.util.List;

public class Produccion implements IReglaDePublicacion{ // ConcreteStrategy
	// Atributos
	private List<NivelSeveridad> niveles;
	
	// Constructor
	public Produccion(List<NivelSeveridad> ns) {
		this.setNiveles(ns);
	}
	
	// Metodos
	public List<NivelSeveridad> getNiveles() {
		return niveles;
	}

	public void setNiveles(List<NivelSeveridad> niveles) {
		this.niveles = niveles;
	}
	
	@Override
	public void publicarMensaje(String msj, NivelSeveridad ns, IMonitor m) {
		List<NivelSeveridad> niveles = this.getNiveles();
		
		if (niveles.contains(ns)) {
			m.printScreen(msj, IMonitor.BLUE);
		}
		
	}

}
