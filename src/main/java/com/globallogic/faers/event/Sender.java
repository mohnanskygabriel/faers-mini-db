package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SENDER")
public class Sender {

    private Long id;

    @SerializedName("sendertype")
    private String senderType;

    @SerializedName("senderorganization")
    private String senderOrganization;

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
    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    @Column(name = "organization")
    public String getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(String senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

}
