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
@Table(name="PERSONA")
public class Persona {

    @Id
    @Column(name = "ID_PERSONA", unique = true, nullable = false)
    private int id;
    @Column(name = "VC_NOMBRE", nullable = false)
    private String vc_nombre;
    @Column(name = "VC_APELLIDO", nullable = false)
    private String vc_apellido;
    @Column(name = "IN_DNI", nullable = false)
    private String in_dni;
    @Column(name = "TY_SEXO")
   
    private boolean ty_sexo;
    @Column(name = "VC_TELEFONO", nullable = false)
    private String vc_telefono;
    @Column(name = "VC_CELULAR", nullable = false)
    private String vc_celular;
    @Column(name = "VC_EMAIL", nullable = false)
    private String vc_email;

    @Column(name = "DT_FECHA_NACIMIENTO", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_fecha_nacimiento;
    @Column(name = "DT_FECHA_REGISTRO", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_fecha_registro;
    @Column(name = "DT_FECHA_MODIFICACION", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_fecha_modificacion;
    
    @ManyToOne
    @JoinColumn(name = "id_direcion")
    private Direccion direccion;
    @OneToMany(mappedBy = "persona")
    private Set<Usuario> usuarios=new HashSet<Usuario>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVc_nombre() {
        return vc_nombre;
    }

    public void setVc_nombre(String vc_nombre) {
        this.vc_nombre = vc_nombre;
    }

    public String getVc_apellido() {
        return vc_apellido;
    }

    public void setVc_apellido(String vc_apellido) {
        this.vc_apellido = vc_apellido;
    }

    public String getIn_dni() {
        return in_dni;
    }

    public void setIn_dni(String in_dni) {
        this.in_dni = in_dni;
    }

    public boolean isTy_sexo() {
        return ty_sexo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setTy_sexo(boolean ty_sexo) {
        this.ty_sexo = ty_sexo;
    }

    public String getVc_telefono() {
        return vc_telefono;
    }

    public void setVc_telefono(String vc_telefono) {
        this.vc_telefono = vc_telefono;
    }

    public String getVc_celular() {
        return vc_celular;
    }

    public void setVc_celular(String vc_celular) {
        this.vc_celular = vc_celular;
    }

    public String getVc_email() {
        return vc_email;
    }

    public void setVc_email(String vc_email) {
        this.vc_email = vc_email;
    }

    public Date getDt_fecha_nacimiento() {
        return dt_fecha_nacimiento;
    }

    public void setDt_fecha_nacimiento(Date dt_fecha_nacimiento) {
        this.dt_fecha_nacimiento = dt_fecha_nacimiento;
    }

    public Date getDt_fecha_registro() {
        return dt_fecha_registro;
    }

    public void setDt_fecha_registro(Date dt_fecha_registro) {
        this.dt_fecha_registro = dt_fecha_registro;
    }

    public Date getDt_fecha_modificacion() {
        return dt_fecha_modificacion;
    }

    public void setDt_fecha_modificacion(Date dt_fecha_modificacion) {
        this.dt_fecha_modificacion = dt_fecha_modificacion;
    }

   
    
    

}
