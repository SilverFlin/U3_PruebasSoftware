/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.controladores;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.itson.dominio.Autor;
import org.itson.dominio.Cliente;
import org.itson.dominio.DivisionPago;
import org.itson.dominio.EstadoPago;
import org.itson.dominio.MetodoPago;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.Pago;
import org.itson.dominio.PagoEfectivo;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
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
public class ControladorPagosTest {

    private PublicacionDigital publicacion;
    private Cliente cliente = new UnitOfWork().clientesRepository().obtenPorUsername("cliente").get();
    private Autor autor = new UnitOfWork().autoresRepository().consultaNombreYApellido("Luis Angel", "Toledo").get(0);

    public ControladorPagosTest() {
    }

    /**
     * Test of pagar method, of class ControladorPagos.
     */
    @Test
    public void testPagar() {
        System.out.println("pagar");
        Pago pago = this.crearPagoFalso();
        pago.setEstado(EstadoPago.PENDIENTE);
        Pago result = ControladorPagos.pagar(pago);
        assertTrue(result.getEstado() == EstadoPago.PAGADO);

        this.borrarRegistros();

    }

    private Pago crearPagoFalso() {
        Pago pago = new Pago();
        pago.setDivisionPago(DivisionPago.DOS_PAGOS);
        pago.setEstado(EstadoPago.PENDIENTE);
        pago.setFechaPago(new GregorianCalendar());
        MetodoPago metodoPago = new PagoEfectivo();
        metodoPago.setMonto(100.0);
        pago.setMetodoPago(metodoPago);
        pago.setMonto(100.0);

        pago.setCliente(cliente);

        this.publicacion = new PublicacionDigital();
        publicacion.setNoPaginas(123);
        publicacion.setTitulo("Asdas");
        publicacion.setAutor(autor);

        pago.setPublicacion(publicacion);

        return pago;
    }

    private void borrarRegistros() {
        UnitOfWork unitOfWork = new UnitOfWork();
        unitOfWork.publicacionesDigitalesRepository().eliminar(publicacion);
    }

}
