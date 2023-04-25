package org.itson.utils;

import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
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
public class CotizadorTest {

    public CotizadorTest() {
    }

    /**
     * Test of calcularCostoVenta method, of class Cotizador.
     */
    @Test
    public void testCalcularCostoVentaFisicaCanadiense() {
        System.out.println("calcularCostoVenta");
        Publicacion publicacionFisica = new PublicacionFisica();
        publicacionFisica.setNoPaginas(10);
        publicacionFisica.setCostoProd(100);
        Autor autor = new Autor();
        autor.setNacionalidad(Nacionalidad.CANADIENSE);
        publicacionFisica.setAutor(autor);

        int expResult = 3750;
        int result = Cotizador.calcularCostoVenta(publicacionFisica);
        assertEquals(expResult, result);

    }

    @Test
    public void testCalcularCostoVentaFisicaMexicana() {
        System.out.println("calcularCostoVenta");
        Publicacion publicacionFisica = new PublicacionFisica();
        publicacionFisica.setNoPaginas(10);
        publicacionFisica.setCostoProd(100);
        Autor autor = new Autor();
        autor.setNacionalidad(Nacionalidad.MEXICANA);
        publicacionFisica.setAutor(autor);

        int expResult = 3450;
        int result = Cotizador.calcularCostoVenta(publicacionFisica);
        assertEquals(expResult, result);

    }

    @Test
    public void testCalcularCostoVentaDigitalCanadiense() {
        System.out.println("calcularCostoVenta");
        PublicacionDigital publicacionDigital = new PublicacionDigital();
        publicacionDigital.setNoPaginas(10);
        publicacionDigital.setSizeMegas(5.0);
        publicacionDigital.setCostoProd(100);
        Autor autor = new Autor();
        autor.setNacionalidad(Nacionalidad.CANADIENSE);
        publicacionDigital.setAutor(autor);

        int expResult = 3450;
        int result = Cotizador.calcularCostoVenta(publicacionDigital);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularCostoVentaDigitalMexicano() {
        System.out.println("calcularCostoVenta");
        PublicacionDigital publicacionDigital = new PublicacionDigital();
        publicacionDigital.setNoPaginas(10);
        publicacionDigital.setSizeMegas(5.0);
        publicacionDigital.setCostoProd(100);
        Autor autor = new Autor();
        autor.setNacionalidad(Nacionalidad.MEXICANA);
        publicacionDigital.setAutor(autor);

        int expResult = 3450;
        int result = Cotizador.calcularCostoVenta(publicacionDigital);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularCostoProduccion method, of class Cotizador.
     */
    @Test
    public void testCalcularCostoProduccion() {
        System.out.println("calcularCostoProduccion");
        int numPaginas = 30;
        int expResult = 9000;
        int result = Cotizador.calcularCostoProduccion(numPaginas);
        assertEquals(expResult, result);

        int numPaginas1 = 0;
        int expResult1 = 0;
        int result1 = Cotizador.calcularCostoProduccion(numPaginas1);
        assertEquals(expResult1, result1);
    }

    @Test
    public void testCalcularCostoProduccionError() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> Cotizador.calcularCostoProduccion(-1),
                "Expected calcularCostoProduccion() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contentEquals("Número de páginas invalido."));
    }

}
