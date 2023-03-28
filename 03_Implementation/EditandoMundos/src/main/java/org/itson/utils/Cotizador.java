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

    public static int calcularCostoVenta(Publicacion publicacion) {
        int costoProd = calcularCostoProduccion(publicacion.getNoPaginas());

        int costoVenta = calcularCostoVentaPorPublicacion(costoProd, publicacion);

        return costoVenta;
    }

    public static int calcularCostoProduccion(int numPaginas) {
        int costoProd;

        if (numPaginas < 0) {
            throw new IllegalArgumentException("Número de páginas invalido.");
        } else if (numPaginas > 300) {
            costoProd = numPaginas * PRECIO_PAGINA_MAYOR_300;
        } else {
            costoProd = numPaginas * PRECIO_PAGINA_BASE;
        }

        return costoProd;
    }

    private static int calcularCostoVentaPorPublicacion(int costoProd, Publicacion publicacion) {
        int costoVenta;

        if (publicacion instanceof PublicacionFisica pubFisica) {
            costoVenta = calcularCostoVentaFisica(costoProd, pubFisica);
        } else if (publicacion instanceof PublicacionDigital pubDigital) {
            costoVenta = calcularCostoVentaFisica(costoProd, pubDigital);

        } else {
            throw new IllegalArgumentException("Publicacion no conocida");
        }

        return costoVenta;
    }

    private static int calcularCostoVentaFisica(int costoProd, PublicacionFisica pubFisica) {
        int costoVenta;
        Autor autor = pubFisica.getAutor();
        if (autor.getNacionalidad().equals(Nacionalidad.MEXICANA)) {
            costoVenta = (int) (costoProd * AUMENTO_NACIONALIDAD_MEXICANA);
        } else {
            costoVenta = (int) (costoProd * AUMENTO_NACIONALIDAD_BASE);
        }

        return costoVenta;
    }

    private static int calcularCostoVentaFisica(int costoProd, PublicacionDigital pubDigital) {
        int costoVenta;
        if (pubDigital.getSizeMegas() <= 2.5f) {
            costoVenta = (int) (costoProd * AUMENTO_DENSIDAD_BASE);
        } else {
            costoVenta = (int) (costoProd * AUMENTO_DENSIDAD_DENSO);
        }
        return costoVenta;
    }

}
