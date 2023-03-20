/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("fisica")
public class PublicacionFisica extends Publicacion {

    @Column(name = "paginaInicial", nullable = true)
    private int paginaInicial;
    
    @Column(name = "nombreLibro", nullable = true)
    private String nombreLibro;

    public PublicacionFisica() {
    }

    public PublicacionFisica(int paginaInicial, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        super(titulo, costoProd, costoVenta, autor);
        this.paginaInicial = paginaInicial;
    }

    public PublicacionFisica(String nombreLibro, int paginaInicial, Long id, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        super(id, titulo, costoProd, costoVenta, autor);
        this.paginaInicial = paginaInicial;
        this.nombreLibro = nombreLibro;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public String toString() {
        return "PublicacionFisica{" + super.toString() + "paginaInicial=" + paginaInicial + '}';
    }

}
