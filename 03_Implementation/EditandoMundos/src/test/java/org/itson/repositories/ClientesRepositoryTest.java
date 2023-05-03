package org.itson.repositories;

import java.util.Optional;
import org.itson.dominio.Cliente;
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
public class ClientesRepositoryTest {
    
    ClientesRepository clientesRepository = new UnitOfWork().clientesRepository();
    
    public ClientesRepositoryTest() {
    }

    /**
     * Test of obtenPorUsername method, of class ClientesRepository.
     */
    @Test
    public void testObtenPorUsername() {
        System.out.println("obtenPorUsername");
        String username = "cliente";
        Optional<Cliente> result = clientesRepository.obtenPorUsername(username);
        assertTrue(result.isPresent());
    }

    /**
     * Test of obtenPorEmail method, of class ClientesRepository.
     */
    @Test
    public void testObtenPorEmail() {
        System.out.println("obtenPorEmail");
        String email = "toledo@russo.com";
        Optional<Cliente> result = clientesRepository.obtenPorEmail(email);
        assertTrue(result.isPresent());
    }
    
}
