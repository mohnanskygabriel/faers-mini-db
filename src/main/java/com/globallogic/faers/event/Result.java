package com.globallogic.faers.event;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESULT")
public class Result {

    private Long id;
    private String safetyreport;
    private String safetyreportversion;
    private String receivedate;
    private String seriousnesscongenitalanomali;
    private String seriousnessdeath;
    private String seriousnessdisabling;
    private String seriousnesshospitalization;
    private String seriousnesslifethreatening;
    private String seriousnessother;
    private String receiptdate;
    private String transmissiondate;
    private String transmissiondateformat;
    private String receiptdateformat;
    private String serious;
    private String receivedateformat;
    private String fulfillexpeditecriteria;
    private String safetyreportid;
    private String duplicate;
    private String occurcountry;
    private String primarysourcecountry;
    private String companynumb;
    private Patient patient;
    private Sender sender;
    private Primarysource primarysource;
    private Reportduplicate reportduplicate;
    private Receiver receiver;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSafetyreport() {
        return safetyreport;
    }

    public void setSafetyreport(String safetyreport) {
        this.safetyreport = safetyreport;
    }

    public String getSafetyreportversion() {
        return safetyreportversion;
    }

    public void setSafetyreportversion(String safetyreportversion) {
        this.safetyreportversion = safetyreportversion;
    }

    public String getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    public String getSeriousnesscongenitalanomali() {
        return seriousnesscongenitalanomali;
    }

    public void setSeriousnesscongenitalanomali(String seriousnesscongenitalanomali) {
        this.seriousnesscongenitalanomali = seriousnesscongenitalanomali;
    }

    public String getSeriousnessdeath() {
        return seriousnessdeath;
    }

    public void setSeriousnessdeath(String seriousnessdeath) {
        this.seriousnessdeath = seriousnessdeath;
    }

    public String getSeriousnessdisabling() {
        return seriousnessdisabling;
    }

    public void setSeriousnessdisabling(String seriousnessdisabling) {
        this.seriousnessdisabling = seriousnessdisabling;
    }

    public String getSeriousnesshospitalization() {
        return seriousnesshospitalization;
    }

    public void setSeriousnesshospitalization(String seriousnesshospitalization) {
        this.seriousnesshospitalization = seriousnesshospitalization;
    }

    public String getSeriousnesslifethreatening() {
        return seriousnesslifethreatening;
    }

    public void setSeriousnesslifethreatening(String seriousnesslifethreatening) {
        this.seriousnesslifethreatening = seriousnesslifethreatening;
    }

    public String getSeriousnessother() {
        return seriousnessother;
    }

    public void setSeriousnessother(String seriousnessother) {
        this.seriousnessother = seriousnessother;
    }

    public String getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(String receiptdate) {
        this.receiptdate = receiptdate;
    }

    public String getTransmissiondate() {
        return transmissiondate;
    }

    public void setTransmissiondate(String transmissiondate) {
        this.transmissiondate = transmissiondate;
    }

    public String getTransmissiondateformat() {
        return transmissiondateformat;
    }

    public void setTransmissiondateformat(String transmissiondateformat) {
        this.transmissiondateformat = transmissiondateformat;
    }

    public String getReceiptdateformat() {
        return receiptdateformat;
    }

    public void setReceiptdateformat(String receiptdateformat) {
        this.receiptdateformat = receiptdateformat;
    }

    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    public String getReceivedateformat() {
        return receivedateformat;
    }

    public void setReceivedateformat(String receivedateformat) {
        this.receivedateformat = receivedateformat;
    }

    public String getFulfillexpeditecriteria() {
        return fulfillexpeditecriteria;
    }

    public void setFulfillexpeditecriteria(String fulfillexpeditecriteria) {
        this.fulfillexpeditecriteria = fulfillexpeditecriteria;
    }

    public String getSafetyreportid() {
        return safetyreportid;
    }

    public void setSafetyreportid(String safetyreportid) {
        this.safetyreportid = safetyreportid;
    }

    public String getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(String duplicate) {
        this.duplicate = duplicate;
    }

    public String getOccurcountry() {
        return occurcountry;
    }

    public void setOccurcountry(String occurcountry) {
        this.occurcountry = occurcountry;
    }

    public String getPrimarysourcecountry() {
        return primarysourcecountry;
    }

    public void setPrimarysourcecountry(String primarysourcecountry) {
        this.primarysourcecountry = primarysourcecountry;
    }

    public String getCompanynumb() {
        return companynumb;
    }

    public void setCompanynumb(String companynumb) {
        this.companynumb = companynumb;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Primarysource getPrimarysource() {
        return primarysource;
    }

    public void setPrimarysource(Primarysource primarysource) {
        this.primarysource = primarysource;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Reportduplicate getReportduplicate() {
        return reportduplicate;
    }

    public void setReportduplicate(Reportduplicate reportduplicate) {
        this.reportduplicate = reportduplicate;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

}
