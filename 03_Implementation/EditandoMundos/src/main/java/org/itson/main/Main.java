/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import org.itson.presentacion.IniciarSesionForm;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        cargarForm();
    }

    public static void cargarForm() {
        IniciarSesionForm clienteForm = new IniciarSesionForm();
        clienteForm.setVisible(true);
    }
}
