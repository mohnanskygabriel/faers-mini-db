package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT_DEATH")
public class PatientDeath implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("patientdeathdate")
    @Column(name = "death_date", columnDefinition = "date")
    private Date patientDeathDate;

    @SerializedName("patientdeathdateformat")
    @Column(name = "date_format", columnDefinition = "smallint")
    private Integer patientDeathDateFormat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPatientDeathDate() {
        return patientDeathDate;
    }

    public void setPatientDeathDate(Date patientDeathDate) {
        this.patientDeathDate = patientDeathDate;
    }

    public Integer getPatientDeathDateFormat() {
        return patientDeathDateFormat;
    }

    public void setPatientDeathDateFormat(Integer patientDeathDateFormat) {
        this.patientDeathDateFormat = patientDeathDateFormat;
    }

}
