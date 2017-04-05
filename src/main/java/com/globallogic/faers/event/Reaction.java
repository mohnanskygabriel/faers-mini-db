package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REACTION")
public class Reaction {

    private Long id;

    @SerializedName("reactionmeddrapt")
    private String reactionMedDRAPT;

    @SerializedName("reactionmeddraversionpt")
    private String reactionMedDRAVersionPT;

    @SerializedName("reactionoutcome")
    private String reactionOutcome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "meddra_pt")
    public String getReactionMedDRAPT() {
        return reactionMedDRAPT;
    }

    public void setReactionMedDRAPT(String reactionMedDRAPT) {
        this.reactionMedDRAPT = reactionMedDRAPT;
    }

    @Column(name = "meddra_version_pt")
    public String getReactionMedDRAVersionPT() {
        return reactionMedDRAVersionPT;
    }

    public void setReactionMedDRAVersionPT(String reactionMedDRAVersionPT) {
        this.reactionMedDRAVersionPT = reactionMedDRAVersionPT;
    }

    @Column(name = "outcome")
    public String getReactionOutcome() {
        return reactionOutcome;
    }

    public void setReactionOutcome(String reactionOutcome) {
        this.reactionOutcome = reactionOutcome;
    }

}
