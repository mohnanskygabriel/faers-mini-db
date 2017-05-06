/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.DAO;

import com.mycompany.faersrest.model.SubstanceName;
import java.util.List;

/**
 *
 * @author Patrik Rojek
 */
public interface SubstanceNameDao {
    List<SubstanceName> getSubstanceName(String name);
}
