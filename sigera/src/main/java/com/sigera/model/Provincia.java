/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "PROVINCIA")
public class Provincia {

    @Id
    @Column(name = "ID_PROVINCIA", unique = true, nullable = false)
    private int id;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vc_nombre;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
