/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Toled
 */
public class ConfiguracionPaginadoTest {

    public ConfiguracionPaginadoTest() {
    }

    @Test
    public void testGetDefaultOffset() {
        System.out.println("getOffset");
        ConfiguracionPaginado instance = new ConfiguracionPaginado();
        int expResult = 0 * 5;
        int result = instance.getOffset();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetOffset() {
        System.out.println("getOffset");
        ConfiguracionPaginado instance = new ConfiguracionPaginado(10, 2);
        int expResult = 10 * 2;
        int result = instance.getOffset();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLimite method, of class ConfiguracionPaginado.
     */
    @Test
    public void testGetDefaultLimite() {
        System.out.println("getLimite");
        ConfiguracionPaginado instance = new ConfiguracionPaginado();
        int expResult = 5;
        int result = instance.getLimite();
        assertEquals(expResult, result);
    }

    /**
     * Test of avanzarPag method, of class ConfiguracionPaginado.
     */
    @Test
    public void testAvanzarPag() {
        System.out.println("avanzarPag");
        ConfiguracionPaginado instance = new ConfiguracionPaginado(10, 2);
        instance.avanzarPag();
        int expResult = 30;
        int result = instance.getOffset();
        assertEquals(expResult, result);

    }

    /**
     * Test of retrocederPag method, of class ConfiguracionPaginado.
     */
    @Test
    @Disabled
    public void testRetrocederPag() {
        System.out.println("retrocederPag");
        ConfiguracionPaginado instance = new ConfiguracionPaginado(10, 2);
        instance.retrocederPag();

        int expResult = 10;
        int result = instance.getOffset();
        assertEquals(expResult, result);

    }

    /**
     * Test of retrocederPag method, of class ConfiguracionPaginado.
     */
    @Test
    @Disabled
    public void testRetrocederPagLimiteInferior() {
        System.out.println("retrocederPag");
        ConfiguracionPaginado instance = new ConfiguracionPaginado(10, 0);
        instance.retrocederPag();
        int expResult = 0;
        int result = instance.getOffset();
        assertEquals(expResult, result);

    }

}
