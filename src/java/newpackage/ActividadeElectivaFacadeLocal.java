/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistence.facades;

import com.futbolWeb.backend.persistence.entities.ActividadeElectiva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camila
 */
@Local
public interface ActividadeElectivaFacadeLocal {

    void create(ActividadeElectiva actividadeElectiva);

    void edit(ActividadeElectiva actividadeElectiva);

    void remove(ActividadeElectiva actividadeElectiva);

    ActividadeElectiva find(Object id);

    List<ActividadeElectiva> findAll();

    List<ActividadeElectiva> findRange(int[] range);

    int count();
    
}
