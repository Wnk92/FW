/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistence.facades;

import com.futbolWeb.backend.persistence.entities.Barrio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camila
 */
@Local
public interface BarrioFacadeLocal {

    void create(Barrio barrio);

    void edit(Barrio barrio);

    void remove(Barrio barrio);

    Barrio find(Object id);

    List<Barrio> findAll();

    List<Barrio> findRange(int[] range);

    int count();
    
}
