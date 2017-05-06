/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.BrandNameDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.BrandName;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class BrandNameService {
    
    private BrandNameDao dao;

    public BrandNameService() {
        dao = DaoFactory.INSTANCE.getBrandNameDao();
    }    
    
    public List<BrandName> getBrandNames(String name){        
        List<BrandName> list = dao.getBrandNamesByName(name);
        return list;
    }
}
