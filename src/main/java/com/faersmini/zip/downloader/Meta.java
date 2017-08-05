package com.faersmini.zip.downloader;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class Meta {

    private String disclaimer;
    private String terms;
    private String license;
    @SerializedName("last_updated")
    private String lastUpdated;

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

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.disclaimer);
        hash = 79 * hash + Objects.hashCode(this.terms);
        hash = 79 * hash + Objects.hashCode(this.license);
        hash = 79 * hash + Objects.hashCode(this.lastUpdated);
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
        final Meta other = (Meta) obj;
        if (!Objects.equals(this.disclaimer, other.disclaimer)) {
            return false;
        }
        if (!Objects.equals(this.terms, other.terms)) {
            return false;
        }
        if (!Objects.equals(this.license, other.license)) {
            return false;
        }
        if (!Objects.equals(this.lastUpdated, other.lastUpdated)) {
            return false;
        }
        return true;
    }

}
