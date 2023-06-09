package org.itson.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("digital")
public class PublicacionDigital extends Publicacion {

    @Column(name = "isDensa", nullable = false, length = 100)
    private boolean isDensa;

    @Column(name = "sizeMegas", nullable = true, length = 100)
    private Double sizeMegas;

    public PublicacionDigital() {
    }

    public PublicacionDigital(boolean isDensa, Double sizeMegas, Long id, String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        super(id, titulo, costoProd, costoVenta, noPaginas, autor);
        this.isDensa = isDensa;
        this.sizeMegas = sizeMegas;
    }

    public PublicacionDigital(boolean isDensa, Double sizeMegas, String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        super(titulo, costoProd, costoVenta, noPaginas, autor);
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
        return "PublicacionDigital{"
                + super.toString()
                + "isDensa=" + isDensa
                + ", sizeMegas=" + sizeMegas + '}';
    }

}
