/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("administrador")

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String username, String password) {
        super(username, password);
    }

    public Administrador(Long id, String username, String password) {
        super(id, username, password);
    }

}
