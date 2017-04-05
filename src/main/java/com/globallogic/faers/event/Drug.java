package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DRUG")
public class Drug {

    private Long id;
    
    @SerializedName("actiondrug")
    private String actionDrug;
   
    @SerializedName("drugadditional")
    private String drugAdditional;
   
    @SerializedName("drugcumulativedosagenumb")
    private String drugCumulativeDosageNumb;
    
    @SerializedName("drugcumulativedosageunit")
    private String drugCumulativeDosageUnit;
   
    @SerializedName("drugdosageform")
    private String drugDosageForm;
   
    @SerializedName("drugintervaldosagedefinition")
    private String drugIntervalDosageDefinition;
   
    @SerializedName("drugintervaldosageunitnumb")
    private String drugIntervalDosageUnitNumb;
   
    @SerializedName("drugrecurreadministration")
    private String drugRecurreAdministration;
   
    @SerializedName("drugseparatedosagenumb")
    private String drugSeparateDosageNumb;
   
    @SerializedName("drugstructuredosagenumb")
    private String drugStructureDosageNumb;
   
    @SerializedName("drugstructuredosageunit")
    private String drugStructureDosageUnit;
   
    @SerializedName("drugadministrationroute")
    private String drugAdministrationRoute;
   
    @SerializedName("drugauthorizationnumb")
    private String drugAuthorizationNumb;
   
    @SerializedName("drugbatchnumb")
    private String drugBatchNumb;
   
    @SerializedName("drugcharacterization")
    private String drugCharacterization;
   
    @SerializedName("drugdoseagetext")
    private String drugDoseageText;
    
    @SerializedName("drugenddate")
    private String drugEndDate;
    
    @SerializedName("drugenddateformat")
    private String drugEndDateFormat;
   
    @SerializedName("drugindication")
    private String drugIndication;
   
    @SerializedName("drugstartdate")
    private String drugStartDate;
    
    @SerializedName("drugstartdateformat")
    private String drugStartDateFormat;
    
    @SerializedName("drugtreatmentduration")
    private String drugTreatmentDuration;
    
    @SerializedName("drugtreatmentdurationunit")
    private String drugTreatmentDurationUnit;
    
    @SerializedName("medicinalproduct")
    private String medicinalProduct;
    
    @SerializedName("openfda")
    private OpenFDA openFDA;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "action")
    public String getActionDrug() {
        return actionDrug;
    }

    public void setActionDrug(String actionDrug) {
        this.actionDrug = actionDrug;
    }

    @Column(name = "additional")
    public String getDrugAdditional() {
        return drugAdditional;
    }

    public void setDrugAdditional(String drugAdditional) {
        this.drugAdditional = drugAdditional;
    }

    @Column(name = "cumulative_dosage_numb")
    public String getDrugCumulativeDosageNumb() {
        return drugCumulativeDosageNumb;
    }

    public void setDrugCumulativeDosageNumb(String drugCumulativeDosageNumb) {
        this.drugCumulativeDosageNumb = drugCumulativeDosageNumb;
    }

    @Column(name = "cumulative_dosage_unit")
    public String getDrugCumulativeDosageUnit() {
        return drugCumulativeDosageUnit;
    }

    public void setDrugCumulativeDosageUnit(String drugCumulativeDosageUnit) {
        this.drugCumulativeDosageUnit = drugCumulativeDosageUnit;
    }

    @Column(name = "dosage_form")
    public String getDrugDosageForm() {
        return drugDosageForm;
    }

    public void setDrugDosageForm(String drugDosageForm) {
        this.drugDosageForm = drugDosageForm;
    }

    @Column(name = "interval_dosage_definition")
    public String getDrugIntervalDosageDefinition() {
        return drugIntervalDosageDefinition;
    }

    public void setDrugIntervalDosageDefinition(String drugIntervalDosageDefinition) {
        this.drugIntervalDosageDefinition = drugIntervalDosageDefinition;
    }

    @Column(name = "interval_dosage_unit_numb")
    public String getDrugIntervalDosageUnitNumb() {
        return drugIntervalDosageUnitNumb;
    }

    public void setDrugIntervalDosageUnitNumb(String drugIntervalDosageUnitNumb) {
        this.drugIntervalDosageUnitNumb = drugIntervalDosageUnitNumb;
    }

    @Column(name = "recurre_administration")
    public String getDrugRecurreAdministration() {
        return drugRecurreAdministration;
    }

    public void setDrugRecurreAdministration(String drugRecurreAdministration) {
        this.drugRecurreAdministration = drugRecurreAdministration;
    }

    @Column(name = "separate_dosage_numb")
    public String getDrugSeparateDosageNumb() {
        return drugSeparateDosageNumb;
    }

    public void setDrugSeparateDosageNumb(String drugSeparateDosageNumb) {
        this.drugSeparateDosageNumb = drugSeparateDosageNumb;
    }

    @Column(name = "structure_dosage_numb")
    public String getDrugStructureDosageNumb() {
        return drugStructureDosageNumb;
    }

    public void setDrugStructureDosageNumb(String drugStructureDosageNumb) {
        this.drugStructureDosageNumb = drugStructureDosageNumb;
    }

    @Column(name = "structure_dosage_unit")
    public String getDrugStructureDosageUnit() {
        return drugStructureDosageUnit;
    }

    public void setDrugStructureDosageUnit(String drugStructureDosageUnit) {
        this.drugStructureDosageUnit = drugStructureDosageUnit;
    }

    @Column(name = "administration_route")
    public String getDrugAdministrationRoute() {
        return drugAdministrationRoute;
    }

    public void setDrugAdministrationRoute(String drugAdministrationRoute) {
        this.drugAdministrationRoute = drugAdministrationRoute;
    }

    @Column(name = "authorization_numb")
    public String getDrugAuthorizationNumb() {
        return drugAuthorizationNumb;
    }

    public void setDrugAuthorizationNumb(String drugAuthorizationNumb) {
        this.drugAuthorizationNumb = drugAuthorizationNumb;
    }

    @Column(name = "batch_numb")
    public String getDrugBatchNumb() {
        return drugBatchNumb;
    }

    public void setDrugBatchNumb(String drugBatchNumb) {
        this.drugBatchNumb = drugBatchNumb;
    }

    @Column(name = "characterization")
    public String getDrugCharacterization() {
        return drugCharacterization;
    }

    public void setDrugCharacterization(String drugCharacterization) {
        this.drugCharacterization = drugCharacterization;
    }

    @Column(name = "doseage_text")
    public String getDrugDoseageText() {
        return drugDoseageText;
    }

    public void setDrugDoseageText(String drugDoseageText) {
        this.drugDoseageText = drugDoseageText;
    }

    @Column(name = "end_date")
    public String getDrugEndDate() {
        return drugEndDate;
    }

    public void setDrugEndDate(String drugEndDate) {
        this.drugEndDate = drugEndDate;
    }

    @Column(name = "end_date_format")
    public String getDrugEndDateFormat() {
        return drugEndDateFormat;
    }

    public void setDrugEndDateFormat(String drugEndDateFormat) {
        this.drugEndDateFormat = drugEndDateFormat;
    }

    @Column(name = "indication")
    public String getDrugIndication() {
        return drugIndication;
    }

    public void setDrugIndication(String drugIndication) {
        this.drugIndication = drugIndication;
    }

    @Column(name = "start_date")
    public String getDrugStartDate() {
        return drugStartDate;
    }

    public void setDrugStartDate(String drugStartDate) {
        this.drugStartDate = drugStartDate;
    }

    @Column(name = "start_date_format")
    public String getDrugStartDateFormat() {
        return drugStartDateFormat;
    }

    public void setDrugStartDateFormat(String drugStartDateFormat) {
        this.drugStartDateFormat = drugStartDateFormat;
    }

    @Column(name = "treatment_duration")
    public String getDrugTreatmentDuration() {
        return drugTreatmentDuration;
    }

    public void setDrugTreatmentDuration(String drugTreatmentDuration) {
        this.drugTreatmentDuration = drugTreatmentDuration;
    }

    @Column(name = "treatment_duration_unit")
    public String getDrugTreatmentDurationUnit() {
        return drugTreatmentDurationUnit;
    }

    public void setDrugTreatmentDurationUnit(String drugTreatmentDurationUnit) {
        this.drugTreatmentDurationUnit = drugTreatmentDurationUnit;
    }

    @Column(name = "medicinal_product")
    public String getMedicinalProduct() {
        return medicinalProduct;
    }

    public void setMedicinalProduct(String medicinalProduct) {
        this.medicinalProduct = medicinalProduct;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public OpenFDA getOpenfda() {
        return openFDA;
    }

    public void setOpenfda(OpenFDA openfda) {
        this.openFDA = openfda;
    }

}
