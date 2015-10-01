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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "CURSO_POR_PROFESOR"
)
public class CursoPorProfesor {

    private int idCursoPorProfesor;
    private Curso curso;

    private Profesor profesor;
    private int idGrado;
    private int idSeccion;
    private int idAlumno;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_CURSO_POR_PROFESOR", unique = true, nullable = false)
    public Integer getIdCursoPorProfesor() {
        return this.idCursoPorProfesor;
    }

    public void setIdCursoPorProfesor(Integer idCursoPorProfesor) {
        this.idCursoPorProfesor = idCursoPorProfesor;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CURSO", nullable = false)
    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", nullable = false)
    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Column(name = "ID_GRADO", nullable = false)
    public int getIdGrado() {
        return this.idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    @Column(name = "ID_SECCION", nullable = false)
    public int getIdSeccion() {
        return this.idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    @Column(name = "ID_ALUMNO", nullable = false)
    public int getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

}
