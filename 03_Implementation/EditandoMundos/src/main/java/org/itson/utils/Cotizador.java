/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import org.itson.dominio.Autor;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;

/**
 *
 * @author mig_2
 */
public class Cotizador {

    private static final int PRECIO_PAGINA_BASE = 300;
    private static final int PRECIO_PAGINA_MAYOR_300 = 200;

    private static final float AUMENTO_NACIONALIDAD_BASE = 1.25f;
    private static final float AUMENTO_NACIONALIDAD_MEXICANA = 1.15f;

    private static final float AUMENTO_DENSIDAD_BASE = 1.10f;
    private static final float AUMENTO_DENSIDAD_DENSO = 1.15f;

    public static float calcularCostoVenta(Publicacion publicacion) {
        float costoProd = calcularCostoProduccion(publicacion.getNoPaginas());

        float costoVenta = calcularCostoVentaPorPublicacion(costoProd, publicacion);

        return costoVenta;
    }

    public static float calcularCostoProduccion(int numPaginas) {
        float costoProd;

        if (numPaginas < 0) {
            throw new IllegalArgumentException("Número de páginas invalido.");
        } else if (numPaginas > 300) {
            costoProd = numPaginas * PRECIO_PAGINA_MAYOR_300;
        } else {
            costoProd = numPaginas * PRECIO_PAGINA_BASE;
        }

        return costoProd;
    }

    private static float calcularCostoVentaPorPublicacion(float costoProd, Publicacion publicacion) {
        float costoVenta = 0;

        if (publicacion instanceof PublicacionFisica pubFisica) {
            Autor autor = pubFisica.getAutor();
            if (autor.getNacionalidad().equals(Nacionalidad.MEXICANA)) {
                costoVenta = costoProd * AUMENTO_NACIONALIDAD_MEXICANA;
            } else {
                costoVenta = costoProd * AUMENTO_NACIONALIDAD_BASE;
            }
        }

        if (publicacion instanceof PublicacionDigital pubDigital) {

            if (pubDigital.getSizeMegas() <= 2.5f) {
                costoVenta = costoProd * AUMENTO_DENSIDAD_BASE;
            } else {
                costoVenta = costoProd * AUMENTO_DENSIDAD_DENSO;
            }
        }

        return costoVenta;
    }

}
