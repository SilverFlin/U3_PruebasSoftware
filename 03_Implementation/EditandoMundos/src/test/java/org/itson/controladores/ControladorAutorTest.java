package org.itson.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.ConfiguracionPaginado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class ControladorAutorTest {

    public UnitOfWork uw;

    public ControladorAutorTest() {
        this.uw = new UnitOfWork();
    }

    /**
     * Test of persistirAutor method, of class ControladorAutor.
     */
    @Test
    public void testPersistirAutor() {
        System.out.println("persistirAutor");
        Autor autorPersistir = getRandomAutor(1).get(0);
        Autor result = ControladorAutor.persistirAutor(autorPersistir);

        assertNotNull(result.getId());

        ControladorAutor.eliminarAutor(result);
    }

    /**
     * Test of consultaPaginado method, of class ControladorAutor.
     */
    @Test
    public void testConsultaPaginado() {
        System.out.println("consultaPaginado");
        int limitePaginado = 3;
        ConfiguracionPaginado paginado = new ConfiguracionPaginado(limitePaginado, 0);
        List<Autor> result = ControladorAutor.consultaPaginado(paginado);

        boolean cumpleLimitePaginado = limitePaginado >= result.size();
        assertTrue(cumpleLimitePaginado);
    }

//    @Test
//    public void testEliminarAutor() {
//        System.out.println("eliminarAutor");
//        Autor autor = getRandomAutor(1).get(0);
//        autor = ControladorAutor.persistirAutor(autor);
//        ControladorAutor.eliminarAutor(autor);
//        Exception exception = assertThrows(NumberFormatException.class, () -> {
//            ControladorAutor.persistirAutor(autor);
//        });
//
//    }

    /**
     * Test of modificarAutor method, of class ControladorAutor.
     */
    @Test
    public void testModificarAutor() {
        System.out.println("modificarAutor");
        Autor autor = getRandomAutor(1).get(0);
        autor = ControladorAutor.persistirAutor(autor);
        Autor autorNuevo = getRandomAutor(1).get(0);
        autorNuevo.setId(autor.getId());
        ControladorAutor.modificarAutor(autorNuevo);

        Autor autorGuardado = uw.autoresRepository()
                .consultaNombreYApellido(
                        autorNuevo.getNombres(),
                        autorNuevo.getApellidoPaterno()
                ).get(0);

        assertTrue(autorGuardado.getNombres().equals(autorNuevo.getNombres()));
        assertTrue(Objects.equals(autorGuardado.getId(), autor.getId()));
        ControladorAutor.eliminarAutor(autor);

    }

    public List<Autor> getRandomAutor(int cantidad) {
        List<Autor> autores = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Autor autor = new Autor();
            autor.setNombres("Ari" + Double.toString(Math.random()));
            autor.setApellidoPaterno("Miau" + Double.toString(Math.random()));
            autor.setApellidoMaterno("Choix");
            autor.setEdad(5);
            autor.setEmail("aa@aa.com");
            autor.setNacionalidad(Nacionalidad.CANADIENSE);
            autor.setUsername(Double.toString(Math.random()));
            autor.setPassword("123");
            autor.setTelefono("123456789");
            autor.setDireccion("Dir");

            autores.add(autor);
        }
        return autores;

    }
}
