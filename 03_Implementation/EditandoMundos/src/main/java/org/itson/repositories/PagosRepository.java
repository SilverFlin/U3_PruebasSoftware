package org.itson.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.dominio.Cliente;
import org.itson.dominio.Pago;
import org.itson.utils.ConfiguracionPaginado;

/**
 *
 * @author Toled
 */
public class PagosRepository extends RepositoryBase<Pago> {

    public PagosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public List<Pago> consultaPaginado(ConfiguracionPaginado configuracionPaginado, Cliente cliente) {
        TypedQuery<Pago> query = entityManager.createNamedQuery("consultarTodosPagos", Pago.class);
        query.setFirstResult(configuracionPaginado.getOffset());
        query.setMaxResults(configuracionPaginado.getLimite());
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }
}
