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
public class SubstanceName {
    
    private String brand_name;
    private String substance_name;

    public SubstanceName() {
    }

    public SubstanceName(String brand_name, String substance_name) {
        this.brand_name = brand_name;
        this.substance_name = substance_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getSubstance_name() {
        return substance_name;
    }

    public void setSubstance_name(String substance_name) {
        this.substance_name = substance_name;
    }    
}
