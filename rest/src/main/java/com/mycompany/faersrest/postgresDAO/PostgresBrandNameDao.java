/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.BrandNameDao;
import com.mycompany.faersrest.model.BrandName;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresBrandNameDao implements BrandNameDao {
    
    
    private JdbcTemplate jdbcTemplate;
    
    public PostgresBrandNameDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<BrandName> getBrandNamesByName(String name) {
        String sql = "select distinct brand_name from openfda_drug_info_brand_name where brand_name like '%" + name +"%'";
        BeanPropertyRowMapper<BrandName> bprm = new BeanPropertyRowMapper<>(BrandName.class);
        return jdbcTemplate.query(sql, bprm);
    }
}
