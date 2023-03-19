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
import org.itson.dominio.PublicacionFisica;
import org.itson.presentacion.IniciarSesionForm;
import org.itson.presentacion.UnitOfWork;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        agregarAutorYPublicaciones();
    }

    public static void cargarForm() {
        IniciarSesionForm clienteForm = new IniciarSesionForm();
        clienteForm.setVisible(true);
    }

    public static void agregarAutorYPublicaciones() {
        Autor autor = agregarAutor();
        PublicacionFisica pubFisica = agregarPubFisica(autor);
        PublicacionDigital pubDigital = agregarPubDigital(autor);

        imprimirEntidades(autor, pubDigital, pubFisica);

    }

    public static PublicacionFisica agregarPubFisica(Autor autor) {
        UnitOfWork unitOfWork = new UnitOfWork();

        PublicacionFisica pubFisica = new PublicacionFisica();
        pubFisica.setTitulo("Mistborn");
        pubFisica.setAutor(autor);
        pubFisica.setPaginaInicial(0);

        return unitOfWork.publicacionesFisicasRepository().agregar(pubFisica);
    }

    public static PublicacionDigital agregarPubDigital(Autor autor) {
        UnitOfWork unitOfWork = new UnitOfWork();

        PublicacionDigital pubDigital = new PublicacionDigital();
        pubDigital.setTitulo("Mistborn");
        pubDigital.setAutor(autor);
        pubDigital.setIsDensa(true);
        pubDigital.setSizeMegas(7.7);

        return unitOfWork.publicacionesDigitalesRepository().agregar(pubDigital);
    }

    private static Autor agregarAutor() {
        UnitOfWork unitOfWork = new UnitOfWork();
        Autor autor = new Autor();
        autor.setApellidoMaterno("Russo");
        autor.setApellidoPaterno("Toledo");
        autor.setEdad(5);
        autor.setNacionalidad(Nacionalidad.MEXICANA);
        autor.setNombre("Luis Angel");

        return unitOfWork.autoresRepository().agregar(autor);
    }

    private static void imprimirEntidades(Object... entidades) {

        for (Object entidad : entidades) {
            System.out.println(entidad);
        }
    }
}
