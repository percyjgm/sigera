package com.sigera.model;
// Generated 07/10/2015 04:43:51 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Asistencia generated by hbm2java
 */
@Entity
@Table(name = "ASISTENCIA"
)
public class Asistencia implements java.io.Serializable {

    private Integer idAsistencia;
    private CursoPorProfesor cursoPorProfesor;
    private String vcNombre;
    private boolean tyAsistir;
    private boolean tyTardanza;
    private boolean tyJustificado;
    private Date dtFechaCreacion;
    private Date dtFechaModificacion;

    public Asistencia() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_ASISTENCIA", unique = true, nullable = false)
    public Integer getIdAsistencia() {
        return this.idAsistencia;
    }

    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CURSO_POR_PROFESOR", nullable = false)
    public CursoPorProfesor getCursoPorProfesor() {
        return this.cursoPorProfesor;
    }

    public void setCursoPorProfesor(CursoPorProfesor cursoPorProfesor) {
        this.cursoPorProfesor = cursoPorProfesor;
    }

    @Column(name = "VC_NOMBRE", nullable = false, length = 45)
    public String getVcNombre() {
        return this.vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    @Column(name = "TY_ASISTIR", nullable = false)
    public boolean isTyAsistir() {
        return this.tyAsistir;
    }

    public void setTyAsistir(boolean tyAsistir) {
        this.tyAsistir = tyAsistir;
    }

    @Column(name = "TY_TARDANZA", nullable = false)
    public boolean isTyTardanza() {
        return this.tyTardanza;
    }

    public void setTyTardanza(boolean tyTardanza) {
        this.tyTardanza = tyTardanza;
    }

    @Column(name = "TY_JUSTIFICADO", nullable = false)
    public boolean isTyJustificado() {
        return this.tyJustificado;
    }

    public void setTyJustificado(boolean tyJustificado) {
        this.tyJustificado = tyJustificado;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_CREACION", length = 19)
    public Date getDtFechaCreacion() {
        return this.dtFechaCreacion;
    }

    public void setDtFechaCreacion(Date dtFechaCreacion) {
        this.dtFechaCreacion = dtFechaCreacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FECHA_MODIFICACION", length = 19)
    public Date getDtFechaModificacion() {
        return this.dtFechaModificacion;
    }

    public void setDtFechaModificacion(Date dtFechaModificacion) {
        this.dtFechaModificacion = dtFechaModificacion;
    }

}
