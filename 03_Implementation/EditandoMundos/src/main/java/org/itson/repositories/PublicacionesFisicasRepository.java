/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.PublicacionFisica;

/**
 *
 * @author Toled
 */
public class PublicacionesFisicasRepository extends RepositoryBase<PublicacionFisica>{
    
    public PublicacionesFisicasRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}