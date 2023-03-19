/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.presentacion;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.itson.repositories.PublicacionesDigitalesRepository;
import org.itson.repositories.PublicacionesFisicasRepository;

/**
 *
 * @author Toled
 */
public class UnitOfWork {

    private EntityManager entityManager;

    private PublicacionesFisicasRepository _publicacionesFisicasRepository;
    
    private PublicacionesDigitalesRepository _publicacionesDigitalesRepository;

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

}
