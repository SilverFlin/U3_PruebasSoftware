package org.itson.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Toled
 */
public class Dialogs {

    public static final int OPCION_SI = JOptionPane.YES_OPTION;
    public static final int OPCION_NO = JOptionPane.NO_OPTION;

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
