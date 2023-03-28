/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.controladores;

import org.itson.dominio.Administrador;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Encriptador;

/**
 *
 * @author mig_2
 */
public class ControladorAdministrador {
    
    public static Administrador persistirAdministrador(String username, String password){
        String contraseñaCifrada = Encriptador.encriptarPassword(password);
        Administrador administradorPersistir = new Administrador(username, contraseñaCifrada);
        return new UnitOfWork().administradoresRepository().agregar(administradorPersistir);
    }
    
}
