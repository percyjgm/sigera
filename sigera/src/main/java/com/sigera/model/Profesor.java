/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "PROFESOR")

public class Profesor {

    private int idProfesor;
    private Persona persona;
    private String vcEstado;
   

   
    private Set<CursoPorProfesor> cursoPorProfesors = new HashSet<CursoPorProfesor>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_PROFESOR", unique = true, nullable = false)
    public int getIdProfesor() {
        return this.idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Column(name = "VC_ESTADO", nullable = false, length = 45)
    public String getVcEstado() {
        return this.vcEstado;
    }

    public void setVcEstado(String vcEstado) {
        this.vcEstado = vcEstado;
    }

  

   

    @OneToMany(mappedBy = "profesor")
    public Set<CursoPorProfesor> getCursoPorProfesors() {
        return this.cursoPorProfesors;
    }

    public void setCursoPorProfesors(Set cursoPorProfesors) {
        this.cursoPorProfesors = cursoPorProfesors;
    }
}
