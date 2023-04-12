package org.itson.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author Toled
 */
public class Encriptador {

    private Encriptador() {
        throw new IllegalStateException("Utility class");
    }

    public static String encriptarPassword(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    public static String encriptarPassword(char[] password) {
        return BCrypt.withDefaults().hashToString(12, password);
    }

    public static boolean verificarPasswordConHash(String password, String hashedPassword) {
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
        return result.verified;
    }
}
