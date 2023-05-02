/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.itson.dominio.Cliente;

/**
 *
 * @author Toled
 */
public class ClientesRepository extends RepositoryBase<Cliente> {

    public ClientesRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public Optional<Cliente> obtenPorUsername(String username) {
        TypedQuery<Cliente> query = entityManager.createNamedQuery("Cliente.findByUsername", Cliente.class);
        query.setParameter("username", username);
        
        Cliente cliente = null;
        try {
            cliente = query.getSingleResult();
        } catch (NoResultException ex) {
            // No hace falta nada aqui
        }
        return Optional.ofNullable(cliente);
    }

    public Optional<Cliente> obtenPorEmail(String email) {
        TypedQuery<Cliente> query = entityManager.createNamedQuery("Cliente.findByEmail", Cliente.class);
        query.setParameter("email", email);

        Cliente cliente = null;
        try {
            cliente = query.getSingleResult();
        } catch (NoResultException ex) {
            // No hace falta nada aqui
        }
        return Optional.ofNullable(cliente);

    }

}
