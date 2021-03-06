package com.sigera.model;
// Generated 07/10/2015 04:43:51 PM by Hibernate Tools 4.3.1

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
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "CURSO"
)
public class Curso implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID_CURSO", unique = true, nullable = false)
    private Integer idCurso;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SECCION", nullable = false)
    private Seccion seccion;
    @Column(name = "VC_NOMBRE", nullable = false, length = 45)
    private String vcNombre;
    @Column(name = "VC_CREADO_POR", length = 45)
    private String vcCreadoPor;
    @Column(name = "VC_MODIFICADO_POR", length = 45)
    private String vcModificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_MODIFICACION", length = 19)
    private Date dtFechaModificacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_CREACION", length = 19)
    private Date dtFechaCreacion;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
    private Set<CursoPorProfesor> cursoPorProfesors = new HashSet(0);

   
    public Integer getIdCurso() {
        return this.idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Seccion getSeccion() {
        return this.seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public String getVcCreadoPor() {
        return this.vcCreadoPor;
    }

    public void setVcCreadoPor(String vcCreadoPor) {
        this.vcCreadoPor = vcCreadoPor;
    }

    public String getVcModificadoPor() {
        return this.vcModificadoPor;
    }

    public void setVcModificadoPor(String vcModificadoPor) {
        this.vcModificadoPor = vcModificadoPor;
    }

    public Date getDtFechaModificacion() {
        return this.dtFechaModificacion;
    }

    public void setDtFechaModificacion(Date dtFechaModificacion) {
        this.dtFechaModificacion = dtFechaModificacion;
    }

    public Date getDtFechaCreacion() {
        return this.dtFechaCreacion;
    }

    public void setDtFechaCreacion(Date dtFechaCreacion) {
        this.dtFechaCreacion = dtFechaCreacion;
    }

    public Set getCursoPorProfesors() {
        return this.cursoPorProfesors;
    }

    public void setCursoPorProfesors(Set cursoPorProfesors) {
        this.cursoPorProfesors = cursoPorProfesors;
    }

}
