package org.itson.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class ValidacionesTest {

    public ValidacionesTest() {
    }

    /**
     * Test of isPositivo method, of class Validaciones.
     */
    @Test
    public void testIsPositivo() {
        System.out.println("isPositivo");

        Double valorPositivo = 4.0;
        boolean isValorPositivo = Validaciones.isPositivo(valorPositivo);
        assertTrue(isValorPositivo);

        Double valorNegativo = -4.0;
        boolean isValorNegativo = Validaciones.isPositivo(valorNegativo);
        assertFalse(isValorNegativo);

        Double valorInvalido = null;
        boolean isValorInvalido = Validaciones.isPositivo(valorInvalido);
        assertFalse(isValorInvalido);

    }

    /**
     * Test of isNull method, of class Validaciones.
     */
    @Test
    public void testIsNull() {
        System.out.println("isNull");
        Object elemento = null;
        boolean result = Validaciones.isNull(elemento);
        assertTrue(result);

        String elementoNormal = "Hola";
        boolean result2 = Validaciones.isNull(elementoNormal);
        assertFalse(result2);

    }

    /**
     * Test of isDouble method, of class Validaciones.
     */
    @Test
    public void testIsDouble() {
        System.out.println("isDouble");

        String valor = "2.0";
        boolean result = Validaciones.isDouble(valor);
        assertTrue(result);

        String valor2 = "asdsad";
        boolean result2 = Validaciones.isDouble(valor2);
        assertFalse(result2);
    }

    /**
     * Test of isInteger method, of class Validaciones.
     */
    @Test
    public void testIsInteger() {
        System.out.println("isInteger");
        String valor = "4";
        boolean result = Validaciones.isInteger(valor);
        assertTrue(result);

        String valor2 = "AAAAA";
        boolean result2 = Validaciones.isInteger(valor2);
        assertFalse(result2);

    }

}
