package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
    @Column(name = "SPL_ID")
    private List<String> splID = null;

    @SerializedName("application_number")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_APPLICATION_NUMBER")
    @Column(name = "APPLICATION_NUMBER")
    private List<String> applicationNumber = null;

    @SerializedName("product_ndc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PRODUCT_NDC")
    @Column(name = "PRODUCT_NDC")
    private List<String> productNDC = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_ROUTE")
    private List<String> route = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_NUI")
    private List<String> nui = null;

    @SerializedName("substance_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_SUBSTANCE_NAME")
    @Column(name = "SUBSTANCE_NAME")
    private List<String> substanceName = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_RXCUI")
    private List<String> rxcui = null;

    @SerializedName("spl_set_id")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_SPL_SET_ID")
    @Column(name = "SPL_SET_ID")
    private List<String> spl_Set_ID = null;

    @SerializedName("package_ndc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PACKAGE_NDC")
    @Column(name = "PACKAGE_NDC")
    private List<String> packageNDC = null;

    @SerializedName("product_type")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PRODUCT_TYPE")
    @Column(name = "PRODUCT_TYPE")
    private List<String> productType = null;

    @SerializedName("generic_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_GENERIC_NAME")
    @Column(name = "GENERIC_NAME", columnDefinition="text")
    private List<String> genericName = null;

    @SerializedName("manufacturer_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_MANUFACTURER_NAME")
    @Column(name = "MANUFACTURER_NAME")
    private List<String> manufacturerName = null;

    @SerializedName("brand_name")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_BRAND_NAME")
    @Column(name = "BRAND_NAME")
    private List<String> brand_Name = null;

    @SerializedName("pharm_class_cs")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_CS")
    @Column(name = "PHARM_CLASS_CS")
    private List<String> pharmClassCS = null;

    @SerializedName("pharm_class_epc")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_EPC")
    @Column(name = "PHARM_CLASS_EPC")
    private List<String> pharmClassEPC = null;

    @SerializedName("pharm_class_pe")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_PE")
    @Column(name = "PHARM_CLASS_PE")
    private List<String> pharmClassPE = null;

    @SerializedName("pharm_class_moa")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_PHARM_CLASS_MOA")
    @Column(name = "PHARM_CLASS_MOA")
    private List<String> pharmClassMOA = null;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "OPENFDA_DRUG_INFO_UNII")
    private List<String> unii = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSplID() {
        return splID;
    }

    public void setSplID(List<String> splID) {
        this.splID = splID;
    }

    public List<String> getProductNDC() {
        return productNDC;
    }

    public void setProductNDC(List<String> productNDC) {
        this.productNDC = productNDC;
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

    public List<String> getSpl_Set_ID() {
        return spl_Set_ID;
    }

    public void setSpl_Set_ID(List<String> spl_Set_ID) {
        this.spl_Set_ID = spl_Set_ID;
    }

    public List<String> getPackageNDC() {
        return packageNDC;
    }

    public void setPackageNDC(List<String> packageNDC) {
        this.packageNDC = packageNDC;
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

    public List<String> getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(List<String> applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public List<String> getPharmClassCS() {
        return pharmClassCS;
    }

    public void setPharmClassCS(List<String> pharmClassCS) {
        this.pharmClassCS = pharmClassCS;
    }

    public List<String> getPharmClassEPC() {
        return pharmClassEPC;
    }

    public void setPharmClassEPC(List<String> pharmClassEPC) {
        this.pharmClassEPC = pharmClassEPC;
    }

    public List<String> getPharmClassPE() {
        return pharmClassPE;
    }

    public void setPharmClassPE(List<String> pharmClassPE) {
        this.pharmClassPE = pharmClassPE;
    }

    public List<String> getPharmClassMOA() {
        return pharmClassMOA;
    }

    public void setPharmClassMOA(List<String> pharmClassMOA) {
        this.pharmClassMOA = pharmClassMOA;
    }

    public List<String> getUnii() {
        return unii;
    }

    public void setUnii(List<String> unii) {
        this.unii = unii;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.splID);
        hash = 29 * hash + Objects.hashCode(this.applicationNumber);
        hash = 29 * hash + Objects.hashCode(this.productNDC);
        hash = 29 * hash + Objects.hashCode(this.route);
        hash = 29 * hash + Objects.hashCode(this.nui);
        hash = 29 * hash + Objects.hashCode(this.substanceName);
        hash = 29 * hash + Objects.hashCode(this.rxcui);
        hash = 29 * hash + Objects.hashCode(this.spl_Set_ID);
        hash = 29 * hash + Objects.hashCode(this.packageNDC);
        hash = 29 * hash + Objects.hashCode(this.productType);
        hash = 29 * hash + Objects.hashCode(this.genericName);
        hash = 29 * hash + Objects.hashCode(this.manufacturerName);
        hash = 29 * hash + Objects.hashCode(this.brand_Name);
        hash = 29 * hash + Objects.hashCode(this.pharmClassCS);
        hash = 29 * hash + Objects.hashCode(this.pharmClassEPC);
        hash = 29 * hash + Objects.hashCode(this.pharmClassPE);
        hash = 29 * hash + Objects.hashCode(this.pharmClassMOA);
        hash = 29 * hash + Objects.hashCode(this.unii);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OpenFDA other = (OpenFDA) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.splID, other.splID)) {
            return false;
        }
        if (!Objects.equals(this.applicationNumber, other.applicationNumber)) {
            return false;
        }
        if (!Objects.equals(this.productNDC, other.productNDC)) {
            return false;
        }
        if (!Objects.equals(this.route, other.route)) {
            return false;
        }
        if (!Objects.equals(this.nui, other.nui)) {
            return false;
        }
        if (!Objects.equals(this.substanceName, other.substanceName)) {
            return false;
        }
        if (!Objects.equals(this.rxcui, other.rxcui)) {
            return false;
        }
        if (!Objects.equals(this.spl_Set_ID, other.spl_Set_ID)) {
            return false;
        }
        if (!Objects.equals(this.packageNDC, other.packageNDC)) {
            return false;
        }
        if (!Objects.equals(this.productType, other.productType)) {
            return false;
        }
        if (!Objects.equals(this.genericName, other.genericName)) {
            return false;
        }
        if (!Objects.equals(this.manufacturerName, other.manufacturerName)) {
            return false;
        }
        if (!Objects.equals(this.brand_Name, other.brand_Name)) {
            return false;
        }
        if (!Objects.equals(this.pharmClassCS, other.pharmClassCS)) {
            return false;
        }
        if (!Objects.equals(this.pharmClassEPC, other.pharmClassEPC)) {
            return false;
        }
        if (!Objects.equals(this.pharmClassPE, other.pharmClassPE)) {
            return false;
        }
        if (!Objects.equals(this.pharmClassMOA, other.pharmClassMOA)) {
            return false;
        }
        if (!Objects.equals(this.unii, other.unii)) {
            return false;
        }
        return true;
    }
    
    

}
