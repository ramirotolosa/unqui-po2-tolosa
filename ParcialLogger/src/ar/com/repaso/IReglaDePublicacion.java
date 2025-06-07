package ar.com.repaso;

public interface IReglaDePublicacion { // Strategy
	public void publicarMensaje(String msj, NivelSeveridad ns, IMonitor m);
}
