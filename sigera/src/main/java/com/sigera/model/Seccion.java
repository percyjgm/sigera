/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

/**
 *
 * @author Administrador
 */
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "SECCION")
public class Seccion {

    @Id
    @Column(name = "ID_SECCION", unique = true, nullable = false)
    private int idSeccion;
    @ManyToOne
    @JoinColumn(name = "id_grado")
    private Grado grado;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vcNombre;
    @Column(name = "TY_ESTADO", nullable = false)
    private boolean tyEstado;
    @OneToMany(mappedBy = "seccion")
    private Set<Tutor> tutors = new HashSet(0);
    @OneToMany(mappedBy = "seccion")
    private Set<Curso> cursos = new HashSet(0);

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public boolean isTyEstado() {
        return tyEstado;
    }

    public void setTyEstado(boolean tyEstado) {
        this.tyEstado = tyEstado;
    }

    public Set<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(Set<Tutor> tutors) {
        this.tutors = tutors;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

}
