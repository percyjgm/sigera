/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Distrito;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface IDistritoService {
    public void addDistrito(Distrito user);

    public void updateDistrito(Distrito user);

    public void deleteDistrito(Integer id);

    public Distrito getDistritoById(int id);

    public List<Distrito> getDistritos();
    
    
}
