/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.itson.dominio.Autor;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;

/**
 *
 * @author mig_2
 */
public class Cotizador {
    
    public static float calcularCostoVenta(Publicacion publicacion) {
        float costoProd = publicacion.getCostoProd();
        float costoVenta = 0;
        

        if (publicacion instanceof PublicacionFisica) {
            Autor autor = publicacion.getAutor();
            if (autor.getNacionalidad().equals("mexicano")) {
                costoVenta = costoProd * 1.15f;
            } else {
                costoVenta = costoProd * 1.25f;
            }
        }

        if (publicacion instanceof PublicacionDigital) {
            PublicacionDigital pubDigital = (PublicacionDigital) publicacion;

            if (pubDigital.getSizeMegas() <= 2.5f) {
                costoVenta=  costoProd * 1.10f; // aplicar un 10% de incremento si el tamaño es menor o igual a 2.5MB
            } else {
                costoVenta=  costoProd * 1.15f; // aplicar un 15% de incremento si el tamaño es mayor a 2.5MB
            }
        }
        return costoVenta;
    }
        
    public static float calcularCostoProduccion(int numPaginas){
        float costoProd;
        if (numPaginas>300) {
            costoProd = numPaginas * 200;
        }
        else{
            costoProd = numPaginas * 300;
        }
        return costoProd;
    }
        
}
