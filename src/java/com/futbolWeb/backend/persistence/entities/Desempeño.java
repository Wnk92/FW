/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futbolWeb.backend.persistence.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camila
 */
@Entity
@Table(name = "desempe\u00f1os")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Desempe\u00f1o.findAll", query = "SELECT d FROM Desempe\u00f1o d"),
    @NamedQuery(name = "Desempe\u00f1o.findByIdDesempe\u00f1o", query = "SELECT d FROM Desempe\u00f1o d WHERE d.idDesempe\u00f1o = :idDesempe\u00f1o"),
    @NamedQuery(name = "Desempe\u00f1o.findByNombreDesempe\u00f1o", query = "SELECT d FROM Desempe\u00f1o d WHERE d.nombreDesempe\u00f1o = :nombreDesempe\u00f1o")})
public class Desempeño implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_desempe\u00f1o")
    private Integer idDesempeño;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre_desempe\u00f1o")
    private String nombreDesempeño;

    public Desempeño() {
    }

    public Desempeño(Integer idDesempeño) {
        this.idDesempeño = idDesempeño;
    }

    public Desempeño(Integer idDesempeño, String nombreDesempeño) {
        this.idDesempeño = idDesempeño;
        this.nombreDesempeño = nombreDesempeño;
    }

    public Integer getIdDesempeño() {
        return idDesempeño;
    }

    public void setIdDesempeño(Integer idDesempeño) {
        this.idDesempeño = idDesempeño;
    }

    public String getNombreDesempeño() {
        return nombreDesempeño;
    }

    public void setNombreDesempeño(String nombreDesempeño) {
        this.nombreDesempeño = nombreDesempeño;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDesempeño != null ? idDesempeño.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Desempeño)) {
            return false;
        }
        Desempeño other = (Desempeño) object;
        if ((this.idDesempeño == null && other.idDesempeño != null) || (this.idDesempeño != null && !this.idDesempeño.equals(other.idDesempeño))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.futbolWeb.backend.persistence.entities.Desempe\u00f1o[ idDesempe\u00f1o=" + idDesempeño + " ]";
    }
    
}
