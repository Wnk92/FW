/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistence.facades;

import com.futbolWeb.backend.persistence.entities.EncuentroTorneo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camila
 */
@Stateless
public class EncuentroTorneoFacade extends AbstractFacade<EncuentroTorneo> implements EncuentroTorneoFacadeLocal {

    @PersistenceContext(unitName = "FutbolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EncuentroTorneoFacade() {
        super(EncuentroTorneo.class);
    }
    
}
