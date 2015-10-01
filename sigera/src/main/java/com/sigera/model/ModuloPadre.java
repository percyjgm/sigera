/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.HashSet;
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
@Table(name = "MODULO_PADRE")
public class ModuloPadre {

    @Id
    @Column(name = "ID_MODULO_PADRE", unique = true, nullable = false)
    private int id_modulo_padre;

    @Column(name = "VC_NOMBRE", nullable = false)
    private String vc_nombre;
    
    @OneToMany(mappedBy="moduloPadre")
    private Set<Modulo> modulos=new HashSet<Modulo>();

    public int getId_modulo_padre() {
        return id_modulo_padre;
    }

    public void setId_modulo_padre(int id_modulo_padre) {
        this.id_modulo_padre = id_modulo_padre;
    }

    public String getVc_nombre() {
        return vc_nombre;
    }

    public void setVc_nombre(String vc_nombre) {
        this.vc_nombre = vc_nombre;
    }


    
    
    
}
