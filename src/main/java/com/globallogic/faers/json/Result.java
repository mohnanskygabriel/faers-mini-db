package com.globallogic.faers.json;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT_RESULT")
public class Result implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "safety_report")
    @SerializedName("safetyreport")
    private String safetyReport;

    @SerializedName("safetyreportversion")
    @Column(name = "safety_report_version")
    private String safetyReportversion;

    @SerializedName("receivedate")
    @Column(name = "receive_date")
    private String receiveDate;

    @SerializedName("seriousnesscongenitalanomali")
    @Column(name = "seriousness_congenital_anomali")
    private String seriousnessCongenitalAnomali;

    @SerializedName("seriousnessdeath")
    @Column(name = "seriousness_death")
    private String seriousnessDeath;

    @SerializedName("seriousnessdisabling")
    @Column(name = "seriousness_disabling")
    private String seriousnessDisabling;

    @SerializedName("seriousnesshospitalization")
    @Column(name = "seriousness_hospitalization")
    private String seriousnessHospitalization;

    @SerializedName("seriousnesslifethreatening")
    @Column(name = "seriousness_life_threatening")
    private String seriousnessLifeThreatening;

    @SerializedName("seriousnessother")
    @Column(name = "seriousness_other")
    private String seriousnessOther;

    @SerializedName("receiptdate")
    @Column(name = "receipt_date")
    private String receiptDate;

    @SerializedName("transmissiondate")
    @Column(name = "transmission_date")
    private String transmissionDate;

    @SerializedName("transmissiondateformat")
    @Column(name = "transmission_date_format")
    private String transmissionDateFormat;

    @SerializedName("receiptdateformat")
    @Column(name = "receipt_date_format")
    private String receiptDateFormat;

    private String serious;

    @SerializedName("receivedateformat")
    @Column(name = "receive_date_format")
    private String receiveDateFormat;

    @SerializedName("fulfillexpeditecriteria")
    @Column(name = "fulfill_expedite_criteria")
    private String fulfillExpediteCriteria;

    @SerializedName("safetyreportid")
    @Column(name = "safety_report_id", columnDefinition = "varchar(9)")
    private String safetyReportID;

    @Column(columnDefinition = "smallint")
    private Integer duplicate;

    @SerializedName("occurcountry")
    @Column(name = "occur_country")
    private String occurCountry;

    @SerializedName("primarysourcecountry")
    @Column(name = "primary_source_country")
    private String primarySourceCountry;

    @SerializedName("companynumb")
    @Column(name = "company_numb")
    private String companyNumb;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Patient patient;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Sender sender;

    @SerializedName("primarysource")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PrimarySource primarySource;

    @SerializedName("reportduplicate")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ReportDuplicate reportDuplicate;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Receiver receiver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSafetyReport() {
        return safetyReport;
    }

    public void setSafetyReport(String safetyReport) {
        this.safetyReport = safetyReport;
    }

    public String getSafetyReportversion() {
        return safetyReportversion;
    }

    public void setSafetyReportversion(String safetyReportversion) {
        this.safetyReportversion = safetyReportversion;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSeriousnessCongenitalAnomali() {
        return seriousnessCongenitalAnomali;
    }

    public void setSeriousnessCongenitalAnomali(String seriousnessCongenitalAnomali) {
        this.seriousnessCongenitalAnomali = seriousnessCongenitalAnomali;
    }

    public String getSeriousnessDeath() {
        return seriousnessDeath;
    }

    public void setSeriousnessDeath(String seriousnessDeath) {
        this.seriousnessDeath = seriousnessDeath;
    }

    public String getSeriousnessDisabling() {
        return seriousnessDisabling;
    }

    public void setSeriousnessDisabling(String seriousnessDisabling) {
        this.seriousnessDisabling = seriousnessDisabling;
    }

    public String getSeriousnessHospitalization() {
        return seriousnessHospitalization;
    }

    public void setSeriousnessHospitalization(String seriousnessHospitalization) {
        this.seriousnessHospitalization = seriousnessHospitalization;
    }

    public String getSeriousnessLifeThreatening() {
        return seriousnessLifeThreatening;
    }

    public void setSeriousnessLifeThreatening(String seriousnessLifeThreatening) {
        this.seriousnessLifeThreatening = seriousnessLifeThreatening;
    }

    public String getSeriousnessOther() {
        return seriousnessOther;
    }

    public void setSeriousnessOther(String seriousnessOther) {
        this.seriousnessOther = seriousnessOther;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getTransmissionDate() {
        return transmissionDate;
    }

    public void setTransmissionDate(String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    public String getTransmissionDateFormat() {
        return transmissionDateFormat;
    }

    public void setTransmissionDateFormat(String transmissionDateFormat) {
        this.transmissionDateFormat = transmissionDateFormat;
    }

    public String getReceiptDateFormat() {
        return receiptDateFormat;
    }

    public void setReceiptDateFormat(String receiptDateFormat) {
        this.receiptDateFormat = receiptDateFormat;
    }

    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    public String getReceiveDateFormat() {
        return receiveDateFormat;
    }

    public void setReceiveDateFormat(String receiveDateFormat) {
        this.receiveDateFormat = receiveDateFormat;
    }

    public String getFulfillExpediteCriteria() {
        return fulfillExpediteCriteria;
    }

    public void setFulfillExpediteCriteria(String fulfillExpediteCriteria) {
        this.fulfillExpediteCriteria = fulfillExpediteCriteria;
    }

    public String getSafetyReportID() {
        return safetyReportID;
    }

    public void setSafetyReportID(String safetyReportID) {
        this.safetyReportID = safetyReportID;
    }

    public Integer getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Integer duplicate) {
        this.duplicate = duplicate;
    }

    public String getOccurCountry() {
        return occurCountry;
    }

    public void setOccurCountry(String occurCountry) {
        this.occurCountry = occurCountry;
    }

    public String getPrimarySourceCountry() {
        return primarySourceCountry;
    }

    public void setPrimarySourceCountry(String primarySourceCountry) {
        this.primarySourceCountry = primarySourceCountry;
    }

    public String getCompanyNumb() {
        return companyNumb;
    }

    public void setCompanyNumb(String companyNumb) {
        this.companyNumb = companyNumb;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public PrimarySource getPrimarySource() {
        return primarySource;
    }

    public void setPrimarySource(PrimarySource primarySource) {
        this.primarySource = primarySource;
    }

    public ReportDuplicate getReportDuplicate() {
        return reportDuplicate;
    }

    public void setReportDuplicate(ReportDuplicate reportDuplicate) {
        this.reportDuplicate = reportDuplicate;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

}
