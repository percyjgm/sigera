/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "MODULO")
public class Modulo {

    @Id
    @Column(name = "ID_MODULO", unique = true, nullable = false)
    private int idModulo;
    
    @ManyToOne
    @JoinColumn(name = "id_modulo_padre")
    private ModuloPadre moduloPadre;
    
    @Column(name = "VC_NOMBRE")
    private String vcNombre;
    @Column(name = "TY_LISTAR")
    private boolean tyListar;
    @Column(name = "TY_CREAR")
    private boolean tyCrear;
    @Column(name = "TY_ACTUALIZAR")
    private boolean tyActualizar;
    @Column(name = "TY_ELIMINAR")
    private boolean tyEliminar;
    @Column(name = "VC_CREADOPOR")
    private String vcCreadoPor;
    @Column(name = "DT_FECHA_CREACION")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFechaCreacion;
    @Column(name = "VC_MODIFICADO_POR")
    private String vcModificadoPor;
    @Column(name = "DT_FECHA_MODIFICACION")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFechaModificacion;

    @OneToMany(mappedBy = "moduloes")
    private Set<Permiso> permisos=new HashSet<>();

    
    
    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public ModuloPadre getModuloPadre() {
        return moduloPadre;
    }

    public void setModuloPadre(ModuloPadre moduloPadre) {
        this.moduloPadre = moduloPadre;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public boolean isTyListar() {
        return tyListar;
    }

    public void setTyListar(boolean tyListar) {
        this.tyListar = tyListar;
    }

    public boolean isTyCrear() {
        return tyCrear;
    }

    public void setTyCrear(boolean tyCrear) {
        this.tyCrear = tyCrear;
    }

    public boolean isTyActualizar() {
        return tyActualizar;
    }

    public void setTyActualizar(boolean tyActualizar) {
        this.tyActualizar = tyActualizar;
    }

    public boolean isTyEliminar() {
        return tyEliminar;
    }

    public void setTyEliminar(boolean tyEliminar) {
        this.tyEliminar = tyEliminar;
    }

    public String getVcCreadoPor() {
        return vcCreadoPor;
    }

    public void setVcCreadoPor(String vcCreadoPor) {
        this.vcCreadoPor = vcCreadoPor;
    }

    public Date getDtFechaCreacion() {
        return dtFechaCreacion;
    }

    public void setDtFechaCreacion(Date dtFechaCreacion) {
        this.dtFechaCreacion = dtFechaCreacion;
    }

    public String getVcModificadoPor() {
        return vcModificadoPor;
    }

    public void setVcModificadoPor(String vcModificadoPor) {
        this.vcModificadoPor = vcModificadoPor;
    }

    public Date getDtFechaModificacion() {
        return dtFechaModificacion;
    }

    public void setDtFechaModificacion(Date dtFechaModificacion) {
        this.dtFechaModificacion = dtFechaModificacion;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

}
