/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.controladores;

import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
import org.itson.presentacion.UnitOfWork;
import org.itson.utils.Cotizador;

/**
 *
 * @author Toled
 */
public class ControladorPublicacion {

    public static Publicacion guardarPublicacion(Publicacion publicacion, float costoProduccion) {
        publicacion.setCostoProd(Math.round(costoProduccion));
        int costoVenta = Math.round(Cotizador.calcularCostoVenta(publicacion));
        publicacion.setCostoVenta(costoVenta);
        publicacion = ControladorPublicacion.persistirSegunTipoPublicacion(publicacion);
        return publicacion;
    }

    private static Publicacion persistirSegunTipoPublicacion(Publicacion publicacion) {
        if(publicacion instanceof PublicacionDigital publicacionDigital){
            return new UnitOfWork().publicacionesDigitalesRepository().agregar(publicacionDigital);
        }else if (publicacion instanceof PublicacionFisica publicacionFisica){
            return new UnitOfWork().publicacionesFisicasRepository().agregar(publicacionFisica);
        }else{
            throw new IllegalArgumentException("Publicacion invalida");
        }
    }
    
    private static boolean isDensa(int numPaginas, float tamaño){
        return numPaginas > 10 && tamaño > 5.5;
    }

}
