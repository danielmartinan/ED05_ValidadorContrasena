package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorContrasenaTest {
    ValidadorContrasena validador;

    @BeforeEach
    void setUp() {
        validador = new ValidadorContrasena();
    }

    @Test
    void testValidarContrasenaNula() {
        assertFalse(validador.validar(null));
    }

    @Test
    void testValidarContrasenaCorta(){
        assertFalse(validador.validar("abcd"));
    }

    @Test
    void testValidarContrasenaMinusculas(){
        assertFalse(validador.validar("contrasena"));
    }

    @Test
    void testValidarContrasenaMinusYMayus(){
        assertFalse(validador.validar("Contrasena"));
    }

    @Test
    void testValidarContrasenaMinusMayusYNumero() {
        assertFalse(validador.validar("Contrasena1"));
    }

    @Test
    void testValidarContrasenaSinMinuscula() {
        assertFalse(validador.validar("CONTRASENA1!"));
    }

    @Test
    void testValidarContrasenaValida() {
        assertTrue(validador.validar("Contrasena1!"));
    }
}