/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "APODERADO")
public class Apoderado {

    @Id
    @Column(name = "ID_APODERADO", unique = true, nullable = false)
    private int id_apoderado;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
    @OneToMany(mappedBy = "department")
    private Set<Alumno> alumnos = new HashSet<Alumno>();

    public int getId_apoderado() {
        return id_apoderado;
    }

    public void setId_apoderado(int id_apoderado) {
        this.id_apoderado = id_apoderado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}
