package org.itson.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class ValidacionesFormsTest {

    public ValidacionesFormsTest() {
    }

    /**
     * Test of isValidText method, of class ValidacionesForms.
     */
    @Test
    public void testIsValidText() {
        System.out.println("isValidText");

        String texto = "hOla Hoola";
        boolean result = ValidacionesForms.isValidText(texto);
        assertTrue(result);

        String texto2 = "";
        boolean result2 = ValidacionesForms.isValidText(texto2);
        assertFalse(result2);

        String texto3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean result3 = ValidacionesForms.isValidText(texto3);
        assertFalse(result3);

    }

    /**
     * Test of isValidEmail method, of class ValidacionesForms.
     */
    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");

        String email = "toledorusso@outlook.com";
        assertTrue(ValidacionesForms.isValidEmail(email));

        String email2 = "toledorusso@outlook";
        assertFalse(ValidacionesForms.isValidEmail(email2));

        String email3 = "toledorussooutlook";
        assertFalse(ValidacionesForms.isValidEmail(email3));

        String email4 = "";
        assertFalse(ValidacionesForms.isValidEmail(email4));
    }

    /**
     * Test of isMismaPassword method, of class ValidacionesForms.
     */
    @Test
    public void testIsMismaPassword() {
        System.out.println("isMismaPassword");
        String password = "1234";
        String confirmPassword = "1234";
        assertTrue(ValidacionesForms.isMismaPassword(password, confirmPassword));

        String password1 = "1234";
        String confirmPassword1 = "abcd";
        assertFalse(ValidacionesForms.isMismaPassword(password1, confirmPassword1));

    }

    /**
     * Test of isValidTelefono method, of class ValidacionesForms.
     */
//    @Test
//    public void testIsValidTelefono() {
//        System.out.println("isValidTelefono");
//        String telefono = "";
//        boolean expResult = false;
//        boolean result = ValidacionesForms.isValidTelefono(telefono);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
