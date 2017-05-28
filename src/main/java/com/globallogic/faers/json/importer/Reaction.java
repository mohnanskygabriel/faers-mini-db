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
@Table(name = "REACTION")
public class Reaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("reactionmeddrapt")
    @Column(name = "meddra_pt")
    private String reactionMedDRAPT;

    @SerializedName("reactionmeddraversionpt")
    @Column(name = "meddra_version_pt", columnDefinition = "real")
    private String reactionMedDRAVersionPT;

    @SerializedName("reactionoutcome")
    @Column(name = "outcome", columnDefinition = "smallint")
    private String reactionOutcome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReactionMedDRAPT() {
        return reactionMedDRAPT;
    }

    public void setReactionMedDRAPT(String reactionMedDRAPT) {
        this.reactionMedDRAPT = reactionMedDRAPT;
    }

    public String getReactionMedDRAVersionPT() {
        return reactionMedDRAVersionPT;
    }

    public void setReactionMedDRAVersionPT(String reactionMedDRAVersionPT) {
        this.reactionMedDRAVersionPT = reactionMedDRAVersionPT;
    }

    public String getReactionOutcome() {
        return reactionOutcome;
    }

    public void setReactionOutcome(String reactionOutcome) {
        this.reactionOutcome = reactionOutcome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.reactionMedDRAPT);
        hash = 83 * hash + Objects.hashCode(this.reactionMedDRAVersionPT);
        hash = 83 * hash + Objects.hashCode(this.reactionOutcome);
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
        final Reaction other = (Reaction) obj;
        if (!Objects.equals(this.reactionMedDRAPT, other.reactionMedDRAPT)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.reactionMedDRAVersionPT, other.reactionMedDRAVersionPT)) {
            return false;
        }
        if (!Objects.equals(this.reactionOutcome, other.reactionOutcome)) {
            return false;
        }
        return true;
    }

}
