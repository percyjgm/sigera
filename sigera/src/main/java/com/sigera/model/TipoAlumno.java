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
@Table(name = "TIPO_ALUMNO")
public class TipoAlumno {

    @Id
    @Column(name = "ID_TIPO_ALUMNO", unique = true, nullable = false)
    private int idTipoAlumno;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vcNombre;
    
    @OneToMany(mappedBy = "tipoAlumno")
    private Set<Alumno> alumnos = new HashSet(0);

    public int getIdTipoAlumno() {
        return idTipoAlumno;
    }

    public void setIdTipoAlumno(int idTipoAlumno) {
        this.idTipoAlumno = idTipoAlumno;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}
