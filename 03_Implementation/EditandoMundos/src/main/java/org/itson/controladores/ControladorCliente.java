/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.controladores;

import org.itson.dominio.Cliente;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Encriptador;

/**
 *
 * @author mig_2
 */
public class ControladorCliente {
    public static Cliente persistirCliente(String username, String password){
        String contraseñaCifrada = Encriptador.encriptarPassword(password);
        Cliente clientePersistir = new Cliente(username, contraseñaCifrada);
        return new UnitOfWork().clientesRepository().agregar(clientePersistir);
    }
}
