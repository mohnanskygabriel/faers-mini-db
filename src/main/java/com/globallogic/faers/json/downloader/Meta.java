package com.globallogic.faers.json.downloader;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class Meta {

    private String disclaimer;
    private String terms;
    private String license;
    @SerializedName("last_updated")
    private Date lastUpdated;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
