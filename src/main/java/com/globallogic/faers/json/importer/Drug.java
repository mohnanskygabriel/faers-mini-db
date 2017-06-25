package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "drug")
public class Drug implements Serializable {

    static final long serialVersionUID = 1L;
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
    private String drugCumulativeDosageNumb;

    @SerializedName("drugcumulativedosageunit")
    @Column(name = "cumulative_dosage_unit", columnDefinition = "smallint")
    private Integer drugCumulativeDosageUnit;

    @SerializedName("drugdosageform")
    @Column(name = "dosage_form", columnDefinition = "text")
    private String drugDosageForm;

    @SerializedName("drugintervaldosagedefinition")
    @Column(name = "interval_dosage_definition", columnDefinition = "smallint")
    private Integer drugIntervalDosageDefinition;

    @SerializedName("drugintervaldosageunitnumb")
    @Column(name = "interval_dosage_unit_numb")
    private String drugIntervalDosageUnitNumb;

    @SerializedName("drugrecurreadministration")
    @Column(name = "recurre_administration", columnDefinition = "smallint")
    private Integer drugRecurreAdministration;

    @SerializedName("drugseparatedosagenumb")
    @Column(name = "separate_dosage_numb")
    private String drugSeparateDosageNumb;

    @SerializedName("drugstructuredosagenumb")
    @Column(name = "structure_dosage_numb", columnDefinition = "text")
    private String drugStructureDosageNumb;

    @SerializedName("drugstructuredosageunit")
    @Column(name = "structure_dosage_unit", columnDefinition = "smallint")
    private Integer drugStructureDosageUnit;

    @SerializedName("drugadministrationroute")
    @Column(name = "administration_route", columnDefinition = "smallint")
    private Integer drugAdministrationRoute;

    @SerializedName("drugauthorizationnumb")
    @Column(name = "authorization_numb", columnDefinition = "text")
    private String drugAuthorizationNumb;

    @SerializedName("drugbatchnumb")
    @Column(name = "batch_numb", columnDefinition = "text")
    private String drugBatchNumb;

    @SerializedName("drugcharacterization")
    @Column(name = "characterization", columnDefinition = "smallint")
    private Integer drugCharacterization;

    @SerializedName("drugdoseagetext")
    @Column(name = "doseage_text", columnDefinition = "text")
    private String drugDoseageText;

    @SerializedName("drugenddate")
    @Column(name = "end_date", columnDefinition = "text")
    private String drugEndDate;

    @SerializedName("drugenddateformat")
    @Column(name = "end_date_format", columnDefinition = "smallint")
    private Integer drugEndDateFormat;

    @SerializedName("drugindication")
    @Column(name = "indication", columnDefinition = "text")
    private String drugIndication;

    @SerializedName("drugstartdate")
    @Column(name = "start_date", columnDefinition = "text")
    private String drugStartDate;

    @SerializedName("drugstartdateformat")
    @Column(name = "start_date_format", columnDefinition = "smallint")
    private Integer drugStartDateFormat;

    @SerializedName("drugtreatmentduration")
    @Column(name = "treatment_duration", columnDefinition = "text")
    private String drugTreatmentDuration;

    @SerializedName("drugtreatmentdurationunit")
    @Column(name = "treatment_duration_unit", columnDefinition = "smallint")
    private Integer drugTreatmentDurationUnit;

    @SerializedName("medicinalproduct")
    @Column(name = "medicinal_product", columnDefinition = "text")
    private String medicinalProduct;

    @SerializedName("openfda")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_drug_openfda_drug_info_id_openfda_drug_info_id"))
    private OpenFDA openFDA_Drug_Info;
    
    @SerializedName("activesubstance")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_drug_active_substance_id_active_substance_id"))
    private ActiveSubstance active_Substance;

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

    public String getDrugCumulativeDosageNumb() {
        return drugCumulativeDosageNumb;
    }

    public void setDrugCumulativeDosageNumb(String drugCumulativeDosageNumb) {
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

    public String getDrugIntervalDosageUnitNumb() {
        return drugIntervalDosageUnitNumb;
    }

    public void setDrugIntervalDosageUnitNumb(String drugIntervalDosageUnitNumb) {
        this.drugIntervalDosageUnitNumb = drugIntervalDosageUnitNumb;
    }

    public Integer getDrugRecurreAdministration() {
        return drugRecurreAdministration;
    }

    public void setDrugRecurreAdministration(Integer drugRecurreAdministration) {
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

    public String getDrugEndDate() {
        return drugEndDate;
    }

    public void setDrugEndDate(String drugEndDate) {
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

    public String getDrugStartDate() {
        return drugStartDate;
    }

    public void setDrugStartDate(String drugStartDate) {
        this.drugStartDate = drugStartDate;
    }

    public Integer getDrugStartDateFormat() {
        return drugStartDateFormat;
    }

    public void setDrugStartDateFormat(Integer drugStartDateFormat) {
        this.drugStartDateFormat = drugStartDateFormat;
    }

    public String getDrugTreatmentDuration() {
        return drugTreatmentDuration;
    }

    public void setDrugTreatmentDuration(String drugTreatmentDuration) {
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

    public ActiveSubstance getActive_Substance() {
        return active_Substance;
    }

    public void setActive_Substance(ActiveSubstance active_Substance) {
        this.active_Substance = active_Substance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.actionDrug);
        hash = 97 * hash + Objects.hashCode(this.drugAdditional);
        hash = 97 * hash + Objects.hashCode(this.drugCumulativeDosageNumb);
        hash = 97 * hash + Objects.hashCode(this.drugCumulativeDosageUnit);
        hash = 97 * hash + Objects.hashCode(this.drugDosageForm);
        hash = 97 * hash + Objects.hashCode(this.drugIntervalDosageDefinition);
        hash = 97 * hash + Objects.hashCode(this.drugIntervalDosageUnitNumb);
        hash = 97 * hash + Objects.hashCode(this.drugRecurreAdministration);
        hash = 97 * hash + Objects.hashCode(this.drugSeparateDosageNumb);
        hash = 97 * hash + Objects.hashCode(this.drugStructureDosageNumb);
        hash = 97 * hash + Objects.hashCode(this.drugStructureDosageUnit);
        hash = 97 * hash + Objects.hashCode(this.drugAdministrationRoute);
        hash = 97 * hash + Objects.hashCode(this.drugAuthorizationNumb);
        hash = 97 * hash + Objects.hashCode(this.drugBatchNumb);
        hash = 97 * hash + Objects.hashCode(this.drugCharacterization);
        hash = 97 * hash + Objects.hashCode(this.drugDoseageText);
        hash = 97 * hash + Objects.hashCode(this.drugEndDate);
        hash = 97 * hash + Objects.hashCode(this.drugEndDateFormat);
        hash = 97 * hash + Objects.hashCode(this.drugIndication);
        hash = 97 * hash + Objects.hashCode(this.drugStartDate);
        hash = 97 * hash + Objects.hashCode(this.drugStartDateFormat);
        hash = 97 * hash + Objects.hashCode(this.drugTreatmentDuration);
        hash = 97 * hash + Objects.hashCode(this.drugTreatmentDurationUnit);
        hash = 97 * hash + Objects.hashCode(this.medicinalProduct);
        hash = 97 * hash + Objects.hashCode(this.openFDA_Drug_Info);
        hash = 97 * hash + Objects.hashCode(this.active_Substance);
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
        if (!Objects.equals(this.drugCumulativeDosageNumb, other.drugCumulativeDosageNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugDosageForm, other.drugDosageForm)) {
            return false;
        }
        if (!Objects.equals(this.drugIntervalDosageUnitNumb, other.drugIntervalDosageUnitNumb)) {
            return false;
        }
        if (!Objects.equals(this.drugSeparateDosageNumb, other.drugSeparateDosageNumb)) {
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
        if (!Objects.equals(this.drugCumulativeDosageUnit, other.drugCumulativeDosageUnit)) {
            return false;
        }
        if (!Objects.equals(this.drugIntervalDosageDefinition, other.drugIntervalDosageDefinition)) {
            return false;
        }
        if (!Objects.equals(this.drugRecurreAdministration, other.drugRecurreAdministration)) {
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
        if (!Objects.equals(this.active_Substance, other.active_Substance)) {
            return false;
        }
        return true;
    }
       



}
