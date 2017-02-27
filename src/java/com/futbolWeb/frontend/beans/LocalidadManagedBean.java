/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.frontend.beans;

import com.futbolWeb.backend.persistence.entities.Localidad;
import com.futbolWeb.backend.persistens.facades.LocalidadFacadeLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author camila
 */
@Named(value = "localidadManagedBean")
@RequestScoped
public class LocalidadManagedBean {

    private Localidad localidad;
    @EJB
    private LocalidadFacadeLocal localidadfl;

    public LocalidadManagedBean() {
    }

    @PostConstruct
    public void init() {

        localidad = new Localidad();

    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void registrarLocalidad() {

        try {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Ciudad registrada con éxito"));

            localidadfl.create(localidad);

        } catch (Exception e) {
        }

    }
}
