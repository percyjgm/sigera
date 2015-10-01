/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {

    @Id
    @Column(name = "ID_DEPARTAMENTO", unique = true, nullable = false)
    private int id;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vc_nombre;

    @OneToMany(mappedBy = "departamento")
    private Set<Provincia> provincias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVc_nombre() {
        return vc_nombre;
    }

    public void setVc_nombre(String vc_nombre) {
        this.vc_nombre = vc_nombre;
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Set<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("id : ").append(getId());
        strBuff.append(", nombre : ").append(getVc_nombre());

        return strBuff.toString();
    }
}