package org.itson.controladores;

import java.util.List;
import org.itson.dominio.Autor;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.ConfiguracionPaginado;
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
public class ControladorPublicacionTest {

    private UnitOfWork unitOfWork = new UnitOfWork();
    private Autor autor = this.unitOfWork.autoresRepository().consultaNombreYApellido("Luis Angel", "Toledo").get(0);

    public ControladorPublicacionTest() {
    }

    /**
     * Test of guardarPublicacion method, of class ControladorPublicacion.
     */
    @Test
    public void testGuardarPublicacion() {
        System.out.println("guardarPublicacion");
        PublicacionDigital publicacionDigital = crearPublicacionDigital();
        float costoProduccionFloat = 5.3F;
        Publicacion resultDigital = ControladorPublicacion.guardarPublicacion(publicacionDigital, costoProduccionFloat);
        publicacionDigital.setCostoProd(Math.round(costoProduccionFloat));

        int costoProduccionInt = 5;
        int costoVentaDigital = 1380;
        int costoVentaFisica = 34500;

        assertEquals(costoProduccionInt, resultDigital.getCostoProd());
        assertEquals(costoVentaDigital, resultDigital.getCostoVenta());

        PublicacionFisica publicacionFisica = crearPublicacionFisica();

        Publicacion resultFisica = ControladorPublicacion.guardarPublicacion(publicacionFisica, costoProduccionFloat);
        assertEquals(costoProduccionInt, resultFisica.getCostoProd());

        assertEquals(costoVentaFisica, resultFisica.getCostoVenta());

        this.unitOfWork.publicacionesDigitalesRepository().eliminar(publicacionDigital);
        this.unitOfWork.publicacionesFisicasRepository().eliminar(publicacionFisica);
    }

    /**
     * Test of editarPublicacion method, of class ControladorPublicacion.
     */
    @Test
    public void testEditarPublicacion() {
        System.out.println("editarPublicacion");
        PublicacionDigital publicacion = crearPublicacionDigital();
        ControladorPublicacion.guardarPublicacion(publicacion, 4);

        String tituloActual = publicacion.getTitulo();
        String tituloNuevo = tituloActual + "123123";
        publicacion.setTitulo(tituloNuevo);

        Publicacion pubGuardada = ControladorPublicacion.editarPublicacion(publicacion);

        assertEquals(pubGuardada.getTitulo(), tituloNuevo);
        this.unitOfWork.publicacionesDigitalesRepository().eliminar(publicacion);

    }

    /**
     * Test of eliminarPublicacion method, of class ControladorPublicacion.
     */
    @Test
    public void testEliminarPublicacion() {
        System.out.println("eliminarPublicacion");
        int publicacionesActuales = autor.getPublicaciones().size();

        PublicacionDigital publicacion = crearPublicacionDigital();
        ControladorPublicacion.guardarPublicacion(publicacion, 4);

        ControladorPublicacion.eliminarPublicacion(publicacion);

        assertEquals(publicacionesActuales, autor.getPublicaciones().size());
    }

    private PublicacionDigital crearPublicacionDigital() {
        PublicacionDigital publicacionDigital = new PublicacionDigital();
        publicacionDigital.setAutor(this.autor);
        publicacionDigital.setNoPaginas(4);
        publicacionDigital.setTitulo("asd");
        publicacionDigital.setSizeMegas(8.2);
        return publicacionDigital;
    }

    private PublicacionFisica crearPublicacionFisica() {
        PublicacionFisica publicacionFisica = new PublicacionFisica();

        publicacionFisica.setAutor(this.autor);
        publicacionFisica.setNoPaginas(100);
        publicacionFisica.setTitulo("asd");
        publicacionFisica.setNombreLibro("aaa");
        publicacionFisica.setPaginaInicial(1);
        return publicacionFisica;

    }

}
