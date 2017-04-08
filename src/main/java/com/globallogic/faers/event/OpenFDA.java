package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPENFDA_DRUG_INFO")
public class OpenFDA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @SerializedName("spl_id")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_SPL_ID")
    private List<String> spl_ID = null;

    @SerializedName("application_number")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_APPLICATION_NUMBER")
    private List<String> application_Number = null;

    @SerializedName("product_ndc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PRODUCT_NDC")
    private List<String> product_NDC = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_ROUTE")
    private List<String> route = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_NUI")
    private List<String> nui = null;

    @SerializedName("substance_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_SUBSTANCE_NAME")
    private List<String> substance_Name = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_RXCUI")
    private List<String> rxcui = null;

    @SerializedName("spl_set_id")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_SPL_SET_ID")
    private List<String> spl_Set_ID = null;

    @SerializedName("package_ndc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PACKAGE_NDC")
    private List<String> package_NDC = null;

    @SerializedName("product_type")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PRODUCT_TYPE")
    private List<String> product_Type = null;

    @SerializedName("generic_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_GENERIC_NAME")
    private List<String> generic_Name = null;

    @SerializedName("manufacturer_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_MANUFACTURER_NAME")
    private List<String> manufacturer_Name = null;

    @SerializedName("brand_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_BRAND_NAME")
    private List<String> brand_Name = null;

    @SerializedName("pharm_class_cs")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_CS")
    private List<String> pharm_Class_CS = null;

    @SerializedName("pharm_class_epc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_EPC")
    private List<String> pharm_Class_EPC = null;

    @SerializedName("pharm_class_pe")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_PE")
    private List<String> pharm_Class_PE = null;

    @SerializedName("pharm_class_moa")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_MOA")
    private List<String> pharm_Class_MOA = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_UNII")
    private List<String> unii = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSpl_ID() {
        return spl_ID;
    }

    public void setSpl_ID(List<String> spl_ID) {
        this.spl_ID = spl_ID;
    }

    public List<String> getProduct_NDC() {
        return product_NDC;
    }

    public void setProduct_NDC(List<String> product_NDC) {
        this.product_NDC = product_NDC;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public List<String> getSubstance_Name() {
        return substance_Name;
    }

    public void setSubstance_Name(List<String> substance_Name) {
        this.substance_Name = substance_Name;
    }

    public List<String> getRxcui() {
        return rxcui;
    }

    public void setRxcui(List<String> rxcui) {
        this.rxcui = rxcui;
    }

    public List<String> getSpl_Set_ID() {
        return spl_Set_ID;
    }

    public void setSpl_Set_ID(List<String> spl_Set_ID) {
        this.spl_Set_ID = spl_Set_ID;
    }

    public List<String> getPackage_NDC() {
        return package_NDC;
    }

    public void setPackage_NDC(List<String> package_NDC) {
        this.package_NDC = package_NDC;
    }

    public List<String> getProduct_Type() {
        return product_Type;
    }

    public void setProduct_Type(List<String> product_Type) {
        this.product_Type = product_Type;
    }

    public List<String> getGeneric_Name() {
        return generic_Name;
    }

    public void setGeneric_Name(List<String> generic_Name) {
        this.generic_Name = generic_Name;
    }

    public List<String> getManufacturer_Name() {
        return manufacturer_Name;
    }

    public void setManufacturer_Name(List<String> manufacturer_Name) {
        this.manufacturer_Name = manufacturer_Name;
    }

    public List<String> getBrand_Name() {
        return brand_Name;
    }

    public void setBrand_Name(List<String> brand_Name) {
        this.brand_Name = brand_Name;
    }

    public List<String> getNui() {
        return nui;
    }

    public void setNui(List<String> nui) {
        this.nui = nui;
    }

    public List<String> getApplication_Number() {
        return application_Number;
    }

    public void setApplication_Number(List<String> application_Number) {
        this.application_Number = application_Number;
    }

    public List<String> getPharm_Class_CS() {
        return pharm_Class_CS;
    }

    public void setPharm_Class_CS(List<String> pharm_Class_CS) {
        this.pharm_Class_CS = pharm_Class_CS;
    }

    public List<String> getPharm_Class_EPC() {
        return pharm_Class_EPC;
    }

    public void setPharm_Class_EPC(List<String> pharm_Class_EPC) {
        this.pharm_Class_EPC = pharm_Class_EPC;
    }

    public List<String> getPharm_Class_PE() {
        return pharm_Class_PE;
    }

    public void setPharm_Class_PE(List<String> pharm_Class_PE) {
        this.pharm_Class_PE = pharm_Class_PE;
    }

    public List<String> getPharm_Class_MOA() {
        return pharm_Class_MOA;
    }

    public void setPharm_Class_MOA(List<String> pharm_Class_MOA) {
        this.pharm_Class_MOA = pharm_Class_MOA;
    }

    public List<String> getUnii() {
        return unii;
    }

    public void setUnii(List<String> unii) {
        this.unii = unii;
    }

}
