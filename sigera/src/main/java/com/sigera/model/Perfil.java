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
import org.hibernate.annotations.Type;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "PERFIL")
public class Perfil {

    @Id
    @Column(name = "ID_PERFIL", unique = true, nullable = false)
    private int id_perfil;

    @Column(name = "VC_NOMBRE")
    private String vc_nombre;
    @Column(name = "TY_estado")
    private boolean ty_estado;

    @OneToMany(mappedBy = "perfil")
    private Set<Permiso> permisos = new HashSet(0);
    @OneToMany(mappedBy = "perfilu")
    private Set<Usuario> usuarios = new HashSet(0);

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getVc_nombre() {
        return vc_nombre;
    }

    public void setVc_nombre(String vc_nombre) {
        this.vc_nombre = vc_nombre;
    }

    public boolean isTy_estado() {
        return ty_estado;
    }

    public void setTy_estado(boolean ty_estado) {
        this.ty_estado = ty_estado;
    }

}
