package ar.com.repaso;

public interface ISistema {
	public void procesarMensaje(String msj, NivelSeveridad ns);
	public void cambiarReglaDePublicacion(IReglaDePublicacion rp);
}
