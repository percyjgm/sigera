package com.sigera.model;
// Generated 07/10/2015 04:43:51 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Matricula generated by hbm2java
 */
@Entity
@Table(name = "MATRICULA"
)
public class Matricula implements java.io.Serializable {

    private Integer idMatricula;
    private Alumno alumno;
    private Estado estado;
    private Grado grado;

    public Matricula() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_MATRICULA", unique = true, nullable = false)
    public Integer getIdMatricula() {
        return this.idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ALUMNO", nullable = false)
    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ESTADO", nullable = false)
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_GRADO", nullable = false)
    public Grado getGrado() {
        return this.grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

}
