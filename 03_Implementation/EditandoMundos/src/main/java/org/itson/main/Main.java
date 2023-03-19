/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.dominio.PublicacionDigital;
import org.itson.presentacion.IniciarSesionForm;
import org.itson.presentacion.UnitOfWork;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        probarListasUnitOfWork();
    }

    public static void cargarForm() {
        IniciarSesionForm clienteForm = new IniciarSesionForm();
        clienteForm.setVisible(true);
    }

    public static void probarListasUnitOfWork() {
        UnitOfWork unitOfWork = new UnitOfWork();

        List<PublicacionDigital> publicacionesDigitalesLista = unitOfWork.publicacionesDigitalesRepository().lista();

        for (PublicacionDigital publicacionesDigitales : publicacionesDigitalesLista) {
            System.out.println(publicacionesDigitales);
        }
    }
}
