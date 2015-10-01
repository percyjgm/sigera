/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import javax.persistence.*;

/**
 *
 * @author Administrador
 */

@Entity
@Table(name="MATRICULA")
public class Matricula {

    @Id
    @Column(name = "ID_APODERADO", unique = true, nullable = false)
    private int idMatricula;
    
    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;
    
    @ManyToOne
    @JoinColumn(name = "id_grado")
    private Grado grados;
    
    @Column(name = "TY_ESTADO", nullable = false)
    private boolean tyEstado;

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Grado getGrado() {
        return grados;
    }

    public void setGrado(Grado grados) {
        this.grados = grados;
    }

    public boolean isTyEstado() {
        return tyEstado;
    }

    public void setTyEstado(boolean tyEstado) {
        this.tyEstado = tyEstado;
    }
    
    
}
