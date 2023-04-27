/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.dominio.Autor;

/**
 *
 * @author Toled
 */
public class AutoresRepository extends RepositoryBase<Autor> {

    public AutoresRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Autor> consultaNombreYApellido(String nombres, String apellidoPaterno) {
        TypedQuery<Autor> query = entityManager.createNamedQuery("autoresBuscarNombres", Autor.class);
        query.setParameter("nombres", "%" + nombres + "%");
        query.setParameter("apellidopaterno", "%" + apellidoPaterno + "%");
        return query.getResultList();
    }
    
    public List<Autor> consultaPaginado(int offset, int limit) {
        TypedQuery<Autor> query = entityManager.createNamedQuery("consultarTodosAutores", Autor.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

}
