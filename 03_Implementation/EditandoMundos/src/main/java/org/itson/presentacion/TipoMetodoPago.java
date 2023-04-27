/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package org.itson.presentacion;

/**
 *
 * @author Toled
 */
public enum TipoMetodoPago {
    PAGO_EFECTIVO("Pago en efectivo"),
    PAGO_DEPOSITO("Deposito"),
    PAGO_TARJETA("Pago en tarjeta");

    public final String label;

    private TipoMetodoPago(String label) {
        this.label = label;
    }
}
