package org.itson.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class EncriptadorTest {

    public EncriptadorTest() {
    }

    @Test
    public void testEncriptarPassword() {
        System.out.println("encriptarPassword");
        String password = "12345";

        String hash = Encriptador.encriptarPassword(password);

        boolean isValida = Encriptador.verificarPasswordConHash(password, hash);
        assertTrue(isValida);

        boolean noDebeSerValida = Encriptador.verificarPasswordConHash(password, hash + "hola");
        assertFalse(noDebeSerValida);

    }

}
