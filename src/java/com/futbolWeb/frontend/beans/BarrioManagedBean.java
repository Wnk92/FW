/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.frontend.beans;

import com.futbolWeb.backend.persistence.entities.Barrio;
import com.futbolWeb.backend.persistens.facades.BarrioFacadeLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author camila
 */
@Named(value = "barrioManagedBean")
@RequestScoped
public class BarrioManagedBean {

    private Barrio barrio;
    @EJB
    private BarrioFacadeLocal barriofl;

    public BarrioManagedBean() {
    }
@PostConstruct
public void init(){

     barrio = new Barrio();

}

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

public void registrarBarrio(){
    
    barriofl.create(barrio);

}
}
