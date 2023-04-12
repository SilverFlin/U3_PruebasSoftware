package org.itson.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("cliente")
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(String username, String password) {
        super(username, password);
    }

    public Cliente(Long id, String username, String password) {
        super(id, username, password);
    }

}
