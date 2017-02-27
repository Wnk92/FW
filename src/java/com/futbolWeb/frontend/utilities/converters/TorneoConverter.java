package com.futbolWeb.frontend.utilities.converters;

import com.futbolWeb.backend.persistence.entities.Torneo;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Torneo.class)
public class TorneoConverter extends AbstractConverter {

    public TorneoConverter() {

        this.nameManagedBean = "torneoManagedBean";
                
    }

}