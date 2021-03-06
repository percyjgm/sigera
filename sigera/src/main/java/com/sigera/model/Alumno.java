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
 * Alumno generated by hbm2java
 */
@Entity
@Table(name = "ALUMNO"
)
public class Alumno implements java.io.Serializable {

    private Integer idAlumno;
    private Apoderado apoderado;
    private Persona persona;
    private TipoAlumno tipoAlumno;
    private int vcEdad;
    private String vcColegioProcedencia;
    private Set<Incidencias> incidenciases = new HashSet(0);
    private Set<Matricula> matriculas = new HashSet(0);
    private Set<Recibo> recibos = new HashSet(0);

    public Alumno() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_ALUMNO", unique = true, nullable = false)
    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_APODERADO", nullable = false)
    public Apoderado getApoderado() {
        return this.apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_ALUMNO", nullable = false)
    public TipoAlumno getTipoAlumno() {
        return this.tipoAlumno;
    }

    public void setTipoAlumno(TipoAlumno tipoAlumno) {
        this.tipoAlumno = tipoAlumno;
    }

    @Column(name = "VC_EDAD", nullable = false)
    public int getVcEdad() {
        return this.vcEdad;
    }

    public void setVcEdad(int vcEdad) {
        this.vcEdad = vcEdad;
    }

    @Column(name = "VC_COLEGIO_PROCEDENCIA", nullable = false, length = 100)
    public String getVcColegioProcedencia() {
        return this.vcColegioProcedencia;
    }

    public void setVcColegioProcedencia(String vcColegioProcedencia) {
        this.vcColegioProcedencia = vcColegioProcedencia;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno")
    public Set<Incidencias> getIncidenciases() {
        return this.incidenciases;
    }

    public void setIncidenciases(Set<Incidencias> incidenciases) {
        this.incidenciases = incidenciases;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno")
    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno")
    public Set<Recibo> getRecibos() {
        return this.recibos;
    }

    public void setRecibos(Set<Recibo> recibos) {
        this.recibos = recibos;
    }

}
