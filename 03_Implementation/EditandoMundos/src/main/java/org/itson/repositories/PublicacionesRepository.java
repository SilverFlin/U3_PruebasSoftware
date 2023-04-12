/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.dominio.Publicacion;

/**
 *
 * @author mig_2
 */
public class PublicacionesRepository extends RepositoryBase<Publicacion> {
    
    public PublicacionesRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public List<Publicacion> consultaPaginado(int offset, int limit) {
        TypedQuery<Publicacion> query = entityManager.createNamedQuery("consultarTodasPublicaciones", Publicacion.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }
    
}
