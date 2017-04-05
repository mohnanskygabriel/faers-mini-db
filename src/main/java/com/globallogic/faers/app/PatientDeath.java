package com.globallogic.faers.app;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT_DEATH")
public class PatientDeath {

    private Long id;
    
    @SerializedName("patientdeathdate")
    private String patientDeathDate;
    
    @SerializedName("patientdeathdateformat")
    private String patientDeathDateFormat;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "death_date")
    public String getPatientDeathDate() {
        return patientDeathDate;
    }

    public void setPatientDeathDate(String patientDeathDate) {
        this.patientDeathDate = patientDeathDate;
    }

    @Column(name = "date_format")
    public String getPatientDeathDateFormat() {
        return patientDeathDateFormat;
    }

    public void setPatientDeathDateFormat(String patientDeathDateFormat) {
        this.patientDeathDateFormat = patientDeathDateFormat;
    }

}
