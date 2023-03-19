/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.Autor;

/**
 *
 * @author Toled
 */
public class AutoresRepository extends RepositoryBase<Autor> {
    
    public AutoresRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
