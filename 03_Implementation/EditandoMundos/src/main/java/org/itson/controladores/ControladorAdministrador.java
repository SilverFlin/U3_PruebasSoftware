package org.itson.controladores;

import org.itson.dominio.Administrador;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Encriptador;

/**
 *
 * @author mig_2
 */
public class ControladorAdministrador {

    private ControladorAdministrador() {
        throw new IllegalStateException("Utility class");
    }

    public static Administrador persistirAdministrador(
            final String username,
            final String password
    ) {
        String hashedPassword = Encriptador.encriptarPassword(password);
        Administrador administradorPersistir
                = new Administrador(username, hashedPassword);

        return new UnitOfWork()
                .administradoresRepository()
                .agregar(administradorPersistir);
    }
}
