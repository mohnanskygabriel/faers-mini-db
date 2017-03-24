package com.globallogic.faers.event;

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
    private String reactionmeddrapt;
    private String reactionmeddraversionpt;
    private String reactionoutcome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReactionmeddrapt() {
        return reactionmeddrapt;
    }

    public void setReactionmeddrapt(String reactionmeddrapt) {
        this.reactionmeddrapt = reactionmeddrapt;
    }

    public String getReactionmeddraversionpt() {
        return reactionmeddraversionpt;
    }

    public void setReactionmeddraversionpt(String reactionmeddraversionpt) {
        this.reactionmeddraversionpt = reactionmeddraversionpt;
    }

    public String getReactionoutcome() {
        return reactionoutcome;
    }

    public void setReactionoutcome(String reactionoutcome) {
        this.reactionoutcome = reactionoutcome;
    }

}
