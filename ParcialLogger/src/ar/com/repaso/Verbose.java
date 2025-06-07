package ar.com.repaso;

import java.util.List;
import java.util.stream.Collectors;

public class Verbose implements IReglaDePublicacion{
	// Atributos
	private List<String> mensajesEnviados;
	private IEmailApp apiEmail;
	
	// Constructor
	public Verbose(List<String> msjs, IEmailApp api) {
		this.setMensajesEnviados(msjs);
		this.setApiEmail(api);
	}
	
	// Metodos
	public List<String> getMensajesEnviados() {
		return mensajesEnviados;
	}

	public void setMensajesEnviados(List<String> mensajesEnviados) {
		this.mensajesEnviados = mensajesEnviados;
	}

	public IEmailApp getApiEmail() {
		return apiEmail;
	}

	public void setApiEmail(IEmailApp apiEmail) {
		this.apiEmail = apiEmail;
	}

	@Override
	public void publicarMensaje(String msj, NivelSeveridad ns, IMonitor m) {
		this.agregarMensaje(msj);
		m.printScreen(msj, IMonitor.GRAY);
		
		if (this.puedeEnviarEmail()) {
			this.avisarPorEmailA("x");
		}
	}

	private void avisarPorEmailA(String destinatario) {
		this.getApiEmail().sendEmail(destinatario, "Mensajes guardados", this.textoConTodosLosMensajes());
	}

	public String textoConTodosLosMensajes() {
		List<String> mensajes = this.getMensajesEnviados();
		
		return mensajes.stream()
				       .collect(Collectors.joining());
	}

	private boolean puedeEnviarEmail() {
		return (this.getMensajesEnviados().size()) >= 100;
	}

	private void agregarMensaje(String msj) {
		this.getMensajesEnviados().add(msj);
	}
	
}
