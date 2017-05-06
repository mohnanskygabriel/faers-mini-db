/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.postgresDAO;

import com.mycompany.faersrest.DAO.ManufacturerNameDao;
import com.mycompany.faersrest.model.ManufacturerName;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik Rojek
 */
public class PostgresManufacturerNameDao implements ManufacturerNameDao {

    private JdbcTemplate jdbcTemplate;
    
    public PostgresManufacturerNameDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<ManufacturerName> getManufacturerName(String name) {
        String sql = "select distinct bn.brand_name, mn.manufacturer_name "
                + "from openfda_drug_info_brand_name bn inner join openfda_drug_info_manufacturer_name mn "
                + "on (bn.openfda_id = mn.openfda_id) where mn.manufacturer_name like '%" + name +"%'";
        BeanPropertyRowMapper<ManufacturerName> bprm = new BeanPropertyRowMapper<>(ManufacturerName.class);
        return jdbcTemplate.query(sql, bprm);
    }
    
}
