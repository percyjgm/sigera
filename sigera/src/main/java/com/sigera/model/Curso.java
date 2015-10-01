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
@Table(name = "CURSO")
public class Curso {

    @Id
    @Column(name = "ID_CURSO", unique = true, nullable = false)
    private int idCurso;
    @ManyToOne
    @JoinColumn(name = "id_seccion")
    private Seccion seccion;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vcNombre;
    @Column(name = "VC_ESTADO", nullable = false)
    private String vcEstado;
    @Column(name = "VC_CREADO_POR", nullable = false)
    private String vcCreadoPor;
    @Column(name = "VC_MODIFICADO_POR", nullable = false)
    private String vcModificadoPor;
    @Column(name = "DT_FECHA_MODIFICACIÓN", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFechaModificacion;
    @Column(name = "DT_FECHA_CREACION", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFechaCreacion;
    
    @OneToMany(mappedBy = "curso")
    private Set<CursoPorProfesor> cursoPorProfesors = new HashSet(0);

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public String getVcEstado() {
        return vcEstado;
    }

    public void setVcEstado(String vcEstado) {
        this.vcEstado = vcEstado;
    }

    public String getVcCreadoPor() {
        return vcCreadoPor;
    }

    public void setVcCreadoPor(String vcCreadoPor) {
        this.vcCreadoPor = vcCreadoPor;
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

    public Date getDtFechaCreacion() {
        return dtFechaCreacion;
    }

    public void setDtFechaCreacion(Date dtFechaCreacion) {
        this.dtFechaCreacion = dtFechaCreacion;
    }

    public Set<CursoPorProfesor> getCursoPorProfesors() {
        return cursoPorProfesors;
    }

    public void setCursoPorProfesors(Set cursoPorProfesors) {
        this.cursoPorProfesors = cursoPorProfesors;
    }
    
    
}
