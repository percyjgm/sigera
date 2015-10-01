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
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "RECIBO")
public class Recibo {

    @Id
    @Column(name = "ID_RECIBO", unique = true, nullable = false)
    private int idRecibo;
    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumnor;
    @ManyToOne
    @JoinColumn(name = "id_tipo_pago")
    private TipoPago tipoPago;
    @Column(name = "DB_SUBTOTAL", nullable = false)
    private double dbSubtotal;
    @Column(name = "DB_IGV", nullable = false)
    private double dbIgv;
    @Column(name = "DB_MORA", nullable = false)
    private double dbMora;
    @Column(name = "DB_TOTAL", nullable = false)
    private double dbTotal;
    @Column(name = "DT_FECHA_MODIFICACION", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaEmision;

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Alumno getAlumno() {
        return alumnor;
    }

    public void setAlumno(Alumno alumnor) {
        this.alumnor = alumnor;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getDbSubtotal() {
        return dbSubtotal;
    }

    public void setDbSubtotal(double dbSubtotal) {
        this.dbSubtotal = dbSubtotal;
    }

    public double getDbIgv() {
        return dbIgv;
    }

    public void setDbIgv(double dbIgv) {
        this.dbIgv = dbIgv;
    }

    public double getDbMora() {
        return dbMora;
    }

    public void setDbMora(double dbMora) {
        this.dbMora = dbMora;
    }

    public double getDbTotal() {
        return dbTotal;
    }

    public void setDbTotal(double dbTotal) {
        this.dbTotal = dbTotal;
    }

    public Date getDtFechaEmision() {
        return dtFechaEmision;
    }

    public void setDtFechaEmision(Date dtFechaEmision) {
        this.dtFechaEmision = dtFechaEmision;
    }
    
    
}
