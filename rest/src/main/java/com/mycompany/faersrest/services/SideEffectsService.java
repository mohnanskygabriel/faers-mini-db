/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.SideEffectsDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.SideEffects;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class SideEffectsService {
    
    private SideEffectsDao dao;

    public SideEffectsService() {
        dao = DaoFactory.INSTANCE.getSideEffectsDao();
    }    
    
    public List<SideEffects> getSideEffects(String name){        
        List<SideEffects> list = dao.getSideEffects(name);
        return list;
    }
}
