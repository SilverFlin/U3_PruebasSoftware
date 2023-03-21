/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

/**
 *
 * @author Toled
 */
public class Validaciones {

    public static boolean isPositivo(Double valor) {
        return !isNull(valor) && valor > 0;
    }

    public static <T> boolean isNull(T elemento) {
        return elemento == null;
    }

    public static boolean isDouble(String valor) {
        try {
            Double.valueOf(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isInteger(String valor) {
        try {
            Integer.valueOf(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
