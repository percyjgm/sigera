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
@Table(name = "TUTOR")
public class Tutor {

    private int idTutor;

    
    private Seccion seccion;

    @Id
    @Column(name = "ID_TUTOR", unique = true, nullable = false)
    public Integer getIdTutor() {
        return this.idTutor;
    }

    public void setIdTutor(Integer idTutor) {
        this.idTutor = idTutor;
    }

   

    @ManyToOne
    @JoinColumn(name = "ID_GRADO", nullable = false)
    public Seccion getSeccion() {
        return this.seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}
