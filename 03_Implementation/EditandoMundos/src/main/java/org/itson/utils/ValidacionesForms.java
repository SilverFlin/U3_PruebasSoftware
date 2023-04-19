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

    public static boolean isValidEmail(String email) {

        String regex = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";

        return email.matches(regex);
    }

    public static boolean isMismaPassword(String password, String confirmPassword) {
        return password.matches(confirmPassword);
    }

    public static boolean isValidTelefono(String telefono) {
        // TODO buscar regex para telefono.
        return telefono.length() >= 8 && telefono.length() <= 10;
    }

}
