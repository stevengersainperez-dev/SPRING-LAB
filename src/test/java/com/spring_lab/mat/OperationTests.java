package com.spring_lab.mat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTests {

    private final Operation operation = new Operation();

    @Test
    @DisplayName("Suma de dos positivos")
    void suma_positivos() {
        assertEquals(5, operation.suma(2, 3));
    }

    @Test
    @DisplayName("Suma con negativo")
    void suma_conNegativo() {
        assertEquals(1, operation.suma(3, -2));
    }

    @Test
    @DisplayName("Suma con cero")
    void suma_conCero() {
        assertEquals(7, operation.suma(7, 0));
    }

    @Test
    @DisplayName("Resta de dos positivos")
    void resta_positivos() {
        assertEquals(1, operation.resta(3, 2));
    }

    @Test
    @DisplayName("Resta que da negativo")
    void resta_negativa() {
        assertEquals(-1, operation.resta(2, 3));
    }

    @Test
    @DisplayName("Resta con cero")
    void resta_conCero() {
        assertEquals(5, operation.resta(5, 0));
    }

}
