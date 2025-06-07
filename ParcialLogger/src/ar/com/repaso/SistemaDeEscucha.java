package ar.com.repaso;

public class SistemaDeEscucha implements ISistema{
	// Atributos
	private IReglaDePublicacion reglaDePublicacion;
	private IMonitor monitor;
	
	// Constructor
	public SistemaDeEscucha(IReglaDePublicacion rp, IMonitor m) {
		this.setReglaDePublicacion(rp);
		this.setMonitor(m);
	}
	
	// Metodos
	public IReglaDePublicacion getReglaDePublicacion() {
		return reglaDePublicacion;
	}
	public void setReglaDePublicacion(IReglaDePublicacion reglaDePublicacion) {
		this.reglaDePublicacion = reglaDePublicacion;
	}
	public IMonitor getMonitor() {
		return monitor;
	}
	public void setMonitor(IMonitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public void procesarMensaje(String msj, NivelSeveridad ns) {
		this.getReglaDePublicacion().publicarMensaje(msj, ns, this.getMonitor());
	}

	@Override
	public void cambiarReglaDePublicacion(IReglaDePublicacion rp) {
		this.setReglaDePublicacion(rp);
		
	}
	
}
