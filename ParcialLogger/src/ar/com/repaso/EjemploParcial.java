package ar.com.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploParcial {
	
	public void configurar() {
		// Logger
		Logger logger = new Logger(new ArrayList<ISistema>());
		
		// Sistema 1
		IEmailApp apiEmail; // no esta inicializado pero no tengo la implementacion xd
		IMonitor monitor1;
		
		ISistema sistemaUno = new SistemaDeEscucha(new Verbose(new ArrayList<String>(), apiEmail), monitor1);
		
		// Sistema 2
		List<NivelSeveridad> niveles = Arrays.asList(NivelSeveridad.ERROR, NivelSeveridad.FATAL);
		IMonitor monitor2;
		
		ISistema sistemaDos = new SistemaDeEscucha(new Produccion(niveles), monitor2);
		
		sistemaDos.cambiarReglaDePublicacion(new Verbose(new ArrayList<String>(), apiEmail));
	}
	
}
