package org.itson.utils;

import javax.swing.JFrame;
import org.itson.presentacion.IniciarSesionForm;

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

    public static void cerrarSesion(JFrame actual) {
        IniciarSesionForm iniciarSesionForm = new IniciarSesionForm();
        iniciarSesionForm.setVisible(true);
        actual.dispose();
    }

    public static void regresar(JFrame frmAnterior, JFrame actual) {
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }

}
