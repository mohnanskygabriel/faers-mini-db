package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
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
public class Drug implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("actiondrug")
    @Column(name = "action_drug", columnDefinition = "smallint")
    private Integer actionDrug;

    @SerializedName("drugadditional")
    @Column(name = "additional", columnDefinition = "smallint")
    private Integer drugAdditional;

    @SerializedName("drugcumulativedosagenumb")
    @Column(name = "cumulative_dosage_numb")
    private Integer drugCumulativeDosageNumb;

    @SerializedName("drugcumulativedosageunit")
    @Column(name = "cumulative_dosage_unit", columnDefinition = "smallint")
    private Integer drugCumulativeDosageUnit;

    @SerializedName("drugdosageform")
    @Column(name = "dosage_form")
    private String drugDosageForm;

    @SerializedName("drugintervaldosagedefinition")
    @Column(name = "interval_dosage_definition", columnDefinition = "smallint")
    private Integer drugIntervalDosageDefinition;

    @SerializedName("drugintervaldosageunitnumb")
    @Column(name = "interval_dosage_unit_numb")
    private Integer drugIntervalDosageUnitNumb;

    @SerializedName("drugrecurreadministration")
    @Column(name = "recurre_administration", columnDefinition = "smallint")
    private Integer drugRecurreAdministration;

    @SerializedName("drugseparatedosagenumb")
    @Column(name = "separate_dosage_numb")
    private Integer drugSeparateDosageNumb;

    @SerializedName("drugstructuredosagenumb")
    @Column(name = "structure_dosage_numb")
    private Integer drugStructureDosageNumb;

    @SerializedName("drugstructuredosageunit")
    @Column(name = "structure_dosage_unit", columnDefinition = "smallint")
    private Integer drugStructureDosageUnit;

    @SerializedName("drugadministrationroute")
    @Column(name = "administration_route", columnDefinition = "smallint")
    private Integer drugAdministrationRoute;

    @SerializedName("drugauthorizationnumb")
    @Column(name = "authorization_numb")
    private String drugAuthorizationNumb;

    @SerializedName("drugbatchnumb")
    @Column(name = "batch_numb")
    private String drugBatchNumb;

    @SerializedName("drugcharacterization")
    @Column(name = "characterization", columnDefinition = "smallint")
    private Integer drugCharacterization;

    @SerializedName("drugdoseagetext")
    @Column(name = "doseage_text")
    private String drugDoseageText;

    @SerializedName("drugenddate")
    @Column(name = "end_date", columnDefinition = "date")
    private Date drugEndDate;

    @SerializedName("drugenddateformat")
    @Column(name = "end_date_format", columnDefinition = "smallint")
    private Integer drugEndDateFormat;

    @SerializedName("drugindication")
    @Column(name = "indication")
    private String drugIndication;

    @SerializedName("drugstartdate")
    @Column(name = "start_date", columnDefinition = "date")
    private Date drugStartDate;

    @SerializedName("drugstartdateformat")
    @Column(name = "start_date_format", columnDefinition = "smallint")
    private Integer drugStartDateFormat;

    @SerializedName("drugtreatmentduration")
    @Column(name = "treatment_duration")
    private Integer drugTreatmentDuration;

    @SerializedName("drugtreatmentdurationunit")
    @Column(name = "treatment_duration_unit", columnDefinition = "smallint")
    private Integer drugTreatmentDurationUnit;

    @SerializedName("medicinalproduct")
    @Column(name = "medicinal_product")
    private String medicinalProduct;

    @SerializedName("openfda")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private OpenFDA openFDA_Drug_Info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getActionDrug() {
        return actionDrug;
    }

    public void setActionDrug(Integer actionDrug) {
        this.actionDrug = actionDrug;
    }

    public Integer getDrugAdditional() {
        return drugAdditional;
    }

    public void setDrugAdditional(Integer drugAdditional) {
        this.drugAdditional = drugAdditional;
    }

    public Integer getDrugCumulativeDosageNumb() {
        return drugCumulativeDosageNumb;
    }

    public void setDrugCumulativeDosageNumb(Integer drugCumulativeDosageNumb) {
        this.drugCumulativeDosageNumb = drugCumulativeDosageNumb;
    }

    public Integer getDrugCumulativeDosageUnit() {
        return drugCumulativeDosageUnit;
    }

    public void setDrugCumulativeDosageUnit(Integer drugCumulativeDosageUnit) {
        this.drugCumulativeDosageUnit = drugCumulativeDosageUnit;
    }

    public String getDrugDosageForm() {
        return drugDosageForm;
    }

    public void setDrugDosageForm(String drugDosageForm) {
        this.drugDosageForm = drugDosageForm;
    }

    public Integer getDrugIntervalDosageDefinition() {
        return drugIntervalDosageDefinition;
    }

    public void setDrugIntervalDosageDefinition(Integer drugIntervalDosageDefinition) {
        this.drugIntervalDosageDefinition = drugIntervalDosageDefinition;
    }

    public Integer getDrugIntervalDosageUnitNumb() {
        return drugIntervalDosageUnitNumb;
    }

    public void setDrugIntervalDosageUnitNumb(Integer drugIntervalDosageUnitNumb) {
        this.drugIntervalDosageUnitNumb = drugIntervalDosageUnitNumb;
    }

    public Integer getDrugRecurreAdministration() {
        return drugRecurreAdministration;
    }

    public void setDrugRecurreAdministration(Integer drugRecurreAdministration) {
        this.drugRecurreAdministration = drugRecurreAdministration;
    }

    public Integer getDrugSeparateDosageNumb() {
        return drugSeparateDosageNumb;
    }

    public void setDrugSeparateDosageNumb(Integer drugSeparateDosageNumb) {
        this.drugSeparateDosageNumb = drugSeparateDosageNumb;
    }

    public Integer getDrugStructureDosageNumb() {
        return drugStructureDosageNumb;
    }

    public void setDrugStructureDosageNumb(Integer drugStructureDosageNumb) {
        this.drugStructureDosageNumb = drugStructureDosageNumb;
    }

    public Integer getDrugStructureDosageUnit() {
        return drugStructureDosageUnit;
    }

    public void setDrugStructureDosageUnit(Integer drugStructureDosageUnit) {
        this.drugStructureDosageUnit = drugStructureDosageUnit;
    }

    public Integer getDrugAdministrationRoute() {
        return drugAdministrationRoute;
    }

    public void setDrugAdministrationRoute(Integer drugAdministrationRoute) {
        this.drugAdministrationRoute = drugAdministrationRoute;
    }

    public String getDrugAuthorizationNumb() {
        return drugAuthorizationNumb;
    }

    public void setDrugAuthorizationNumb(String drugAuthorizationNumb) {
        this.drugAuthorizationNumb = drugAuthorizationNumb;
    }

    public String getDrugBatchNumb() {
        return drugBatchNumb;
    }

    public void setDrugBatchNumb(String drugBatchNumb) {
        this.drugBatchNumb = drugBatchNumb;
    }

    public Integer getDrugCharacterization() {
        return drugCharacterization;
    }

    public void setDrugCharacterization(Integer drugCharacterization) {
        this.drugCharacterization = drugCharacterization;
    }

    public String getDrugDoseageText() {
        return drugDoseageText;
    }

    public void setDrugDoseageText(String drugDoseageText) {
        this.drugDoseageText = drugDoseageText;
    }

    public Date getDrugEndDate() {
        return drugEndDate;
    }

    public void setDrugEndDate(Date drugEndDate) {
        this.drugEndDate = drugEndDate;
    }

    public Integer getDrugEndDateFormat() {
        return drugEndDateFormat;
    }

    public void setDrugEndDateFormat(Integer drugEndDateFormat) {
        this.drugEndDateFormat = drugEndDateFormat;
    }

    public String getDrugIndication() {
        return drugIndication;
    }

    public void setDrugIndication(String drugIndication) {
        this.drugIndication = drugIndication;
    }

    public Date getDrugStartDate() {
        return drugStartDate;
    }

    public void setDrugStartDate(Date drugStartDate) {
        this.drugStartDate = drugStartDate;
    }

    public Integer getDrugStartDateFormat() {
        return drugStartDateFormat;
    }

    public void setDrugStartDateFormat(Integer drugStartDateFormat) {
        this.drugStartDateFormat = drugStartDateFormat;
    }

    public Integer getDrugTreatmentDuration() {
        return drugTreatmentDuration;
    }

    public void setDrugTreatmentDuration(Integer drugTreatmentDuration) {
        this.drugTreatmentDuration = drugTreatmentDuration;
    }

    public Integer getDrugTreatmentDurationUnit() {
        return drugTreatmentDurationUnit;
    }

    public void setDrugTreatmentDurationUnit(Integer drugTreatmentDurationUnit) {
        this.drugTreatmentDurationUnit = drugTreatmentDurationUnit;
    }

    public String getMedicinalProduct() {
        return medicinalProduct;
    }

    public void setMedicinalProduct(String medicinalProduct) {
        this.medicinalProduct = medicinalProduct;
    }

    public OpenFDA getOpenfda() {
        return openFDA_Drug_Info;
    }

    public void setOpenfda(OpenFDA openfda) {
        this.openFDA_Drug_Info = openfda;
    }

}
