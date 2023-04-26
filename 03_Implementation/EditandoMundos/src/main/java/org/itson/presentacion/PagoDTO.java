package org.itson.presentacion;

import org.itson.dominio.Cliente;
import org.itson.dominio.Publicacion;

/**
 *
 * @author Toled
 */
public class PagoDTO {

    private Double montoTotal;
    private Cliente cliente;
    private Publicacion publicacion;

    public PagoDTO(Double montoTotal, Cliente cliente, Publicacion publicacion) {
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.publicacion = publicacion;
    }

    public PagoDTO() {
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

}
