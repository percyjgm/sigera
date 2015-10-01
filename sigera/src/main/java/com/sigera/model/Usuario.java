/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.Date;

/**
 *
 * @author Administrador
 */
import javax.persistence.*;
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(name = "ID_USUARIO", unique = true, nullable = false)
    private int idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfilu;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @Column(name = "VC_NICK")
    private String vcNick;
    @Column(name = "VC_CLAVE")
    private String vcClave;
    @Column(name = "TY_ESTADO")
    private boolean tyEstado;
    @Column(name = "VC_CREADO_POR")
    private String vcCreadoPor;
    @Column(name = "DT_FECHA_CREACION")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFechaCreacion;
    @Column(name = "VC_MODIFICADO_POR")
    private String vcModificadoPor;
    @Column(name = "DT_MODIFICADO_POR")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtModificadoPor;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Perfil getPerfilu() {
        return perfilu;
    }

    public void setPerfilu(Perfil perfilu) {
        this.perfilu = perfilu;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getVcNick() {
        return vcNick;
    }

    public void setVcNick(String vcNick) {
        this.vcNick = vcNick;
    }

    public String getVcClave() {
        return vcClave;
    }

    public void setVcClave(String vcClave) {
        this.vcClave = vcClave;
    }

    public boolean isTyEstado() {
        return tyEstado;
    }

    public void setTyEstado(boolean tyEstado) {
        this.tyEstado = tyEstado;
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

    public Date getDtModificadoPor() {
        return dtModificadoPor;
    }

    public void setDtModificadoPor(Date dtModificadoPor) {
        this.dtModificadoPor = dtModificadoPor;
    }

}
