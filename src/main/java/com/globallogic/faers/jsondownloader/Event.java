package com.globallogic.faers.jsondownloader;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class Event {

    @SerializedName("total_Records")
    private String totalRecords;
    @SerializedName("export_Date")
    private Date exportDate;
    private List<Partition> partitions;

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Date getExportDate() {
        return exportDate;
    }

    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }

    public List<Partition> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

}
