package com.globallogic.faers.event;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPENFDA")
public class Openfda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private List<String> splId = null;
    private List<String> productNdc = null;
    private List<String> route = null;
    private List<String> substanceName = null;
    private List<String> rxcui = null;
    private List<String> splSetId = null;
    private List<String> packageNdc = null;
    private List<String> productType = null;
    private List<String> genericName = null;
    private List<String> manufacturerName = null;
    private List<String> brandName = null;

    public List<String> getSplId() {
        return splId;
    }

    public void setSplId(List<String> splId) {
        this.splId = splId;
    }

    public List<String> getProductNdc() {
        return productNdc;
    }

    public void setProductNdc(List<String> productNdc) {
        this.productNdc = productNdc;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public List<String> getSubstanceName() {
        return substanceName;
    }

    public void setSubstanceName(List<String> substanceName) {
        this.substanceName = substanceName;
    }

    public List<String> getRxcui() {
        return rxcui;
    }

    public void setRxcui(List<String> rxcui) {
        this.rxcui = rxcui;
    }

    public List<String> getSplSetId() {
        return splSetId;
    }

    public void setSplSetId(List<String> splSetId) {
        this.splSetId = splSetId;
    }

    public List<String> getPackageNdc() {
        return packageNdc;
    }

    public void setPackageNdc(List<String> packageNdc) {
        this.packageNdc = packageNdc;
    }

    public List<String> getProductType() {
        return productType;
    }

    public void setProductType(List<String> productType) {
        this.productType = productType;
    }

    public List<String> getGenericName() {
        return genericName;
    }

    public void setGenericName(List<String> genericName) {
        this.genericName = genericName;
    }

    public List<String> getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(List<String> manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public List<String> getBrandName() {
        return brandName;
    }

    public void setBrandName(List<String> brandName) {
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
