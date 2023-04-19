package org.itson.dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Toled
 */
@Entity
@Table(name = "autor")
@NamedQueries({
    @NamedQuery(
            name = "autoresBuscarNombres",
            query = "SELECT a FROM Autor a "
            + "WHERE a.nombres LIKE :nombres "
            + "AND a.apellidoPaterno LIKE :apellidopaterno"
    ),
    @NamedQuery(name = "consultarTodosAutores", query = "SELECT a FROM Autor a")
})
public class Autor extends Cliente {

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "nacionalidad", nullable = false)
    @Enumerated(EnumType.STRING)
    private Nacionalidad nacionalidad;

    @OneToMany(mappedBy = "autor", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Publicacion> publicaciones;

    public Autor() {
    }

    public Autor(Cliente cliente, int edad, Nacionalidad nacionalidad) {
        super(
                new Usuario(cliente.getUsername(), cliente.getPassword()),
                new NombreCompleto(cliente.getNombres(), cliente.getApellidoPaterno(), cliente.getApellidoMaterno()),
                cliente.getEmail(),
                cliente.getTelefono(),
                cliente.getDireccion()
        );

        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

}
