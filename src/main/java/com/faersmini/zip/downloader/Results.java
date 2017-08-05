package com.faersmini.zip.downloader;

import java.util.Objects;

public class Results {

    private Drug drug;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.drug);
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
        final Results other = (Results) obj;
        if (!Objects.equals(this.drug, other.drug)) {
            return false;
        }
        return true;
    }

}
