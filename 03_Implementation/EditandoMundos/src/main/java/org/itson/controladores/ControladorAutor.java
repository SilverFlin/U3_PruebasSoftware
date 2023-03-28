/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.controladores;

import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.presentacion.UnitOfWork;

/**
 *
 * @author mig_2
 */
public class ControladorAutor {
    
    public static Autor persistirAutor(String nombres, String apellidoPaterno, String apellidoMaterno, String edad, Nacionalidad nacionalidad){
        Autor autorPersistir = new Autor(nombres, apellidoPaterno, apellidoMaterno, Integer.parseInt(edad), nacionalidad);
        return new UnitOfWork().autoresRepository().agregar(autorPersistir);
    }
    
}
