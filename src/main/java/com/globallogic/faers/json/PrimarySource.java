package com.globallogic.faers.json;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRIMARY_SOURCE")
public class PrimarySource implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("reportercountry")
    @Column(name = "reporter_country")
    private String reporterCountry;

    @Column(columnDefinition = "smallint")
    private Integer qualification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReporterCountry() {
        return reporterCountry;
    }

    public void setReporterCountry(String reporterCountry) {
        this.reporterCountry = reporterCountry;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

}
