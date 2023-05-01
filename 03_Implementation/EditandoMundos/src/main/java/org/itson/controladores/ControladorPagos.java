package org.itson.controladores;

import java.util.List;
import org.itson.dominio.EstadoPago;
import org.itson.dominio.Pago;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.ConfiguracionPaginado;

/**
 *
 * @author Toled
 */
public class ControladorPagos {

    private ControladorPagos() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Pago> consultaPaginado(ConfiguracionPaginado configuracionPaginado) {
        return new UnitOfWork().pagosRepository().consultaPaginado(configuracionPaginado.getOffset(), configuracionPaginado.getLimite());
    }

    public static Pago pagar(Pago pago) {
        pago.setEstado(EstadoPago.PAGADO);
        return new UnitOfWork().pagosRepository().actualizar(pago);

    }
}
