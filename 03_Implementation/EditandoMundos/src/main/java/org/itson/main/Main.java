package org.itson.main;

import org.itson.dominio.Administrador;
import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
import org.itson.dominio.Usuario;
import org.itson.presentacion.IniciarSesionForm;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Dialogs;
import org.itson.utils.Encriptador;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        iniciarApp();
    }

    public static void agregarAutorYPublicaciones() {
        Autor autor = agregarAutor();
        PublicacionFisica pubFisica = agregarPubFisica(autor);
        PublicacionDigital pubDigital = agregarPubDigital(autor);

        imprimirEntidades(pubDigital, pubFisica, autor);
    }

    public static PublicacionFisica agregarPubFisica(Autor autor) {
        UnitOfWork unitOfWork = new UnitOfWork();

        PublicacionFisica pubFisica = new PublicacionFisica();
        pubFisica.setTitulo("Mistborn");
        pubFisica.setAutor(autor);
        pubFisica.setPaginaInicial(1);
        pubFisica.setNoPaginas(100);

        return unitOfWork.publicacionesFisicasRepository().agregar(pubFisica);
    }

    public static PublicacionDigital agregarPubDigital(Autor autor) {
        UnitOfWork unitOfWork = new UnitOfWork();

        PublicacionDigital pubDigital = new PublicacionDigital();
        pubDigital.setTitulo("Mistborn");
        pubDigital.setAutor(autor);
        pubDigital.setIsDensa(true);
        pubDigital.setSizeMegas(7.7);
        pubDigital.setNoPaginas(100);

        return unitOfWork.publicacionesDigitalesRepository().agregar(pubDigital);
    }

    private static Autor agregarAutor() {
        Autor autor = new Autor();
        autor.setApellidoMaterno("Russo");
        autor.setApellidoPaterno("Toledo");
        autor.setEdad(5);
        autor.setNacionalidad(Nacionalidad.MEXICANA);
        autor.setNombre("Luis Angel");

        UnitOfWork unitOfWork = new UnitOfWork();
        return unitOfWork.autoresRepository().agregar(autor);
    }

    public static Usuario agregarAdminPrueba() {

        UnitOfWork unitOfWork = new UnitOfWork();

        Administrador administrador = new Administrador();
        administrador.setUsername("admin");

        // TODO Esto se debe efectuar en otra parte
        String passwordEncriptada = Encriptador.encriptarPassword("admin");
        administrador.setPassword(passwordEncriptada);
        try {
            administrador = unitOfWork.administradoresRepository().agregar(administrador);
        } catch (Exception e) {
            System.out.println("Admin prueba ya agregado");
        }

        imprimirEntidades(administrador);
        return administrador;
    }

    private static void imprimirEntidades(Object... entidades) {

        for (Object entidad : entidades) {
            System.out.println(entidad);
        }
    }

    private static void iniciarApp() {
        agregarAdminPrueba();
        IniciarSesionForm iniciarSesionForm = new IniciarSesionForm();
        iniciarSesionForm.setVisible(true);
        Dialogs.mostrarMensajeExito(iniciarSesionForm, """
                                                       Admin Prueba:
                                                       usuario: admin
                                                       password: admin
                                                       """);
    }
}
