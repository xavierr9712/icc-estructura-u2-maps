package test.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controllers.Ejercicios;

public class SonAnagramasTest {
    private final Ejercicios ejercicios = new Ejercicios();

    @Test
    void testAnagramas() {
        assertTrue(ejercicios.sonAnagramas("roma", "amor"));
        assertFalse(ejercicios.sonAnagramas("hola", "halo"));
    }
}
