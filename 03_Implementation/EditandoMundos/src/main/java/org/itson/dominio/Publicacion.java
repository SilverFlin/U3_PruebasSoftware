/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Toled
 */
@Entity
public abstract class Publicacion implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //No puede ser nulo, tamaño maximo de 100 caracteres
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "costoProd", nullable = true)
    private Integer costoProd;

    @Column(name = "costoVenta", nullable = true)
    private Integer costoVenta;

    @ManyToOne
    //Desde este momento ya se considera como una columna al hacer el JoinColumn
    //Se agregan los gets y sets con este igual
    // TODO cambiar nullable a false
    @JoinColumn(name = "idAuto", nullable = true)//LLAVE FORÁNEA
    private Autor autor;

    public Publicacion(Long id, String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.costoProd = costoProd;
        this.costoVenta = costoVenta;
        this.autor = autor;
    }

    public Publicacion(String titulo, Integer costoProd, Integer costoVenta, Autor autor) {
        this.titulo = titulo;
        this.costoProd = costoProd;
        this.costoVenta = costoVenta;
        this.autor = autor;
    }

    public Publicacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(Integer costoProd) {
        this.costoProd = costoProd;
    }

    public Integer getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(Integer costoVenta) {
        this.costoVenta = costoVenta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", titulo=" + titulo + ", costoProd=" + costoProd + ", costoVenta=" + costoVenta + ", autor=" + autor ;
    }
    
    

}
