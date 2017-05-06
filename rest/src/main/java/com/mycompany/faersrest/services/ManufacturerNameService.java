/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.ManufacturerNameDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.ManufacturerName;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class ManufacturerNameService {
    private ManufacturerNameDao dao;

    public ManufacturerNameService() {
        dao = DaoFactory.INSTANCE.getManufacturerNameDao();
    }    
    
    public List<ManufacturerName> getManufacturerName(String name){        
        List<ManufacturerName> list = dao.getManufacturerName(name);
        return list;
    }
}
