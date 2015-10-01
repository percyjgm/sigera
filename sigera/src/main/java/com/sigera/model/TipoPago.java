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
@Table(name = "TIPO_PAGO")
public class TipoPago {

    @Id
    @Column(name = "ID_TIPO_PAGO", unique = true, nullable = false)
    private int idTipoPago;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vcNombre;
    @Column(name = "DB_PRECIO")
    private double dbPrecio;
    @OneToMany(mappedBy = "tipoPago")
    private Set<Recibo> recibos = new HashSet(0);

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getVcNombre() {
        return vcNombre;
    }

    public void setVcNombre(String vcNombre) {
        this.vcNombre = vcNombre;
    }

    public double getDbPrecio() {
        return dbPrecio;
    }

    public void setDbPrecio(double dbPrecio) {
        this.dbPrecio = dbPrecio;
    }

    public Set<Recibo> getRecibos() {
        return recibos;
    }

    public void setRecibos(Set<Recibo> recibos) {
        this.recibos = recibos;
    }

}
