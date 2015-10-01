/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name="LISTA_MATERIALES")
public class ListaMateriales {
     private Integer idListaMateriales;
     private Grado grado;
     private String vcNombre;
     private String vcCreadoPor;
     private Date dtFechaRegistro;
     private Set<Material> materials = new HashSet(0);
     
      @Id 

    
    @Column(name="ID_LISTA_MATERIALES", unique=true, nullable=false)
    public Integer getIdListaMateriales() {
        return this.idListaMateriales;
    }
    
    public void setIdListaMateriales(Integer idListaMateriales) {
        this.idListaMateriales = idListaMateriales;
    }

@ManyToOne
    @JoinColumn(name="ID_GRADO", nullable=false)
    public Grado getGrado() {
        return this.grado;
    }
    
    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    
    @Column(name="VC_NOMBRE", nullable=false, length=45)
    public String getVcNombre() {
        return this.vcNombre;
    }
    
    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    
    @Column(name="VC_CREADO_POR", length=45)
    public String getVcCreadoPor() {
        return this.vcCreadoPor;
    }
    
    public void setVcCreadoPor(String vcCreadoPor) {
        this.vcCreadoPor = vcCreadoPor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DT_FECHA_REGISTRO", length=19)
    public Date getDtFechaRegistro() {
        return this.dtFechaRegistro;
    }
    
    public void setDtFechaRegistro(Date dtFechaRegistro) {
        this.dtFechaRegistro = dtFechaRegistro;
    }

@OneToMany(mappedBy="listaMateriales")
    public Set<Material> getMaterials() {
        return this.materials;
    }
    
    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }
}
