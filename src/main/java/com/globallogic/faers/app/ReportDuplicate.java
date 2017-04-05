package com.globallogic.faers.app;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT_DUPLICATE")
public class ReportDuplicate {

    private Long id;
    
    @SerializedName("duplicatesource")
    private String duplicateSource;
    
    @SerializedName("duplicatenumb")
    private String duplicateNumb;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "duplicate_source")
    public String getDuplicateSource() {
        return duplicateSource;
    }

    public void setDuplicateSource(String duplicateSource) {
        this.duplicateSource = duplicateSource;
    }

    @Column(name = "duplicate_numb")
    public String getDuplicateNumb() {
        return duplicateNumb;
    }

    public void setDuplicateNumb(String duplicateNumb) {
        this.duplicateNumb = duplicateNumb;
    }

}
