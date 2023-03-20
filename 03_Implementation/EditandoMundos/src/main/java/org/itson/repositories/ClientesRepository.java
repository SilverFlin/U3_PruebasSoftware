/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import org.itson.dominio.Cliente;

/**
 *
 * @author Toled
 */
public class ClientesRepository extends RepositoryBase<Cliente> {
    
    public ClientesRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
