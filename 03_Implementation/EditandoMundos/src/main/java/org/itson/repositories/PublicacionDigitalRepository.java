/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.PublicacionDigital;

/**
 *
 * @author mig_2
 */
public class PublicacionDigitalRepository extends RepositoryBase<PublicacionDigital>{
    
    public PublicacionDigitalRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
