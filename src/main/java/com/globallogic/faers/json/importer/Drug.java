package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
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
    private String actionDrug;

    @SerializedName("drugadditional")
    @Column(name = "additional", columnDefinition = "smallint")
    private String drugAdditional;

    @SerializedName("drugcumulativedosagenumb")
    @Column(name = "cumulative_dosage_numb")
    private String drugCumulativeDosageNumb;

    @SerializedName("drugcumulativedosageunit")
    @Column(name = "cumulative_dosage_unit", columnDefinition = "smallint")
    private String drugCumulativeDosageUnit;

    @SerializedName("drugdosageform")
    @Column(name = "dosage_form", columnDefinition = "text")
    private String drugDosageForm;

    @SerializedName("drugintervaldosagedefinition")
    @Column(name = "interval_dosage_definition", columnDefinition = "smallint")
    private String drugIntervalDosageDefinition;

    @SerializedName("drugintervaldosageunitnumb")
    @Column(name = "interval_dosage_unit_numb")
    private String drugIntervalDosageUnitNumb;

    @SerializedName("drugrecurreadministration")
    @Column(name = "recurre_administration", columnDefinition = "smallint")
    private String drugRecurreAdministration;

    @SerializedName("drugseparatedosagenumb")
    @Column(name = "separate_dosage_numb")
    private String drugSeparateDosageNumb;

    @SerializedName("drugstructuredosagenumb")
    @Column(name = "structure_dosage_numb", columnDefinition = "text")
    private String drugStructureDosageNumb;

    @SerializedName("drugstructuredosageunit")
    @Column(name = "structure_dosage_unit", columnDefinition = "smallint")
    private String drugStructureDosageUnit;

    @SerializedName("drugadministrationroute")
    @Column(name = "administration_route", columnDefinition = "smallint")
    private String drugAdministrationRoute;

    @SerializedName("drugauthorizationnumb")
    @Column(name = "authorization_numb", columnDefinition = "text")
    private String drugAuthorizationNumb;

    @SerializedName("drugbatchnumb")
    @Column(name = "batch_numb", columnDefinition = "text")
    private String drugBatchNumb;

    @SerializedName("drugcharacterization")
    @Column(name = "characterization", columnDefinition = "smallint")
    private String drugCharacterization;

    @SerializedName("drugdoseagetext")
    @Column(name = "doseage_text", columnDefinition = "text")
    private String drugDoseageText;

    @SerializedName("drugenddate")
    @Column(name = "end_date", columnDefinition = "text")
    private String drugEndDate;

    @SerializedName("drugenddateformat")
    @Column(name = "end_date_format", columnDefinition = "smallint")
    private String drugEndDateFormat;

    @SerializedName("drugindication")
    @Column(name = "indication", columnDefinition = "text")
    private String drugIndication;

    @SerializedName("drugstartdate")
    @Column(name = "start_date", columnDefinition = "text")
    private String drugStartDate;

    @SerializedName("drugstartdateformat")
    @Column(name = "start_date_format", columnDefinition = "smallint")
    private String drugStartDateFormat;

    @SerializedName("drugtreatmentduration")
    @Column(name = "treatment_duration", columnDefinition = "text")
    private String drugTreatmentDuration;

    @SerializedName("drugtreatmentdurationunit")
    @Column(name = "treatment_duration_unit", columnDefinition = "smallint")
    private String drugTreatmentDurationUnit;

    @SerializedName("medicinalproduct")
    @Column(name = "medicinal_product", columnDefinition = "text")
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

    public String getActionDrug() {
        return actionDrug;
    }

    public void setActionDrug(String actionDrug) {
        this.actionDrug = actionDrug;
    }

    public String getDrugAdditional() {
        return drugAdditional;
    }

    public void setDrugAdditional(String drugAdditional) {
        this.drugAdditional = drugAdditional;
    }

    public String getDrugCumulativeDosageNumb() {
        return drugCumulativeDosageNumb;
    }

    public void setDrugCumulativeDosageNumb(String drugCumulativeDosageNumb) {
        this.drugCumulativeDosageNumb = drugCumulativeDosageNumb;
    }

    public String getDrugCumulativeDosageUnit() {
        return drugCumulativeDosageUnit;
    }

    public void setDrugCumulativeDosageUnit(String drugCumulativeDosageUnit) {
        this.drugCumulativeDosageUnit = drugCumulativeDosageUnit;
    }

    public String getDrugDosageForm() {
        return drugDosageForm;
    }

    public void setDrugDosageForm(String drugDosageForm) {
        this.drugDosageForm = drugDosageForm;
    }

    public String getDrugIntervalDosageDefinition() {
        return drugIntervalDosageDefinition;
    }

    public void setDrugIntervalDosageDefinition(String drugIntervalDosageDefinition) {
        this.drugIntervalDosageDefinition = drugIntervalDosageDefinition;
    }

    public String getDrugIntervalDosageUnitNumb() {
        return drugIntervalDosageUnitNumb;
    }

    public void setDrugIntervalDosageUnitNumb(String drugIntervalDosageUnitNumb) {
        this.drugIntervalDosageUnitNumb = drugIntervalDosageUnitNumb;
    }

    public String getDrugRecurreAdministration() {
        return drugRecurreAdministration;
    }

    public void setDrugRecurreAdministration(String drugRecurreAdministration) {
        this.drugRecurreAdministration = drugRecurreAdministration;
    }

    public String getDrugSeparateDosageNumb() {
        return drugSeparateDosageNumb;
    }

    public void setDrugSeparateDosageNumb(String drugSeparateDosageNumb) {
        this.drugSeparateDosageNumb = drugSeparateDosageNumb;
    }

    public String getDrugStructureDosageNumb() {
        return drugStructureDosageNumb;
    }

    public void setDrugStructureDosageNumb(String drugStructureDosageNumb) {
        this.drugStructureDosageNumb = drugStructureDosageNumb;
    }

    public String getDrugStructureDosageUnit() {
        return drugStructureDosageUnit;
    }

    public void setDrugStructureDosageUnit(String drugStructureDosageUnit) {
        this.drugStructureDosageUnit = drugStructureDosageUnit;
    }

    public String getDrugAdministrationRoute() {
        return drugAdministrationRoute;
    }

    public void setDrugAdministrationRoute(String drugAdministrationRoute) {
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

    public String getDrugCharacterization() {
        return drugCharacterization;
    }

    public void setDrugCharacterization(String drugCharacterization) {
        this.drugCharacterization = drugCharacterization;
    }

    public String getDrugDoseageText() {
        return drugDoseageText;
    }

    public void setDrugDoseageText(String drugDoseageText) {
        this.drugDoseageText = drugDoseageText;
    }

    public String getDrugEndDate() {
        return drugEndDate;
    }

    public void setDrugEndDate(String drugEndDate) {
        this.drugEndDate = drugEndDate;
    }

    public String getDrugEndDateFormat() {
        return drugEndDateFormat;
    }

    public void setDrugEndDateFormat(String drugEndDateFormat) {
        this.drugEndDateFormat = drugEndDateFormat;
    }

    public String getDrugIndication() {
        return drugIndication;
    }

    public void setDrugIndication(String drugIndication) {
        this.drugIndication = drugIndication;
    }

    public String getDrugStartDate() {
        return drugStartDate;
    }

    public void setDrugStartDate(String drugStartDate) {
        this.drugStartDate = drugStartDate;
    }

    public String getDrugStartDateFormat() {
        return drugStartDateFormat;
    }

    public void setDrugStartDateFormat(String drugStartDateFormat) {
        this.drugStartDateFormat = drugStartDateFormat;
    }

    public String getDrugTreatmentDuration() {
        return drugTreatmentDuration;
    }

    public void setDrugTreatmentDuration(String drugTreatmentDuration) {
        this.drugTreatmentDuration = drugTreatmentDuration;
    }

    public String getDrugTreatmentDurationUnit() {
        return drugTreatmentDurationUnit;
    }

    public void setDrugTreatmentDurationUnit(String drugTreatmentDurationUnit) {
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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Drug other = (Drug) obj;
        if (!Objects.equals(this.drugDosageForm, other.drugDosageForm)) {
            return false;
        }
        if (!Objects.equals(this.drugStructureDosageNumb, other.drugStructureDosageNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugAuthorizationNumb, other.drugAuthorizationNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugBatchNumb, other.drugBatchNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugDoseageText, other.drugDoseageText)) {
            return false;
        }
        if (!Objects.equals(this.drugEndDate, other.drugEndDate)) {
            return false;
        }
        if (!Objects.equals(this.drugIndication, other.drugIndication)) {
            return false;
        }
        if (!Objects.equals(this.drugStartDate, other.drugStartDate)) {
            return false;
        }
        if (!Objects.equals(this.drugTreatmentDuration, other.drugTreatmentDuration)) {
            return false;
        }
        if (!Objects.equals(this.medicinalProduct, other.medicinalProduct)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.actionDrug, other.actionDrug)) {
            return false;
        }
        if (!Objects.equals(this.drugAdditional, other.drugAdditional)) {
            return false;
        }
        if (!Objects.equals(this.drugCumulativeDosageNumb, other.drugCumulativeDosageNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugCumulativeDosageUnit, other.drugCumulativeDosageUnit)) {
            return false;
        }
        if (!Objects.equals(this.drugIntervalDosageDefinition, other.drugIntervalDosageDefinition)) {
            return false;
        }
        if (!Objects.equals(this.drugIntervalDosageUnitNumb, other.drugIntervalDosageUnitNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugRecurreAdministration, other.drugRecurreAdministration)) {
            return false;
        }
        if (!Objects.equals(this.drugSeparateDosageNumb, other.drugSeparateDosageNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugStructureDosageUnit, other.drugStructureDosageUnit)) {
            return false;
        }
        if (!Objects.equals(this.drugAdministrationRoute, other.drugAdministrationRoute)) {
            return false;
        }
        if (!Objects.equals(this.drugCharacterization, other.drugCharacterization)) {
            return false;
        }
        if (!Objects.equals(this.drugEndDateFormat, other.drugEndDateFormat)) {
            return false;
        }
        if (!Objects.equals(this.drugStartDateFormat, other.drugStartDateFormat)) {
            return false;
        }
        if (!Objects.equals(this.drugTreatmentDurationUnit, other.drugTreatmentDurationUnit)) {
            return false;
        }
        if (!Objects.equals(this.openFDA_Drug_Info, other.openFDA_Drug_Info)) {
            return false;
        }
        return true;
    }

}
