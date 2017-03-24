package com.globallogic.faers.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENTDEATH")
public class Patientdeath {

    private Long id;
    private String patientdeathdate;
    private String patientdeathdateformat;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientdeathdate() {
        return patientdeathdate;
    }

    public void setPatientdeathdate(String patientdeathdate) {
        this.patientdeathdate = patientdeathdate;
    }

    public String getPatientdeathdateformat() {
        return patientdeathdateformat;
    }

    public void setPatientdeathdateformat(String patientdeathdateformat) {
        this.patientdeathdateformat = patientdeathdateformat;
    }

}
