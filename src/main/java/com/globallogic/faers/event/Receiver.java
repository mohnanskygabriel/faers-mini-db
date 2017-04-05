package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RECEIVER")
public class Receiver {

    private Long id;

    @SerializedName("receivertype")
    private String receiverType;

    @SerializedName("receiverorganization")
    private String receiverOrganization;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "type")
    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }

    @Column(name = "organization")
    public String getReceiverOrganization() {
        return receiverOrganization;
    }

    public void setReceiverOrganization(String receiverOrganization) {
        this.receiverOrganization = receiverOrganization;
    }

}
