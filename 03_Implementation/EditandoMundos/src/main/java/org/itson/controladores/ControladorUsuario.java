package org.itson.controladores;

import org.itson.dominio.Cliente;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Encriptador;

/**
 *
 * @author mig_2
 */
public class ControladorCliente {

    private ControladorCliente() {
        throw new IllegalStateException("Utility class");
    }

    public static Cliente persistirCliente(String username, String password) {
        String hashedPassowrd = Encriptador.encriptarPassword(password);
        Cliente clientePersistir = new Cliente(username, hashedPassowrd);
        return new UnitOfWork().clientesRepository().agregar(clientePersistir);
    }
}
