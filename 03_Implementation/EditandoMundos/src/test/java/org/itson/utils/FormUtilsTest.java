/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.utils;

import javax.swing.JFrame;
import org.itson.presentacion.FrmAutores;
import org.itson.presentacion.JFrameActualizable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class FormUtilsTest {

    public FormUtilsTest() {
    }

    /**
     * Test of cargarForm method, of class FormUtils.
     */
    @Test
    public void testCargarForm_2args_1() {
        System.out.println("cargarForm");
        JFrame cargar = new JFrame();
        JFrame actual = new JFrame();
        FormUtils.cargarForm(cargar, actual);

        assertTrue(cargar.isVisible() && !actual.isVisible());
    }

    /**
     * Test of regresar method, of class FormUtils.
     */
    @Test
    public void testRegresar_JFrame_JFrame() {
        System.out.println("regresar");
        JFrame frmAnterior = new JFrame();
        JFrame actual = new JFrame();
        FormUtils.regresar(frmAnterior, actual);
        assertTrue(!actual.isVisible() && frmAnterior.isVisible());

    }

}
