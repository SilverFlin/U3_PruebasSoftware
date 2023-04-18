package org.itson.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("cliente")
public class Cliente extends Usuario {

    @Column(name = "nombres", nullable = true, length = 100)
    private String nombres;

    @Column(name = "apellidoPaterno", nullable = true, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", nullable = true, length = 100)
    private String apellidoMaterno;
    @Column(name = "email", nullable = true, length = 100)
    private String email;

    @Column(name = "telefono", nullable = true, length = 100)
    private String telefono;

    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

    public Cliente() {
    }

    public Cliente(Usuario ususario, NombreCompleto nombreCompleto, String email, String telefono, String direccion) {
        super(ususario.getUsername(), ususario.getPassword());

        this.nombres = nombreCompleto.getNombres();
        this.apellidoPaterno = nombreCompleto.getApellidoPaterno();
        this.apellidoMaterno = nombreCompleto.getApellidoMaterno();
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
