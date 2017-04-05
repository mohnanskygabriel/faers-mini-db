package com.globallogic.faers.event;

import com.google.gson.annotations.SerializedName;
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

    @SerializedName("safetyreport")
    private String safetyReport;

    @SerializedName("safetyreportversion")
    private String safetyReportversion;

    @SerializedName("receivedate")
    private String receiveDate;

    @SerializedName("seriousnesscongenitalanomali")
    private String seriousnessCongenitalAnomali;

    @SerializedName("seriousnessdeath")
    private String seriousnessDeath;

    @SerializedName("seriousnessdisabling")
    private String seriousnessDisabling;

    @SerializedName("seriousnesshospitalization")
    private String seriousnessHospitalization;

    @SerializedName("seriousnesslifethreatening")
    private String seriousnessLifeThreatening;

    @SerializedName("seriousnessother")
    private String seriousnessOther;

    @SerializedName("receiptdate")
    private String receiptDate;

    @SerializedName("transmissiondate")
    private String transmissionDate;

    @SerializedName("transmissiondateformat")
    private String transmissionDateFormat;

    @SerializedName("receiptdateformat")
    private String receiptDateFormat;

    private String serious;

    @SerializedName("receivedateformat")
    private String receiveDateFormat;

    @SerializedName("fulfillexpeditecriteria")
    private String fulfillExpediteCriteria;

    @SerializedName("safetyreportid")
    private String safetyReportID;

    private String duplicate;

    @SerializedName("occurcountry")
    private String occurCountry;

    @SerializedName("primarysourcecountry")
    private String primarySourceCountry;

    @SerializedName("companynumb")
    private String companyNumb;

    private Patient patient;

    private Sender sender;

    @SerializedName("primarysource")
    private PrimarySourceX primarySource;

    @SerializedName("reportduplicate")
    private ReportDuplicateX reportDuplicate;

    private Receiver receiver;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "safety_report")
    public String getSafetyReport() {
        return safetyReport;
    }

    public void setSafetyReport(String safetyReport) {
        this.safetyReport = safetyReport;
    }

    @Column(name = "safety_report_version")
    public String getSafetyReportversion() {
        return safetyReportversion;
    }

    public void setSafetyReportversion(String safetyReportversion) {
        this.safetyReportversion = safetyReportversion;
    }

    @Column(name = "receive_date")
    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Column(name = "seriousness_congenital_anomali")
    public String getSeriousnessCongenitalAnomali() {
        return seriousnessCongenitalAnomali;
    }

    public void setSeriousnessCongenitalAnomali(String seriousnessCongenitalAnomali) {
        this.seriousnessCongenitalAnomali = seriousnessCongenitalAnomali;
    }

    @Column(name = "seriousness_death")
    public String getSeriousnessDeath() {
        return seriousnessDeath;
    }

    public void setSeriousnessDeath(String seriousnessDeath) {
        this.seriousnessDeath = seriousnessDeath;
    }

    @Column(name = "seriousness_disabling")
    public String getSeriousnessDisabling() {
        return seriousnessDisabling;
    }

    public void setSeriousnessDisabling(String seriousnessDisabling) {
        this.seriousnessDisabling = seriousnessDisabling;
    }

    @Column(name = "seriousness_hospitalization")
    public String getSeriousnessHospitalization() {
        return seriousnessHospitalization;
    }

    public void setSeriousnessHospitalization(String seriousnessHospitalization) {
        this.seriousnessHospitalization = seriousnessHospitalization;
    }

    @Column(name = "seriousness_life_threatening")
    public String getSeriousnessLifeThreatening() {
        return seriousnessLifeThreatening;
    }

    public void setSeriousnessLifeThreatening(String seriousnessLifeThreatening) {
        this.seriousnessLifeThreatening = seriousnessLifeThreatening;
    }

    @Column(name = "seriousness_other")
    public String getSeriousnessOther() {
        return seriousnessOther;
    }

    public void setSeriousnessOther(String seriousnessOther) {
        this.seriousnessOther = seriousnessOther;
    }

    @Column(name = "receipt_date")
    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    @Column(name = "transmission_date")
    public String getTransmissionDate() {
        return transmissionDate;
    }

    public void setTransmissionDate(String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    @Column(name = "transmission_date_format")
    public String getTransmissionDateFormat() {
        return transmissionDateFormat;
    }

    public void setTransmissionDateFormat(String transmissionDateFormat) {
        this.transmissionDateFormat = transmissionDateFormat;
    }

    @Column(name = "receipt_date_format")
    public String getReceiptDateFormat() {
        return receiptDateFormat;
    }

    public void setReceiptDateFormat(String receiptDateFormat) {
        this.receiptDateFormat = receiptDateFormat;
    }

    @Column(name = "serious")
    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    @Column(name = "receive_date_format")
    public String getReceiveDateFormat() {
        return receiveDateFormat;
    }

    public void setReceiveDateFormat(String receiveDateFormat) {
        this.receiveDateFormat = receiveDateFormat;
    }

    @Column(name = "fulfill_expedite_criteria")
    public String getFulfillExpediteCriteria() {
        return fulfillExpediteCriteria;
    }

    public void setFulfillExpediteCriteria(String fulfillExpediteCriteria) {
        this.fulfillExpediteCriteria = fulfillExpediteCriteria;
    }

    @Column(name = "safety_report_id")
    public String getSafetyReportID() {
        return safetyReportID;
    }

    public void setSafetyReportID(String safetyReportID) {
        this.safetyReportID = safetyReportID;
    }

    public String getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(String duplicate) {
        this.duplicate = duplicate;
    }

    @Column(name = "occur_country")
    public String getOccurCountry() {
        return occurCountry;
    }

    public void setOccurCountry(String occurCountry) {
        this.occurCountry = occurCountry;
    }

    @Column(name = "primary_source_country")
    public String getPrimarySourceCountry() {
        return primarySourceCountry;
    }

    public void setPrimarySourceCountry(String primarySourceCountry) {
        this.primarySourceCountry = primarySourceCountry;
    }

    @Column(name = "company_numb")
    public String getCompanyNumb() {
        return companyNumb;
    }

    public void setCompanyNumb(String companyNumb) {
        this.companyNumb = companyNumb;
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
    public PrimarySourceX getPrimarySource() {
        return primarySource;
    }

    public void setPrimarySource(PrimarySourceX primarySource) {
        this.primarySource = primarySource;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public ReportDuplicateX getReportDuplicate() {
        return reportDuplicate;
    }

    public void setReportDuplicate(ReportDuplicateX reportDuplicate) {
        this.reportDuplicate = reportDuplicate;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

}
