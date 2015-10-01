/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.service;

import com.sigera.model.Departamento;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface IDepartamentoService {

    public void addDepartamento(Departamento user);

    public void updateDepartamento(Departamento user);

    public void deleteDepartamento(Departamento user);

    public Departamento getDepartamentoById(int id);

    public List<Departamento> getDepartamentos();
}
