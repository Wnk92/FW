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
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author camila
 */
@Named(value = "torneoManagedBean")
@ViewScoped
public class TorneoManagedBean implements Serializable, InterfaceController<Torneo> {

    private Torneo torneo;
    @EJB
    private TorneoFacadeLocal torneofl;

    public TorneoManagedBean() {
    }

    @PostConstruct
    public void init() {

        torneo = new Torneo();

    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public void registrarTorneo() {

        torneofl.create(torneo);

    }

    public List<Torneo> listarTorneo() {

        return torneofl.findAll();

    }

    @Override
    public Torneo getObjectByKey(Integer key) {
        return torneofl.find(key);
    }
}
