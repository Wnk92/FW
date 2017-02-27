package com.futbolWeb.frontend.utilities.converters;

import com.futbolWeb.backend.persistence.entities.IDTO;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author camila
 */
public abstract class AbstractConverter implements Converter {

    protected String nameManagedBean;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            Integer llave = Integer.valueOf(value);
            InterfaceController ic = (InterfaceController) context.getApplication().getELResolver().getValue(context.getELContext(), null, nameManagedBean);
            return ic.getObjectByKey(llave);
        } catch (NumberFormatException e) {
            context.addMessage(null, new FacesMessage("Error al implementar" + e.getMessage()));

        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        try {
            if (value instanceof IDTO) {
                IDTO objetoEntidad = (IDTO) value;
                return objetoEntidad.obtenerLlavePrimaria();
            }
        } catch (Exception e) {

            context.addMessage(null, new FacesMessage("Error al convertir" + e.getMessage()));
        }
    return null;
    }

}