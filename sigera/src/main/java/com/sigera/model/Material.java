/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "MATERIAL")
public class Material {

    private int idMaterial;
    private ListaMateriales listaMateriales;
    private String vcNombre;
    private String vcEstado;
    private Integer inCantidad;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_MATERIAL", unique = true, nullable = false)
    public Integer getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    @ManyToOne
    @JoinColumn(name = "ID_LISTA_MATERIALES", nullable = false)
    public ListaMateriales getListaMateriales() {
        return this.listaMateriales;
    }

    public void setListaMateriales(ListaMateriales listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    @Column(name = "VC_NOMBRE", nullable = false, length = 45)
    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    @Column(name = "VC_ESTADO", length = 45)
    public String getVcEstado() {
        return this.vcEstado;
    }

    public void setVcEstado(String vcEstado) {
        this.vcEstado = vcEstado;
    }

    @Column(name = "IN_CANTIDAD")
    public Integer getInCantidad() {
        return this.inCantidad;
    }

    public void setInCantidad(Integer inCantidad) {
        this.inCantidad = inCantidad;
    }

}
