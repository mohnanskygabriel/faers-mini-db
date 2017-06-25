package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_result")
public class Result implements Serializable {

    static final long serialVersionUID = 1L;
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
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_result_patient_id_patient_id"))
    private Patient patient;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_result_sender_id_sender_id"))
    private Sender sender;

    @SerializedName("primarysource")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "primary_source_id", foreignKey = @ForeignKey(name = "fk_result_primary_source_id_primary_source_id"))
    private PrimarySource primarySource;

    @SerializedName("reportduplicate")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "report_duplicate_id", foreignKey = @ForeignKey(name = "fk_result_report_duplicate_id_report_duplicate_id"))
    private ReportDuplicate reportDuplicate;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_result_receiver_id_receiver_id"))
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.safetyReport);
        hash = 37 * hash + Objects.hashCode(this.safetyReportversion);
        hash = 37 * hash + Objects.hashCode(this.receiveDate);
        hash = 37 * hash + Objects.hashCode(this.seriousnessCongenitalAnomali);
        hash = 37 * hash + Objects.hashCode(this.seriousnessDeath);
        hash = 37 * hash + Objects.hashCode(this.seriousnessDisabling);
        hash = 37 * hash + Objects.hashCode(this.seriousnessHospitalization);
        hash = 37 * hash + Objects.hashCode(this.seriousnessLifeThreatening);
        hash = 37 * hash + Objects.hashCode(this.seriousnessOther);
        hash = 37 * hash + Objects.hashCode(this.receiptDate);
        hash = 37 * hash + Objects.hashCode(this.transmissionDate);
        hash = 37 * hash + Objects.hashCode(this.transmissionDateFormat);
        hash = 37 * hash + Objects.hashCode(this.receiptDateFormat);
        hash = 37 * hash + Objects.hashCode(this.serious);
        hash = 37 * hash + Objects.hashCode(this.receiveDateFormat);
        hash = 37 * hash + Objects.hashCode(this.fulfillExpediteCriteria);
        hash = 37 * hash + Objects.hashCode(this.safetyReportID);
        hash = 37 * hash + Objects.hashCode(this.duplicate);
        hash = 37 * hash + Objects.hashCode(this.occurCountry);
        hash = 37 * hash + Objects.hashCode(this.primarySourceCountry);
        hash = 37 * hash + Objects.hashCode(this.companyNumb);
        hash = 37 * hash + Objects.hashCode(this.patient);
        hash = 37 * hash + Objects.hashCode(this.sender);
        hash = 37 * hash + Objects.hashCode(this.primarySource);
        hash = 37 * hash + Objects.hashCode(this.reportDuplicate);
        hash = 37 * hash + Objects.hashCode(this.receiver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Result other = (Result) obj;
        if (!Objects.equals(this.safetyReport, other.safetyReport)) {
            return false;
        }
        if (!Objects.equals(this.safetyReportversion, other.safetyReportversion)) {
            return false;
        }
        if (!Objects.equals(this.receiveDate, other.receiveDate)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessCongenitalAnomali, other.seriousnessCongenitalAnomali)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessDeath, other.seriousnessDeath)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessDisabling, other.seriousnessDisabling)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessHospitalization, other.seriousnessHospitalization)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessLifeThreatening, other.seriousnessLifeThreatening)) {
            return false;
        }
        if (!Objects.equals(this.seriousnessOther, other.seriousnessOther)) {
            return false;
        }
        if (!Objects.equals(this.receiptDate, other.receiptDate)) {
            return false;
        }
        if (!Objects.equals(this.transmissionDate, other.transmissionDate)) {
            return false;
        }
        if (!Objects.equals(this.transmissionDateFormat, other.transmissionDateFormat)) {
            return false;
        }
        if (!Objects.equals(this.receiptDateFormat, other.receiptDateFormat)) {
            return false;
        }
        if (!Objects.equals(this.serious, other.serious)) {
            return false;
        }
        if (!Objects.equals(this.receiveDateFormat, other.receiveDateFormat)) {
            return false;
        }
        if (!Objects.equals(this.fulfillExpediteCriteria, other.fulfillExpediteCriteria)) {
            return false;
        }
        if (!Objects.equals(this.safetyReportID, other.safetyReportID)) {
            return false;
        }
        if (!Objects.equals(this.occurCountry, other.occurCountry)) {
            return false;
        }
        if (!Objects.equals(this.primarySourceCountry, other.primarySourceCountry)) {
            return false;
        }
        if (!Objects.equals(this.companyNumb, other.companyNumb)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.duplicate, other.duplicate)) {
            return false;
        }
        if (!Objects.equals(this.patient, other.patient)) {
            return false;
        }
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.primarySource, other.primarySource)) {
            return false;
        }
        if (!Objects.equals(this.reportDuplicate, other.reportDuplicate)) {
            return false;
        }
        if (!Objects.equals(this.receiver, other.receiver)) {
            return false;
        }
        return true;
    }

}
