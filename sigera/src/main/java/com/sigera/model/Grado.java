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
@Table(name = "GRADO")
public class Grado {
    
    @Id
    @Column(name = "ID_GRADO", unique = true, nullable = false)
     private int idGrado;
    @Column(name = "VC_NOMBRE",  nullable = false)
     private String vcNombre;
     @OneToMany(mappedBy = "grado")
    private Set<ListaMateriales> listaMaterialeses = new HashSet(0);
    @OneToMany(mappedBy = "grado")
     private Set<Seccion> seccions = new HashSet(0);
    @OneToMany(mappedBy = "grados")
     private Set<Matricula> matriculas = new HashSet(0);

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public Set getListaMaterialeses() {
        return listaMaterialeses;
    }

    public void setListaMaterialeses(Set listaMaterialeses) {
        this.listaMaterialeses = listaMaterialeses;
    }

    public Set<Seccion> getSeccions() {
        return seccions;
    }

    public void setSeccions(Set<Seccion> seccions) {
        this.seccions = seccions;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    
    
}
