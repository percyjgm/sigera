/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Departamento;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Administrador
 */
public class IDepartamentoDaoImp implements IDepartamentoDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addDepartamento(Departamento user) {
          getSessionFactory().getCurrentSession().save(user);    
    }

    @Override
    public void updateDepartamento(Departamento user) {
           getSessionFactory().getCurrentSession().update(user);    
    }

    @Override
    public void deleteDepartamento(Departamento user) {
        getSessionFactory().getCurrentSession().delete(user);      
    }

    @Override
    public Departamento getDepartamentoById(int id) {
         List list = getSessionFactory().getCurrentSession()
                .createQuery("from Departamento where ID_DEPARTAMENTO=?")
                .setParameter(0, id).list();
        return (Departamento) list.get(0);   
    }

    @Override
    public List<Departamento> getDepartamentos() {
       List<Departamento> list = getSessionFactory().getCurrentSession().createQuery("from Departamento").list();
        return list;    
    }

}
