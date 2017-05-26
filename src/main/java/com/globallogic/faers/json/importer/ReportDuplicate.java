package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT_DUPLICATE")
public class ReportDuplicate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("duplicatesource")
    @Column(name = "duplicate_source")
    private String duplicateSource;

    @SerializedName("duplicatenumb")
    @Column(name = "duplicate_numb")
    private String duplicateNumb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuplicateSource() {
        return duplicateSource;
    }

    public void setDuplicateSource(String duplicateSource) {
        this.duplicateSource = duplicateSource;
    }

    public String getDuplicateNumb() {
        return duplicateNumb;
    }

    public void setDuplicateNumb(String duplicateNumb) {
        this.duplicateNumb = duplicateNumb;
    }

}
