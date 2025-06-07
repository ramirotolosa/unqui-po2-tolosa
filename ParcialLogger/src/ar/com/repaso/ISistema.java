package ar.com.repaso;

public interface ISistema { // Observer
	public void procesarMensaje(String msj, NivelSeveridad ns);
	public void cambiarReglaDePublicacion(IReglaDePublicacion rp);
}
