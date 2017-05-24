package com.globallogic.faers.jsondownloader;

import com.google.gson.annotations.SerializedName;
import java.net.URL;

public class Partition {

    @SerializedName("size_mb")
    private Double sizeMB;

    @SerializedName("records")
    private Integer recordsNumber;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("file")
    private String fileURL;

    public Double getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(Double sizeMB) {
        this.sizeMB = sizeMB;
    }

    public Integer getRecordsNumber() {
        return recordsNumber;
    }

    public void setRecordsNumber(Integer recordsNumber) {
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

}
