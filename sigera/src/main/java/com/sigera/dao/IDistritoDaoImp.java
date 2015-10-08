/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Distrito;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Administrador
 */
public class IDistritoDaoImp implements IDistritoDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addDistrito(Distrito user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.persist(user);
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
    }

    @Override
    public void updateDistrito(Distrito user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(user);
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
    }

    @Override
    public void deleteDistrito(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Distrito item = (Distrito) session.get(Distrito.class, id);
        if (null != item) {
            session.delete(item);
        }
        session.getTransaction().commit();
        //return item;
    }

    @Override
    public Distrito getDistritoById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Distrito item = null;
        try {

            session.beginTransaction();
            item = (Distrito) session.get(Distrito.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return item;
    }

    @Override
    public List<Distrito> getDistritos() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Distrito> items = null;
        try {

            items = (List<Distrito>) session.createQuery("from Distrito").list();

        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return items;
    }

}
