
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.Usuario;

/**
 *
 * @author mig_2
 */
public class UsuariosRepository extends RepositoryBase<Usuario>{
    
    public UsuariosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
