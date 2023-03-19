/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.PublicacionDigital;
import org.itson.presentacion.IniciarSesionForm;
import org.itson.presentacion.UnitOfWork;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        probarAgregar();
        probarListasUnitOfWork();
    }

    public static void cargarForm() {
        IniciarSesionForm clienteForm = new IniciarSesionForm();
        clienteForm.setVisible(true);
    }

    public static void probarListasUnitOfWork() {
        UnitOfWork unitOfWork = new UnitOfWork();

        List<Autor> autoresLista = unitOfWork.autoresRepository().lista();

        for (Autor autores : autoresLista) {
            System.out.println(autores);
        }
    }

    public static void probarAgregar() {
        UnitOfWork unitOfWork = new UnitOfWork();

        Autor autor = new Autor();
        autor.setApellidoMaterno("Russo");
        autor.setApellidoPaterno("Toledo");
        autor.setEdad(5);
        autor.setNacionalidad(Nacionalidad.MEXICANA);
        autor.setNombre("Luis Angel");

        unitOfWork.autoresRepository().agregar(autor);
    }
}
