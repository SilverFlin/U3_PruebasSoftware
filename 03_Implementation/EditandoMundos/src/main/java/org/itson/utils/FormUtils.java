package org.itson.utils;

import javax.swing.JFrame;
import org.itson.presentacion.FrmIniciarSesion;
import org.itson.presentacion.JFrameActualizable;

/**
 *
 * @author Toled
 */
public class FormUtils {

    private FormUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static <T extends JFrame> void cargarForm(T cargar, JFrame actual) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }
    
    public static <T extends JFrameActualizable> void cargarForm(T cargar, JFrame actual) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.actualizaFrame();
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    public static void cerrarSesion(JFrame actual) {
        FrmIniciarSesion iniciarSesionForm = new FrmIniciarSesion();
        iniciarSesionForm.setVisible(true);
        actual.dispose();
    }

    public static void regresar(JFrameActualizable frmAnterior, JFrame actual) {
        frmAnterior.actualizaFrame();
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }
    
    public static void regresar(JFrame frmAnterior, JFrame actual) {
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }

}
