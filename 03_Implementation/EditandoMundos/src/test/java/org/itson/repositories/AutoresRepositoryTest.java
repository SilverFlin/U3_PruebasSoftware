package org.itson.repositories;

import java.util.List;
import org.itson.dominio.Autor;
import org.itson.presentacion.UnitOfWork;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class AutoresRepositoryTest {

    AutoresRepository autoresRepository = new UnitOfWork().autoresRepository();

    public AutoresRepositoryTest() {
    }

    /**
     * Test of consultaNombreYApellido method, of class AutoresRepository.
     */
    @Test
    public void testConsultaNombreYApellido() {
        System.out.println("consultaNombreYApellido");

        String nombres = "Luis Angel";
        String apellidoPaterno = "Toledo";
        AutoresRepository instance = autoresRepository;

        List<Autor> result = instance.consultaNombreYApellido(nombres, apellidoPaterno);

        assertTrue(result.size() >= 1);
    }

}
