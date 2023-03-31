import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTemplate {

    @Test
    public void pruebaSuma() {
        // Preparación
        int a = 5;
        int b = 7;

        // Ejecución
        int resultado = a + b;

        // Comprobación
        Assertions.assertEquals(12, resultado);

        // Limpieza (opcional)
    }
}

