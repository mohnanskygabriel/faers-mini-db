/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Patrik Rojek
 */
@XmlRootElement
public class BrandName {
    
    private String brand_name;

    public BrandName() {
    }

    public BrandName(String brandName) {        
        this.brand_name = brandName;
    }    

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }    
}
