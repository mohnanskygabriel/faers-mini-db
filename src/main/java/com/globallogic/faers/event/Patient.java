
package com.globallogic.faers.event;

import java.util.List;

public class Patient {

    private String patientonsetage;
    private String patientonsetageunit;
    private String patientsex;
    private String patientweight;
    private Patientdeath patientdeath;
    private List<Drug> drug = null;
    private List<Reaction> reaction = null;

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

    public Patientdeath getPatientdeath() {
        return patientdeath;
    }

    public void setPatientdeath(Patientdeath patientdeath) {
        this.patientdeath = patientdeath;
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

}
