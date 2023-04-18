package org.itson.controladores;

import org.itson.dominio.Administrador;
import org.itson.dominio.Autor;
import org.itson.dominio.Cliente;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Encriptador;

/**
 *
 * @author mig_2
 */
public class ControladorUsuario {

    private ControladorUsuario() {
        throw new IllegalStateException("Utility class");
    }

    public static Cliente persistirCliente(Cliente cliente) {
        String hashedPassowrd = Encriptador.encriptarPassword(cliente.getPassword());
        cliente.setPassword(hashedPassowrd);

        return new UnitOfWork()
                .clientesRepository()
                .agregar(cliente);
    }

    public static Administrador persistirAdministrador(Administrador administrador) {
        String hashedPassword = Encriptador.encriptarPassword(administrador.getPassword());
        administrador.setPassword(hashedPassword);

        return new UnitOfWork()
                .administradoresRepository()
                .agregar(administrador);
    }

    public static Autor persistirAutor(Autor autor) {

        String hashedPassword = Encriptador.encriptarPassword(autor.getPassword());
        autor.setPassword(hashedPassword);

        return new UnitOfWork()
                .autoresRepository()
                .agregar(autor);

    }

}
