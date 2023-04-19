package org.itson.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
    @NamedQuery(
            name = "consultarTodasPublicaciones",
            query = "SELECT a FROM Publicacion a"
    )
})
public class Publicacion implements Serializable {

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

    @Column(name = "noPaginas", nullable = false)
    private Integer noPaginas;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaInicio", nullable = true)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaEntrega", nullable = true)
    private Date fechaEntrega;

    @ManyToOne
    @JoinColumn(name = "idAutor", nullable = false)//LLAVE FORÁNEA
    private Autor autor;

    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idPago", referencedColumnName = "id", nullable = true)
    private Pago pago;

    public Publicacion(Long id, String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.costoProd = costoProd;
        this.costoVenta = costoVenta;
        this.noPaginas = noPaginas;
        this.autor = autor;
    }

    public Publicacion(String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Autor autor) {
        this.titulo = titulo;
        this.costoProd = costoProd;
        this.costoVenta = costoVenta;
        this.noPaginas = noPaginas;
        this.autor = autor;
    }

    public Publicacion(String titulo, Integer costoProd, Integer costoVenta, Integer noPaginas, Date fechaInicio, Date fechaEntrega, Autor autor) {
        this.titulo = titulo;
        this.costoProd = costoProd;
        this.costoVenta = costoVenta;
        this.noPaginas = noPaginas;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
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

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
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
        return "id=" + id
                + ", titulo=" + titulo
                + ", costoProd=" + costoProd
                + ", costoVenta=" + costoVenta
                + ", autor=" + autor;
    }

}
