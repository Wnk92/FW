/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistens.facades;

import com.futbolWeb.backend.persistence.entities.Desempeño;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camila
 */
@Stateless
public class DesempeñoFacade extends AbstractFacade<Desempeño> implements DesempeñoFacadeLocal {

    @PersistenceContext(unitName = "FutbolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DesempeñoFacade() {
        super(Desempeño.class);
    }
    
}
