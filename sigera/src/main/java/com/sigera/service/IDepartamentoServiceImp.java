/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.service;

import com.sigera.dao.IDepartamentoDao;
import com.sigera.model.Departamento;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrador
 */
@Transactional
public class IDepartamentoServiceImp implements IDepartamentoService {

    // UserDAO is injected...
    IDepartamentoDao departamentoDAO;

    @Transactional(readOnly = false)
    @Override
    public void addDepartamento(Departamento user) {
        departamentoDAO.addDepartamento(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void updateDepartamento(Departamento user) {
        departamentoDAO.updateDepartamento(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteDepartamento(Departamento user) {
        departamentoDAO.deleteDepartamento(user);
    }

    @Override
    public Departamento getDepartamentoById(int id) {
        return departamentoDAO.getDepartamentoById(id);
    }

    @Override
    public List<Departamento> getDepartamentos() {
        return departamentoDAO.getDepartamentos();
    }

    public IDepartamentoDao getDepartamentoDAO() {
        return departamentoDAO;
    }

    public void setDepartamentoDAO(IDepartamentoDao departamentoDAO) {
        this.departamentoDAO = departamentoDAO;
    }

}
