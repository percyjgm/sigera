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
@Table(name = "TIPO_INCIDENCIA")
public class TipoIncidencia {

    private Integer idTipoIncidencia;
    private String vcNombre;
    private Set<Incidencias> incidenciases = new HashSet(0);

    public TipoIncidencia() {
    }

    public TipoIncidencia(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public TipoIncidencia(String vcNombre, Set incidenciases) {
        this.vcNombre = vcNombre;
        this.incidenciases = incidenciases;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_TIPO_INCIDENCIA", unique = true, nullable = false)
    public Integer getIdTipoIncidencia() {
        return this.idTipoIncidencia;
    }

    public void setIdTipoIncidencia(Integer idTipoIncidencia) {
        this.idTipoIncidencia = idTipoIncidencia;
    }

    @Column(name = "VC_NOMBRE", nullable = false, length = 100)
    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    @OneToMany(mappedBy = "tipoIncidencia")
    public Set<Incidencias> getIncidenciases() {
        return this.incidenciases;
    }

    public void setIncidenciases(Set<Incidencias> incidenciases) {
        this.incidenciases = incidenciases;
    }
}
