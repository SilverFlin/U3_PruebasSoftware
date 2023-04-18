package org.itson.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("administrador")

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(Usuario usuario) {
        super(usuario.getUsername(), usuario.getPassword());
    }

}
