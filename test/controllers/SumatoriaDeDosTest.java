import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controllers.Ejercicios;

public class SumatoriaDeDosTest {
    private final Ejercicios ejercicios = new Ejercicios();

    @Test
    void testSolucionExiste() {
        int[] nums = {9,2,3,6};
        int[] resultado = ejercicios.sumatoriaDeDos(nums, 5);
        assertNotNull(resultado);
        assertArrayEquals(new int[]{1,2}, resultado);
    }

    @Test
    void testSinSolucion() {
        int[] nums = {9,2,3,6};
        assertNull(ejercicios.sumatoriaDeDos(nums, 10));
    }
}
