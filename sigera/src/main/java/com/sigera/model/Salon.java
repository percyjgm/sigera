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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Salon generated by hbm2java
 */
@Entity
@Table(name = "SALON"
)
public class Salon implements java.io.Serializable {

    private Integer idSalon;
    private Estado estado;
    private String vcNombre;
    private Set<Horario> horarios = new HashSet(0);

    public Salon() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_SALON", unique = true, nullable = false)
    public Integer getIdSalon() {
        return this.idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ESTADO", nullable = false)
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Column(name = "VC_NOMBRE", nullable = false, length = 45)
    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "salon")
    public Set<Horario> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(Set<Horario> horarios) {
        this.horarios = horarios;
    }

}