package com.globallogic.faers.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RECEIVER")
public class Receiver{

    private Long id;
    private String receivertype;
    private String receiverorganization;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceivertype() {
        return receivertype;
    }

    public void setReceivertype(String receivertype) {
        this.receivertype = receivertype;
    }

    public String getReceiverorganization() {
        return receiverorganization;
    }

    public void setReceiverorganization(String receiverorganization) {
        this.receiverorganization = receiverorganization;
    }

}
