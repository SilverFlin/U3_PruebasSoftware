package org.itson.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.dominio.Pago;

/**
 *
 * @author Toled
 */
public class PagosRepository extends RepositoryBase<Pago> {

    public PagosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public List<Pago> consultaPaginado(int offset, int limit) {
        TypedQuery<Pago> query = entityManager.createNamedQuery("consultarTodosPagos", Pago.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }
}
