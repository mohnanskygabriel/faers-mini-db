/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.SubstanceNameDao;
import com.mycompany.faersrest.model.SubstanceName;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresSubstanceNameDao implements SubstanceNameDao {

    private JdbcTemplate jdbcTemplate;
    
    public PostgresSubstanceNameDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<SubstanceName> getSubstanceName(String name) {
        String sql = "select distinct bn.brand_name, sn.substance_name "
                + "from openfda_drug_info_brand_name bn inner join openfda_drug_info_substance_name sn "
                + "on (bn.openfda_id = sn.openfda_id) where sn.substance_name like '%" + name +"%'";
        BeanPropertyRowMapper<SubstanceName> bprm = new BeanPropertyRowMapper<>(SubstanceName.class);
        return jdbcTemplate.query(sql, bprm);
    }   
}
