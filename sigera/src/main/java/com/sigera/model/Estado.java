package com.sigera.model;
// Generated 07/10/2015 04:43:51 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name = "ESTADO"
)
public class Estado implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID_ESTADO", unique = true, nullable = false)
    private Integer idEstado;
    @Column(name = "VC_NOMBRE", nullable = false, length = 45)
    private String vcNombre;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Perfil> perfils = new HashSet(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Salon> salons = new HashSet(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Profesor> profesors = new HashSet(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Matricula> matriculas = new HashSet(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Tarea> tareas = new HashSet(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
    private Set<Usuario> usuarios = new HashSet(0);

    public Estado() {
    }

    public Integer getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public Set<Perfil> getPerfils() {
        return this.perfils;
    }

    public void setPerfils(Set<Perfil> perfils) {
        this.perfils = perfils;
    }

    public Set<Salon> getSalons() {
        return this.salons;
    }

    public void setSalons(Set<Salon> salons) {
        this.salons = salons;
    }

    public Set<Profesor> getProfesors() {
        return this.profesors;
    }

    public void setProfesors(Set<Profesor> profesors) {
        this.profesors = profesors;
    }

    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public Set<Tarea> getTareas() {
        return this.tareas;
    }

    public void setTareas(Set<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Set getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

}