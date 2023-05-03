/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.repositories;

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
public class UsuariosRepositoryTest {

    UsuariosRepository usuariosRepository = new UnitOfWork().usuariosRepository();

    public UsuariosRepositoryTest() {
    }

    /**
     * Test of obtenPorUsername method, of class UsuariosRepository.
     */
    @Test
    public void testObtenPorUsername() {
        System.out.println("obtenPorUsername");
        String username = "cliente";
        Usuario result = usuariosRepository.obtenPorUsername(username);
        assertNotNull(result);
    }

}
