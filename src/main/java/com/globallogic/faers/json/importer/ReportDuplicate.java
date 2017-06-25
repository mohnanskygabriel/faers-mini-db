package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "report_duplicate")
public class ReportDuplicate implements Serializable {

    static final long serialVersionUID = 1L;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.duplicateSource);
        hash = 29 * hash + Objects.hashCode(this.duplicateNumb);
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
        final ReportDuplicate other = (ReportDuplicate) obj;
        if (!Objects.equals(this.duplicateSource, other.duplicateSource)) {
            return false;
        }
        if (!Objects.equals(this.duplicateNumb, other.duplicateNumb)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
