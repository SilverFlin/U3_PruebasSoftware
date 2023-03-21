/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.repositories;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.dominio.Autor;
import org.itson.dominio.Usuario;

/**
 *
 * @author mig_2
 */
public class UsuariosRepository extends RepositoryBase<Usuario>{
    
    public UsuariosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public Usuario obtenPorUsuarioContraseña(String username, String password){
        TypedQuery<Usuario> query = entityManager.createNamedQuery("Usuario.findByUsernameAndPassword", Usuario.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        Usuario usuario = query.getSingleResult();
        return usuario;
    }
}
