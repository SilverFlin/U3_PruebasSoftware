/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.Pago;

/**
 *
 * @author Toled
 */
public class PagosRepository extends RepositoryBase<Pago> {

    public PagosRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
