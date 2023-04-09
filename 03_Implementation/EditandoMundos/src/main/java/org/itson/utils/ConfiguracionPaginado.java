/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

/**
 *
 * @author mig_2
 */
public class ConfiguracionPaginado {
    private int limite;
    private int numPagina;
    private int offset;

    public ConfiguracionPaginado() {
        this.numPagina = 0;
        this.limite = 5;
        this.calcOffset();
    }

    public ConfiguracionPaginado(int limite, int numPagina) {
        this.limite = limite;
        this.numPagina = numPagina;
        this.calcOffset();
    }

    public int getOffset() {
        calcOffset();
        return offset;
    }

    public int getLimite() {
        return limite;
    }

    private void calcOffset() {
        this.offset = (this.limite * this.numPagina);
    }

    public void avanzarPag() {
        numPagina++;
    }

    public void retrocederPag() {
        if (this.numPagina != 0) {
            this.numPagina--;
        }
    } 
}
