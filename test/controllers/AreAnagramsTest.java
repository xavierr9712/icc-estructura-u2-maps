import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controllers.Ejercicios;

public class AreAnagramsTest {
    @Test
    void testAnagramExamples() {
        assertTrue(Ejercicios.areAnagrams("listen", "silent"));
        assertFalse(Ejercicios.areAnagrams("hello", "bello"));
        assertTrue(Ejercicios.areAnagrams("triangle", "integral"));
    }

    @Test
    void testDifferentLength() {
        assertFalse(Ejercicios.areAnagrams("abc", "ab"));
    }
}
