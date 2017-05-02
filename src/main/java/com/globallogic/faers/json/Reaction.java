package com.globallogic.faers.json;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
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
    private Double reactionMedDRAVersionPT;

    @SerializedName("reactionoutcome")
    @Column(name = "outcome", columnDefinition = "smallint")
    private Integer reactionOutcome;

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

    public Double getReactionMedDRAVersionPT() {
        return reactionMedDRAVersionPT;
    }

    public void setReactionMedDRAVersionPT(Double reactionMedDRAVersionPT) {
        this.reactionMedDRAVersionPT = reactionMedDRAVersionPT;
    }

    public Integer getReactionOutcome() {
        return reactionOutcome;
    }

    public void setReactionOutcome(Integer reactionOutcome) {
        this.reactionOutcome = reactionOutcome;
    }

}
