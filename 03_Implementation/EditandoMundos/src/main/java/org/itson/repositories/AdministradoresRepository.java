/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.Administrador;

/**
 *
 * @author Toled
 */
public class AdministradoresRepository extends RepositoryBase<Administrador> {

    public AdministradoresRepository(EntityManager entityManager) {
        super(entityManager);
    }

}
