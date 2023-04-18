package org.itson.dominio;

/**
 *
 * @author Toled
 */
public class NombreCompleto {

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public NombreCompleto(String nombres, String apellidoPaterno, String apellidoMaterno) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
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

    @Override
    public String toString() {
        return nombres
                + " " + apellidoPaterno
                + " " + (apellidoMaterno == null ? "" : apellidoMaterno);
    }

}
