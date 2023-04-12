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

    public Administrador(String username, String password) {
        super(username, password);
    }

    public Administrador(Long id, String username, String password) {
        super(id, username, password);
    }

}
