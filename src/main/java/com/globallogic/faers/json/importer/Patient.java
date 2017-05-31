package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
public class Patient implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("patientonsetage")
    @Column(name = "onset_age")
    private String patientOnsetAge;

    @SerializedName("patientonsetageunit")
    @Column(name = "onset_age_unit", columnDefinition = "smallint")
    private Integer patientOnsetAgeUnit;

    @SerializedName("patientsex")
    @Column(name = "sex", columnDefinition = "smallint")
    private Integer patientSex;

    @SerializedName("patientweight")
    @Column(name = "weight", columnDefinition = "real")
    private Double patientWeight;

    @SerializedName("patientdeath")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PatientDeath patientDeath;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PATIENT_DRUG_MAPPING", joinColumns = @JoinColumn(name = "patient_Id"), inverseJoinColumns = @JoinColumn(name = "drug_Id"))
    private List<Drug> drug = null;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PATIENT_REACTION_MAPPING", joinColumns = @JoinColumn(name = "patient_Id"), inverseJoinColumns = @JoinColumn(name = "reaction_Id"))
    private List<Reaction> reaction = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientOnsetAge() {
        return patientOnsetAge;
    }

    public void setPatientOnsetAge(String patientOnsetAge) {
        this.patientOnsetAge = patientOnsetAge;
    }

    public Integer getPatientOnsetAgeUnit() {
        return patientOnsetAgeUnit;
    }

    public void setPatientOnsetAgeUnit(Integer patientOnsetAgeUnit) {
        this.patientOnsetAgeUnit = patientOnsetAgeUnit;
    }

    public Integer getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(Integer patientSex) {
        this.patientSex = patientSex;
    }

    public Double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(Double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public PatientDeath getPatientDeath() {
        return patientDeath;
    }

    public void setPatientDeath(PatientDeath patientDeath) {
        this.patientDeath = patientDeath;
    }

    public List<Drug> getDrug() {
        return drug;
    }

    public void setDrug(List<Drug> drug) {
        this.drug = drug;
    }

    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.patientOnsetAge);
        hash = 97 * hash + Objects.hashCode(this.patientOnsetAgeUnit);
        hash = 97 * hash + Objects.hashCode(this.patientSex);
        hash = 97 * hash + Objects.hashCode(this.patientWeight);
        hash = 97 * hash + Objects.hashCode(this.patientDeath);
        hash = 97 * hash + Objects.hashCode(this.drug);
        hash = 97 * hash + Objects.hashCode(this.reaction);
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
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.patientOnsetAge, other.patientOnsetAge)) {
            return false;
        }
        if (!Objects.equals(this.patientOnsetAgeUnit, other.patientOnsetAgeUnit)) {
            return false;
        }
        if (!Objects.equals(this.patientSex, other.patientSex)) {
            return false;
        }
        if (!Objects.equals(this.patientWeight, other.patientWeight)) {
            return false;
        }
        if (!Objects.equals(this.patientDeath, other.patientDeath)) {
            return false;
        }
        if (!Objects.equals(this.drug, other.drug)) {
            return false;
        }
        if (!Objects.equals(this.reaction, other.reaction)) {
            return false;
        }
        return true;
    }

}
