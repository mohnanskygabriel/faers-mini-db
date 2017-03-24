package com.globallogic.faers.event;

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
    private String sendertype;
    private String senderorganization;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSendertype() {
        return sendertype;
    }

    public void setSendertype(String sendertype) {
        this.sendertype = sendertype;
    }

    public String getSenderorganization() {
        return senderorganization;
    }

    public void setSenderorganization(String senderorganization) {
        this.senderorganization = senderorganization;
    }

}
