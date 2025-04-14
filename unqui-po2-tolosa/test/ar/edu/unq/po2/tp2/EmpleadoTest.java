package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    private Empleado empleado1;

    @BeforeEach
    public void setUp() {
        LocalDate fecNac1 = LocalDate.parse("1999-10-22");
        empleado1 = new Permanente("Rami", "Calle falsa 123", false, fecNac1, 500, 3, 5);
    }

    @Test
    public void testNombre() {
        assertEquals("Rami", empleado1.getNombre());
    }
}
