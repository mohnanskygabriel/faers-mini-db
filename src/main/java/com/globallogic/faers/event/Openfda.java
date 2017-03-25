package com.globallogic.faers.event;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPENFDA")
public class Openfda {

    private Long id;
    private ArrayList<String> splId = null;
    private ArrayList<String> productNdc = null;
    private ArrayList<String> route = null;
    private ArrayList<String> substanceName = null;
    private ArrayList<String> rxcui = null;
    private ArrayList<String> splSetId = null;
    private ArrayList<String> packageNdc = null;
    private ArrayList<String> productType = null;
    private ArrayList<String> genericName = null;
    private ArrayList<String> manufacturerName = null;
    private ArrayList<String> brandName = null;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<String> getSplId() {
        return splId;
    }

    public void setSplId(ArrayList<String> splId) {
        this.splId = splId;
    }

    public ArrayList<String> getProductNdc() {
        return productNdc;
    }

    public void setProductNdc(ArrayList<String> productNdc) {
        this.productNdc = productNdc;
    }

    public ArrayList<String> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<String> route) {
        this.route = route;
    }

    public ArrayList<String> getSubstanceName() {
        return substanceName;
    }

    public void setSubstanceName(ArrayList<String> substanceName) {
        this.substanceName = substanceName;
    }

    public ArrayList<String> getRxcui() {
        return rxcui;
    }

    public void setRxcui(ArrayList<String> rxcui) {
        this.rxcui = rxcui;
    }

    public ArrayList<String> getSplSetId() {
        return splSetId;
    }

    public void setSplSetId(ArrayList<String> splSetId) {
        this.splSetId = splSetId;
    }

    public ArrayList<String> getPackageNdc() {
        return packageNdc;
    }

    public void setPackageNdc(ArrayList<String> packageNdc) {
        this.packageNdc = packageNdc;
    }

    public ArrayList<String> getProductType() {
        return productType;
    }

    public void setProductType(ArrayList<String> productType) {
        this.productType = productType;
    }

    public ArrayList<String> getGenericName() {
        return genericName;
    }

    public void setGenericName(ArrayList<String> genericName) {
        this.genericName = genericName;
    }

    public ArrayList<String> getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(ArrayList<String> manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ArrayList<String> getBrandName() {
        return brandName;
    }

    public void setBrandName(ArrayList<String> brandName) {
        this.brandName = brandName;
    }

}
