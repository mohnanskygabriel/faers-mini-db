package com.globallogic.faers.event;

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
public class Patient{

    private Long id;
    private String patientonsetage;
    private String patientonsetageunit;
    private String patientsex;
    private String patientweight;
    private Patientdeath patientdeath;
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

    public String getPatientonsetage() {
        return patientonsetage;
    }

    public void setPatientonsetage(String patientonsetage) {
        this.patientonsetage = patientonsetage;
    }

    public String getPatientonsetageunit() {
        return patientonsetageunit;
    }

    public void setPatientonsetageunit(String patientonsetageunit) {
        this.patientonsetageunit = patientonsetageunit;
    }

    public String getPatientsex() {
        return patientsex;
    }

    public void setPatientsex(String patientsex) {
        this.patientsex = patientsex;
    }

    public String getPatientweight() {
        return patientweight;
    }

    public void setPatientweight(String patientweight) {
        this.patientweight = patientweight;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Patientdeath getPatientdeath() {
        return patientdeath;
    }

    public void setPatientdeath(Patientdeath patientdeath) {
        this.patientdeath = patientdeath;
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
