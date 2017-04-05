package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRIMARY_SOURCE")
public class PrimarySource {

    private Long id;
    
    @SerializedName("reportercountry")
    private String reporterCountry;
    
    private String qualification;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "reporter_country")
    public String getReporterCountry() {
        return reporterCountry;
    }

    public void setReporterCountry(String reporterCountry) {
        this.reporterCountry = reporterCountry;
    }

    @Column(name = "qualification")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
