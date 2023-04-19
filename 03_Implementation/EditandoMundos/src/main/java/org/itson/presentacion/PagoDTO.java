package org.itson.presentacion;

import org.itson.dominio.Cliente;

/**
 *
 * @author Toled
 */
public class PagoDTO {

    private Double montoTotal;
    private Cliente cliente;

    public PagoDTO(Double montoTotal, Cliente cliente) {
        this.montoTotal = montoTotal;
        this.cliente = cliente;
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

}
