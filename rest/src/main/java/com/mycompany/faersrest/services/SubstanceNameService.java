/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.services;

import com.mycompany.faersrest.DAO.SubstanceNameDao;
import com.mycompany.faersrest.DaoFactory;
import com.mycompany.faersrest.model.SubstanceName;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public class SubstanceNameService {
    private SubstanceNameDao dao;

    public SubstanceNameService() {
        dao = DaoFactory.INSTANCE.getSubstanceNameDao();
    }    
    
    public List<SubstanceName> getSubstanceName(String name){        
        List<SubstanceName> list = dao.getSubstanceName(name);
        return list;
    }
}
