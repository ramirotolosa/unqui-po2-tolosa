package ar.com.repaso;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoggerTest {

	@BeforeEach
	void setUp() {
		
	}

	@Test
	void testLoggerRecibeUnMensajeYNotificaALosSistemasCorrespondientes() {
		// SETUP
		
		//Logger SUT
		Logger logger = new Logger(new ArrayList<ISistema>());
		
		// Sistema 1 DOC
		ISistema sistemaUno = mock(SistemaDeEscucha.class);
		
		// Sistema 2 DOC
		ISistema sistemaDos = mock(SistemaDeEscucha.class);
		
		// EXERCISE
		logger.registrarSistema(sistemaUno);
		logger.registrarSistema(sistemaDos);
		logger.borrarSistemaRegistrado(sistemaDos);
		logger.recibirMensaje("Hola", NivelSeveridad.FATAL);
			
		// VERIFY		
		verify(sistemaUno, times(1)).procesarMensaje("Hola", NivelSeveridad.FATAL);
		verify(sistemaDos, never()).procesarMensaje("Hola", NivelSeveridad.FATAL);
	}

}
