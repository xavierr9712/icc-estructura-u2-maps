package test.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.Ejercicios;

public class ContarCaracteresTest {
    private final Ejercicios ejercicios = new Ejercicios();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    void setUpStreams() {
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testConteoBasico() {
        ejercicios.contarCaracteres("hola");
        String salida = outContent.toString().trim();
        assertTrue(salida.contains("h=1"));
        assertTrue(salida.contains("o=1"));
        assertTrue(salida.contains("l=1"));
        assertTrue(salida.contains("a=1"));
    }
}
