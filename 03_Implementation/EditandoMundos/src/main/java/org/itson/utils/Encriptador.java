/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author Toled
 */
public class Encriptador {
    public static String encriptarPassword(String password){
        String bcryptHashString  = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        return bcryptHashString;
    }
    
    public static boolean verificarPasswordConHash(String password, String hashedPassword){
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
        return result.verified;
    }
}
