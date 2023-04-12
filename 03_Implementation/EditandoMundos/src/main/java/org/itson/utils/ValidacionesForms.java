package org.itson.utils;

/**
 *
 * @author mig_2
 */
public class ValidacionesForms {

    private ValidacionesForms() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValidText(String texto) {
        // Expresión regular que valida un string de 1 a 100 caracteres
        String regex = "^.{1,100}$";
        // Validar el texto con la expresión regular
        return texto.matches(regex);
    }

}
