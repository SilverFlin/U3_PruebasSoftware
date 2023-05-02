package org.itson.controladores;

import org.itson.dominio.Administrador;
import org.itson.dominio.Autor;
import org.itson.dominio.Cliente;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.NombreCompleto;
import org.itson.dominio.Usuario;
import org.itson.presentacion.UnitOfWork;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class ControladorUsuarioTest {

    public ControladorUsuarioTest() {
    }

    /**
     * Test of persistirCliente method, of class ControladorUsuario.
     */
    @Test
    public void testPersistirCliente() {
        System.out.println("persistirCliente");
        String pass = "333";
        Cliente cliente = new Cliente(new Usuario("aas", pass), new NombreCompleto("Aaa", "aaa", "aaa"), "eee@eee.com", "1231231233", "123213");

        Cliente result = ControladorUsuario.persistirCliente(cliente);

        assertNotEquals(pass, result.getPassword());

        new UnitOfWork().clientesRepository().eliminar(cliente);
    }

    /**
     * Test of persistirAdministrador method, of class ControladorUsuario.
     */
    @Test
    public void testPersistirAdministrador() {
        System.out.println("persistirAdministrador");
        String pass = "333";
        Administrador administrador = new Administrador(new Usuario("eeeee", pass));
        Administrador result = ControladorUsuario.persistirAdministrador(administrador);
        assertNotEquals(pass, result.getPassword());
    }

    /**
     * Test of persistirAutor method, of class ControladorUsuario.
     */
    @Test
    public void testPersistirAutor() {
        System.out.println("persistirAutor");

        String pass = "333";

        Cliente cliente = new Cliente(new Usuario("tttt", pass), new NombreCompleto("Aaa", "aaa", "aaa"), "eee@eee.com", "1231231233", "123213");
        Autor autor = new Autor(cliente, 5, Nacionalidad.CANADIENSE);

        Autor result = ControladorUsuario.persistirAutor(autor);
        assertNotEquals(pass, result.getPassword());
    }
}
