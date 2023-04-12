package org.itson.controladores;

import java.util.List;
import org.itson.dominio.Autor;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.ConfiguracionPaginado;

/**
 *
 * @author mig_2
 */
public class ControladorAutor {

    private ControladorAutor() {
        throw new IllegalStateException("Utility class");
    }

    public static Autor persistirAutor(Autor autorPersistir) {
        return new UnitOfWork().autoresRepository().agregar(autorPersistir);
    }

    public static List<Autor> consultaPaginado(ConfiguracionPaginado paginado) {
        return new UnitOfWork().autoresRepository().consultaPaginado(paginado.getOffset(), paginado.getLimite());
    }

    public static void eliminarAutor(Autor autor) {
        new UnitOfWork().autoresRepository().eliminar(autor);
    }

    public static void modificarAutor(Autor autor) {
        new UnitOfWork().autoresRepository().actualizar(autor);
    }
}
