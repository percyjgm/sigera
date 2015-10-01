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
@Table(name = "ALUMNO")
public class Alumno {

    @Id
    @Column(name = "ID_ALUMNO", unique = true, nullable = false)
    private int idAlumno;
    
    @ManyToOne
    @JoinColumn(name = "id_apoderado")
    private Apoderado apoderado;

    @ManyToOne
    @JoinColumn(name = "id_personas")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_alumno")
    private TipoAlumno tipoAlumno;
    
    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno department;
    
    @OneToMany(mappedBy = "alumno")
    private Set<Incidencias> incidenciases = new HashSet(0);
    
    @OneToMany(mappedBy = "alumno")
    
    private Set<Matricula> matriculas = new HashSet(0);
    
    @OneToMany(mappedBy = "alumnor")
    private Set<Recibo> recibos = new HashSet(0);
    
@Column(name = "VC_EDAD")
    private int vcEdad;
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoAlumno getTipoAlumno() {
        return tipoAlumno;
    }

    public void setTipoAlumno(TipoAlumno tipoAlumno) {
        this.tipoAlumno = tipoAlumno;
    }

    public int getVcEdad() {
        return vcEdad;
    }

    public void setVcEdad(int vcEdad) {
        this.vcEdad = vcEdad;
    }

    public Set<Incidencias> getIncidenciases() {
        return incidenciases;
    }

    public void setIncidenciases(Set<Incidencias> incidenciases) {
        this.incidenciases = incidenciases;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public Set<Recibo> getRecibos() {
        return recibos;
    }

    public void setRecibos(Set<Recibo> recibos) {
        this.recibos = recibos;
    }

    public Alumno getDepartment() {
        return department;
    }

    public void setDepartment(Alumno department) {
        this.department = department;
    }

}
