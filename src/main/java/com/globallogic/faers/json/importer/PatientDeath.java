package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
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
    @Column(name = "death_date")
    private String patientDeathDate;

    @SerializedName("patientdeathdateformat")
    @Column(name = "date_format", columnDefinition = "smallint")
    private Integer patientDeathDateFormat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientDeathDate() {
        return patientDeathDate;
    }

    public void setPatientDeathDate(String patientDeathDate) {
        this.patientDeathDate = patientDeathDate;
    }

    public Integer getPatientDeathDateFormat() {
        return patientDeathDateFormat;
    }

    public void setPatientDeathDateFormat(Integer patientDeathDateFormat) {
        this.patientDeathDateFormat = patientDeathDateFormat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.patientDeathDate);
        hash = 67 * hash + Objects.hashCode(this.patientDeathDateFormat);
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
        final PatientDeath other = (PatientDeath) obj;
        if (!Objects.equals(this.patientDeathDate, other.patientDeathDate)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.patientDeathDateFormat, other.patientDeathDateFormat)) {
            return false;
        }
        return true;
    }

}
