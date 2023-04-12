/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.presentacion;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.itson.repositories.AdministradoresRepository;
import org.itson.repositories.AutoresRepository;
import org.itson.repositories.PublicacionesDigitalesRepository;
import org.itson.repositories.PublicacionesFisicasRepository;
import org.itson.repositories.ClientesRepository;
import org.itson.repositories.PublicacionesRepository;
import org.itson.repositories.UsuariosRepository;

/**
 *
 * @author Toled
 */
public class UnitOfWork {

    private EntityManager entityManager;

    private PublicacionesFisicasRepository _publicacionesFisicasRepository;

    private PublicacionesDigitalesRepository _publicacionesDigitalesRepository;

    private AutoresRepository _autoresRepository;

    private ClientesRepository _clientesRepository;

    private AdministradoresRepository _administradoresRepository;
    
    private UsuariosRepository _usuariosRepository;
    
    private PublicacionesRepository _publicacionesRepository;
    
    public UnitOfWork() {

        entityManager = Persistence.createEntityManagerFactory("EditandoMundos").createEntityManager();

    }

    private EntityManager getEntityManager() {
        return (entityManager != null) ? entityManager : (entityManager = Persistence.createEntityManagerFactory("EditandoMundos").createEntityManager());
    }

    public PublicacionesFisicasRepository publicacionesFisicasRepository() {
        return (_publicacionesFisicasRepository != null)
                ? _publicacionesFisicasRepository
                : (_publicacionesFisicasRepository = new PublicacionesFisicasRepository(getEntityManager()));
    }

    public PublicacionesDigitalesRepository publicacionesDigitalesRepository() {
        return (_publicacionesDigitalesRepository != null)
                ? _publicacionesDigitalesRepository
                : (_publicacionesDigitalesRepository = new PublicacionesDigitalesRepository(getEntityManager()));
    }
    
    public PublicacionesRepository publicacionesRepository() {
        return (_publicacionesRepository != null)
                ? _publicacionesRepository
                : (_publicacionesRepository = new PublicacionesRepository(getEntityManager()));
    }    

    public AutoresRepository autoresRepository() {
        return (_autoresRepository != null)
                ? _autoresRepository
                : (_autoresRepository = new AutoresRepository(getEntityManager()));
    }

    public ClientesRepository clientesRepository() {
        return (_clientesRepository != null)
                ? _clientesRepository
                : (_clientesRepository = new ClientesRepository(getEntityManager()));
    }

    public AdministradoresRepository administradoresRepository() {
        return (_administradoresRepository != null)
                ? _administradoresRepository
                : (_administradoresRepository = new AdministradoresRepository(getEntityManager()));
    }
    
    public UsuariosRepository usuariosRepository(){
                return (_usuariosRepository != null)
                ? _usuariosRepository
                : (_usuariosRepository = new UsuariosRepository(getEntityManager()));
    }
        
}
