package org.itson.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Toled
 */
public class Dialogs {

    private Dialogs() {
        throw new IllegalStateException("Utility class");
    }

    public static void mostrarMensajeError(Component componente, String msg) {
        JOptionPane.showMessageDialog(componente, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarMensajeExito(Component componente, String msg) {
        JOptionPane.showMessageDialog(componente, msg, "Exito", JOptionPane.PLAIN_MESSAGE);
    }

    public static int mostrarMensajeYesNoOption(Component componente, String msg, String titulo) {
        return JOptionPane.showConfirmDialog(componente, msg, titulo, JOptionPane.YES_NO_OPTION);

    }
}
