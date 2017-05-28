package com.globallogic.faers.zip.downloader;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

public class Event {

    @SerializedName("total_records")
    private String totalRecords;
    @SerializedName("export_date")
    private String exportDate;
    private List<Partition> partitions;

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }

    public List<Partition> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.totalRecords);
        hash = 79 * hash + Objects.hashCode(this.exportDate);
        hash = 79 * hash + Objects.hashCode(this.partitions);
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
        final Event other = (Event) obj;
        if (!Objects.equals(this.totalRecords, other.totalRecords)) {
            return false;
        }
        if (!Objects.equals(this.exportDate, other.exportDate)) {
            return false;
        }
        if (!Objects.equals(this.partitions, other.partitions)) {
            return false;
        }
        return true;
    }

}
