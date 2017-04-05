package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {

    private Long id;
    @SerializedName("patientonsetage")
    private String patientOnsetAge;
    
    @SerializedName("patientonsetageunit")
    private String patientOnsetAgeUnit;
    
    @SerializedName("patientsex")
    private String patientSex;
    
    @SerializedName("patientweight")
    private String patientWeight;
    
    @SerializedName("patientdeath")
    private PatientDeath patientDeath;
    
    private List<Drug> drug = null;
    private List<Reaction> reaction = null;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "onset_age")
    public String getPatientOnsetAge() {
        return patientOnsetAge;
    }

    public void setPatientOnsetAge(String patientOnsetAge) {
        this.patientOnsetAge = patientOnsetAge;
    }

    @Column(name = "onset_age_unit")
    public String getPatientOnsetAgeUnit() {
        return patientOnsetAgeUnit;
    }

    public void setPatientOnsetAgeUnit(String patientOnsetAgeUnit) {
        this.patientOnsetAgeUnit = patientOnsetAgeUnit;
    }

    @Column(name = "sex")
    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    @Column(name = "weight")
    public String getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public PatientDeath getPatientDeath() {
        return patientDeath;
    }

    public void setPatientDeath(PatientDeath patientDeath) {
        this.patientDeath = patientDeath;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PATIENT_DRUG_MAPPING", joinColumns = @JoinColumn(name = "patientId"), inverseJoinColumns = @JoinColumn(name = "drugId"))
    public List<Drug> getDrug() {
        return drug;
    }

    public void setDrug(List<Drug> drug) {
        this.drug = drug;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PATIENT_REACTION_MAPPING", joinColumns = @JoinColumn(name = "patientId"), inverseJoinColumns = @JoinColumn(name = "reactionId"))
    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

}
