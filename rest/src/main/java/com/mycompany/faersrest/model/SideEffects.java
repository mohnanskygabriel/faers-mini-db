/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.model;

/**
 *
 * @author Patrik Rojek
 */
public class SideEffects {
    
    private String meddra_pt;
    private int quantity;

    public SideEffects() {
    }

    public SideEffects(String meddra_pt, int quantity) {
        this.meddra_pt = meddra_pt;
        this.quantity = quantity;
    }

    public String getMeddra_pt() {
        return meddra_pt;
    }

    public void setMeddra_pt(String meddra_pt) {
        this.meddra_pt = meddra_pt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
