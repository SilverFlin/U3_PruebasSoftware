package org.itson.controladores;

import java.util.List;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.ConfiguracionPaginado;
import org.itson.utils.Cotizador;

/**
 *
 * @author Toled
 */
public class ControladorPublicacion {

    private ControladorPublicacion() {
        throw new IllegalStateException("Utility class");
    }

    public static Publicacion guardarPublicacion(Publicacion publicacion, float costoProduccion) {
        publicacion.setCostoProd(Math.round(costoProduccion));
        int costoVenta = Math.round(Cotizador.calcularCostoVenta(publicacion));
        publicacion.setCostoVenta(costoVenta);
        publicacion = ControladorPublicacion.persistirSegunTipoPublicacion(publicacion);
        return publicacion;
    }

    private static Publicacion persistirSegunTipoPublicacion(Publicacion publicacion) {
        // TODO: No habra una forma más limpia?
        if (publicacion instanceof PublicacionDigital publicacionDigital) {
            return new UnitOfWork().publicacionesDigitalesRepository().agregar(publicacionDigital);
        } else if (publicacion instanceof PublicacionFisica publicacionFisica) {
            return new UnitOfWork().publicacionesFisicasRepository().agregar(publicacionFisica);
        } else {
            throw new IllegalArgumentException("Publicacion invalida");
        }
    }

    public static List<Publicacion> consultaPaginado(ConfiguracionPaginado configuracionPaginado) {
        return new UnitOfWork().publicacionesRepository().consultaPaginado(configuracionPaginado.getOffset(), configuracionPaginado.getLimite());
    }

    private static boolean isDensa(int numPaginas, float size) {
        return numPaginas > 10 && size > 5.5;
    }

}
