/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "INCIDENCIAS")
public class Incidencias {
    
@Id
   
    
    @Column(name = "ID_INCIDENCIAS", unique = true, nullable = false)
    private int idIncidencias;
 
    @ManyToOne
    @JoinColumn(name = "ID_ALUMNO", nullable = false)
    private Alumno alumno;
    
    
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_INCIDENCIA", nullable = false)
    private TipoIncidencia tipoIncidencia;
    @Column(name = "VC_DESCRIPCION", nullable = false, length = 555)
    private String vcDescripcion;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_INCIDENCIA", nullable = false, length = 19)
    
    private Date dtFechaIncidencia;
    
@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_REGISTRO", length = 19)
    
    private Date dtFechaRegistro;

   
 
    public Integer getIdIncidencias() {
        return this.idIncidencias;
    }

    public void setIdIncidencias(Integer idIncidencias) {
        this.idIncidencias = idIncidencias;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    
  

    
    public TipoIncidencia getTipoIncidencia() {
        return this.tipoIncidencia;
    }

    public void setTipoIncidencia(TipoIncidencia tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    
    public String getVcDescripcion() {
        return this.vcDescripcion;
    }

    public void setVcDescripcion(String vcDescripcion) {
        this.vcDescripcion = vcDescripcion;
    }

    public Date getDtFechaIncidencia() {
        return this.dtFechaIncidencia;
    }

    public void setDtFechaIncidencia(Date dtFechaIncidencia) {
        this.dtFechaIncidencia = dtFechaIncidencia;
    }

    public Date getDtFechaRegistro() {
        return this.dtFechaRegistro;
    }

    public void setDtFechaRegistro(Date dtFechaRegistro) {
        this.dtFechaRegistro = dtFechaRegistro;
    }

}
