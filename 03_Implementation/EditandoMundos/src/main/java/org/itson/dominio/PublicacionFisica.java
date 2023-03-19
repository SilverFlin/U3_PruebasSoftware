/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Toled
 */
@Entity
@Table(name = "publicacion_fisica")
public class PublicacionFisica extends Publicacion implements Serializable {

    @Column(name = "paginaInicial", nullable = false)
    private int paginaInicial;

    public PublicacionFisica() {
    }

    public PublicacionFisica(int paginaInicial, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        super(titulo, costoProd, costoVenta, autor);
        this.paginaInicial = paginaInicial;
    }

    public PublicacionFisica(int paginaInicial, Long id, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        super(id, titulo, costoProd, costoVenta, autor);
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    @Override
    public String toString() {
        return "PublicacionFisica{" + super.toString() + "paginaInicial=" + paginaInicial + '}';
    }

}
