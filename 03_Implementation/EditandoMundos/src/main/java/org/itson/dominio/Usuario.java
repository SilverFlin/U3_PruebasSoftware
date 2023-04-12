package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Toled
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario")
@NamedQueries({
    @NamedQuery(
            name = "Usuario.findByUsername",
            query = "SELECT u FROM Usuario u WHERE u.username like :username"
    )
})
public class Usuario implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "nombres", nullable = true, length = 100)
    private String nombres;

    @Column(name = "apellidoPaterno", nullable = true, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", nullable = true, length = 100)
    private String apellidoMaterno;

    @Column(name = "edad", nullable = true)
    private int edad;

    @Column(name = "nacionalidad", nullable = true)
    @Enumerated(EnumType.STRING)
    private Nacionalidad nacionalidad;

    @Column(name = "isAutor", nullable = true)
    private boolean isAutor;

    @Column(name = "correoElectronico", nullable = true, length = 100)
    private String correoElectronico;

    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = true, length = 100)
    private String telefono;

    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username, String password, String nombres, String apellidoPaterno, String apellidoMaterno, int edad, Nacionalidad nacionalidad, boolean isAutor, String correoElectronico, String direccion, String telefono) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.isAutor = isAutor;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Usuario(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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

    public boolean isIsAutor() {
        return isAutor;
    }

    public void setIsAutor(boolean isAutor) {
        this.isAutor = isAutor;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "id=" + id
                + ", username=" + username
                + ", password=" + password + '}';
    }

}
