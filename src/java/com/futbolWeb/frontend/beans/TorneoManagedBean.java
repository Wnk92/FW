/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolweb.frontend.beans;

import com.futbolWeb.backend.persistence.entities.Torneo;
import com.futbolWeb.backend.persistens.facades.TorneoFacadeLocal;
import com.futbolWeb.frontend.utilities.converters.InterfaceController;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author camila
 */
@Named(value = "torneoManagedBean")
@RequestScoped
public class TorneoManagedBean implements Serializable{

    
  
    public TorneoManagedBean() {
    }

}