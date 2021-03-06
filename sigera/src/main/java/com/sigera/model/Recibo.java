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
 * Recibo generated by hbm2java
 */
@Entity
@Table(name="RECIBO"
    
)
public class Recibo  implements java.io.Serializable {


     private Integer idRecibo;
     private Alumno alumno;
     private TipoPago tipoPago;
     private double dbSubtotal;
     private double dbIgv;
     private double dbMora;
     private double dbTotal;
     private Date dtFechaEmision;

    public Recibo() {
    }

	
   
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID_RECIBO", unique=true, nullable=false)
    public Integer getIdRecibo() {
        return this.idRecibo;
    }
    
    public void setIdRecibo(Integer idRecibo) {
        this.idRecibo = idRecibo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ALUMNO", nullable=false)
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_PAGO", nullable=false)
    public TipoPago getTipoPago() {
        return this.tipoPago;
    }
    
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    
    @Column(name="DB_SUBTOTAL", nullable=false, precision=22, scale=0)
    public double getDbSubtotal() {
        return this.dbSubtotal;
    }
    
    public void setDbSubtotal(double dbSubtotal) {
        this.dbSubtotal = dbSubtotal;
    }

    
    @Column(name="DB_IGV", nullable=false, precision=22, scale=0)
    public double getDbIgv() {
        return this.dbIgv;
    }
    
    public void setDbIgv(double dbIgv) {
        this.dbIgv = dbIgv;
    }

    
    @Column(name="DB_MORA", nullable=false, precision=22, scale=0)
    public double getDbMora() {
        return this.dbMora;
    }
    
    public void setDbMora(double dbMora) {
        this.dbMora = dbMora;
    }

    
    @Column(name="DB_TOTAL", nullable=false, precision=22, scale=0)
    public double getDbTotal() {
        return this.dbTotal;
    }
    
    public void setDbTotal(double dbTotal) {
        this.dbTotal = dbTotal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DT_FECHA_EMISION", length=19)
    public Date getDtFechaEmision() {
        return this.dtFechaEmision;
    }
    
    public void setDtFechaEmision(Date dtFechaEmision) {
        this.dtFechaEmision = dtFechaEmision;
    }




}


