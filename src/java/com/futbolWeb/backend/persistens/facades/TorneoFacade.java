/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistens.facades;

import com.futbolWeb.backend.persistence.entities.Torneo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camila
 */
@Stateless
public class TorneoFacade extends AbstractFacade<Torneo> implements TorneoFacadeLocal {

    @PersistenceContext(unitName = "FutbolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TorneoFacade() {
        super(Torneo.class);
    }
    
}
