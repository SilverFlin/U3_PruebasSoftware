package org.itson.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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

    public PublicacionFisica(int paginaInicial, String nombreLibro, Long id, String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        super(id, titulo, costoProd, costoVenta, noPaginas, autor);
        this.paginaInicial = paginaInicial;
        this.nombreLibro = nombreLibro;
    }

    public PublicacionFisica(int paginaInicial, String nombreLibro, String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        super(titulo, costoProd, costoVenta, noPaginas, autor);
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
