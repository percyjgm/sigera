/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.model;

import javax.persistence.*;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name="PERMISO")
public class Permiso {

    @Id
    @Column(name = "ID_PERMISO", unique = true, nullable = false)
    private int idPermiso;
    @ManyToOne
    @JoinColumn(name = "id_modulo")
    private Modulo moduloes;
    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;
    @Column(name = "TY_LISTAR")
    private boolean tyListar;
    @Column(name = "TY_CREAR")
    private boolean tyCrear;
    @Column(name = "TY_ACTUALIZAR")
    private boolean tyActualizar;
    @Column(name = "TY_ELIMINAR")
    private boolean tyEliminar;

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Modulo getModulo() {
        return moduloes;
    }

    public void setModulo(Modulo modulo) {
        this.moduloes = modulo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public boolean isTyListar() {
        return tyListar;
    }

    public void setTyListar(boolean tyListar) {
        this.tyListar = tyListar;
    }

    public boolean isTyCrear() {
        return tyCrear;
    }

    public void setTyCrear(boolean tyCrear) {
        this.tyCrear = tyCrear;
    }

    public boolean isTyActualizar() {
        return tyActualizar;
    }

    public void setTyActualizar(boolean tyActualizar) {
        this.tyActualizar = tyActualizar;
    }

    public boolean isTyEliminar() {
        return tyEliminar;
    }

    public void setTyEliminar(boolean tyEliminar) {
        this.tyEliminar = tyEliminar;
    }

}
