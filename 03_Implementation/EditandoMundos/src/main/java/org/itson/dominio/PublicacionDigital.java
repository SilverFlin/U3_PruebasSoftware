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
@Table(name = "publicacion_digital")
public class PublicacionDigital extends Publicacion implements Serializable {

    @Column(name = "isDensa", nullable = false, length = 100)
    private boolean isDensa;

    @Column(name = "sizeMegas", nullable = true, length = 100)
    private Double sizeMegas;

    public PublicacionDigital() {
    }

    public PublicacionDigital(boolean isDensa, Double sizeMegas, Long id, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        super(titulo, costoProd, costoVenta, autor);
        this.isDensa = isDensa;
        this.sizeMegas = sizeMegas;
    }

    public boolean isDensa() {
        return isDensa;
    }

    public void setIsDensa(boolean isDensa) {
        this.isDensa = isDensa;
    }

    public Double getSizeMegas() {
        return sizeMegas;
    }

    public void setSizeMegas(Double sizeMegas) {
        this.sizeMegas = sizeMegas;
    }

    @Override
    public String toString() {
        return "PublicacionDigital{" + super.toString() + "isDensa=" + isDensa + ", sizeMegas=" + sizeMegas + '}';
    }
    

}
