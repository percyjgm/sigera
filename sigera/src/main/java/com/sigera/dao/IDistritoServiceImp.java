/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Distrito;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrador
 */

@Service
public class IDistritoServiceImp implements  IDistritoService{

    
    private IDistritoDao distritoDao;

    public IDistritoDao getDistritoDAO() {
        return distritoDao;
    }

    public void setDistritoDAO(IDistritoDao distritoDao) {
        this.distritoDao = distritoDao;
    }
    
    
    @Override
    @Transactional
    public void addDistrito(Distrito user) {
         distritoDao.addDistrito(user);
    }

    @Override
    @Transactional
    public void updateDistrito(Distrito user) {
         distritoDao.updateDistrito(user);
    }

    @Override
    @Transactional
    public void deleteDistrito(Integer id) {
         distritoDao.deleteDistrito(id);
    }

    @Override
    @Transactional
    public Distrito getDistritoById(int id) {
         return distritoDao.getDistritoById(id);
    }

    @Override
    @Transactional
    public List<Distrito> getDistritos() {
         return distritoDao.getDistritos();
    }
    
}
