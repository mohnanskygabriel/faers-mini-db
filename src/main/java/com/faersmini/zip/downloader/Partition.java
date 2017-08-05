package com.faersmini.zip.downloader;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class Partition {

    @SerializedName("size_mb")
    private String sizeMB;

    @SerializedName("records")
    private String recordsNumber;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("file")
    private String fileURL;

    public String getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(String sizeMB) {
        this.sizeMB = sizeMB;
    }

    public String getRecordsNumber() {
        return recordsNumber;
    }

    public void setRecordsNumber(String recordsNumber) {
        this.recordsNumber = recordsNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.sizeMB);
        hash = 89 * hash + Objects.hashCode(this.recordsNumber);
        hash = 89 * hash + Objects.hashCode(this.displayName);
        hash = 89 * hash + Objects.hashCode(this.fileURL);
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
        final Partition other = (Partition) obj;
        if (!Objects.equals(this.sizeMB, other.sizeMB)) {
            return false;
        }
        if (!Objects.equals(this.recordsNumber, other.recordsNumber)) {
            return false;
        }
        if (!Objects.equals(this.displayName, other.displayName)) {
            return false;
        }
        if (!Objects.equals(this.fileURL, other.fileURL)) {
            return false;
        }
        return true;
    }

}
