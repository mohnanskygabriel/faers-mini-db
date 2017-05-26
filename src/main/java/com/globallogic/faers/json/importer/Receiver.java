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
@Table(name = "RECEIVER")
public class Receiver implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @SerializedName("receivertype")
    @Column(name = "type", columnDefinition = "smallint")
    private Integer receiverType;

    @SerializedName("receiverorganization")
    @Column(name = "organization")
    private String receiverOrganization;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
    }

    public String getReceiverOrganization() {
        return receiverOrganization;
    }

    public void setReceiverOrganization(String receiverOrganization) {
        this.receiverOrganization = receiverOrganization;
    }

}
