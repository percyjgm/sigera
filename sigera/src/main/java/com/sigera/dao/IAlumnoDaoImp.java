/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Alumno;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Administrador
 */
public class IAlumnoDaoImp implements IAlumnoDao{
private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public void addAlumno(Alumno user) {
        getSessionFactory().getCurrentSession().save(user);
    }

    @Override
    public void updateAlumno(Alumno user) {
         getSessionFactory().getCurrentSession().update(user);
    }

    @Override
    public void deleteAlumno(Alumno user) {
         getSessionFactory().getCurrentSession().delete(user);
    }

    @Override
    public Alumno getAlumnoById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
