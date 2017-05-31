package com.globallogic.faers.json;

import com.globallogic.faers.json.importer.Drug;
import com.globallogic.faers.json.importer.Event;
import com.globallogic.faers.json.importer.Meta;
import com.globallogic.faers.json.importer.OpenFDA;
import com.globallogic.faers.json.importer.Patient;
import com.globallogic.faers.json.importer.PatientDeath;
import com.globallogic.faers.json.importer.PrimarySource;
import com.globallogic.faers.json.importer.Reaction;
import com.globallogic.faers.json.importer.Receiver;
import com.globallogic.faers.json.importer.ReportDuplicate;
import com.globallogic.faers.json.importer.Result;
import com.globallogic.faers.json.importer.Results;
import com.globallogic.faers.json.importer.Sender;
import com.globallogic.faers.zip.downloader.DrugEventList;
import com.globallogic.faers.zip.downloader.Partition;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class DAOTest {

    @Test
    public void testGetEventFromJSON() {
        DAO dao = new DAO();
        String testFilePath = DAOTest.class.getResource("/jsonForImportTest.json").getFile().replace("%20", " ");
        Event eventFromJson = dao.getEventFromJSON(testFilePath);
        Event eventCreatedManually = new Event();
        Meta meta = new Meta();
        meta.setLastUpdated("2017-05-05");
        meta.setTerms("https://open.fda.gov/terms/");
        meta.setLicense("https://open.fda.gov/license/");
        meta.setDisclaimer("Do not rely on openFDA to make decisions regarding medical care. While we make every effort to ensure that data is accurate, you should assume all results are unvalidated. We may limit or otherwise restrict your access to the API in line with our Terms of Service.");
        Results results = new Results();
        results.setSkip("19000");
        results.setTotal("207194");
        results.setLimit("19000");
        meta.setResults(results);

        Result result = new Result();
        result.setSafetyReport("1234567-8");
        result.setReceiveDate("20130128");
        result.setReceiveDateFormat("102");
        result.setTransmissionDate("20140127");
        result.setCompanyNumb("BE-COVIDIEN/TYCO HEALTHCARE/MALLINCKRODT-T201300293");
        result.setOccurCountry("BE");
        result.setReceiptDate("20130128");
        result.setTransmissionDateFormat("102");
        result.setReceiptDateFormat("102");
        result.setDuplicate(1);
        result.setSeriousnessDeath("1");
        result.setSeriousnessDisabling("1");
        result.setSeriousnessHospitalization("1");
        result.setSeriousnessLifeThreatening("1");
        result.setSeriousnessOther("1");
        result.setSerious("1");
        result.setSafetyReportversion("1");
        result.setFulfillExpediteCriteria("1");
        result.setSafetyReportID("9034810");
        result.setPrimarySourceCountry("BE");
        result.setSeriousnessCongenitalAnomali("1");

        Patient patient = new Patient();
        patient.setPatientOnsetAge("34");
        patient.setPatientSex(2);
        patient.setPatientOnsetAgeUnit(801);
        patient.setPatientWeight(78.0);

        List<Reaction> reactionList = new LinkedList<>();

        Reaction reaction = new Reaction();
        reaction.setReactionMedDRAPT("Accidental poisoning");
        reaction.setReactionMedDRAVersionPT(16.1);
        reaction.setReactionOutcome(5);

        reactionList.add(reaction);
        patient.setReaction(reactionList);

        PatientDeath patientDeath = new PatientDeath();
        patientDeath.setPatientDeathDate("20030401");
        patientDeath.setPatientDeathDateFormat(102);
        patient.setPatientDeath(patientDeath);

        Drug drug = new Drug();
        drug.setDrugDoseageText("UNK");
        drug.setActionDrug(1);
        drug.setDrugAdditional(1);
        drug.setDrugCumulativeDosageNumb("4100");
        drug.setDrugCumulativeDosageUnit(003);
        drug.setDrugDosageForm("Tablet");
        drug.setDrugDoseageText("SOME TEXT");
        drug.setDrugIntervalDosageDefinition(804);
        drug.setDrugIntervalDosageUnitNumb("1");
        drug.setDrugRecurreAdministration(3);
        drug.setDrugSeparateDosageNumb("1");
        drug.setDrugStructureDosageNumb("600");
        drug.setDrugStructureDosageUnit(003);
        drug.setDrugAdministrationRoute(48);
        drug.setDrugAuthorizationNumb("021223");
        drug.setDrugBatchNumb("020113A");
        drug.setDrugCharacterization(1);
        drug.setDrugDoseageText("3.5 MG/KG, 1 IN 1 AS NECESSARY, INTRAVENOUS DRIP");
        drug.setDrugEndDate("20020920");
        drug.setDrugEndDateFormat(102);
        drug.setDrugIndication("RHEUMATOID ARTHRITIS");
        drug.setDrugStartDate("20020903");
        drug.setDrugStartDateFormat(102);
        drug.setDrugTreatmentDuration("1");
        drug.setDrugTreatmentDurationUnit(804);
        drug.setMedicinalProduct("ASCORBIC ACID");

        OpenFDA openFDA = new OpenFDA();
        openFDA.setApplicationNumber(new LinkedList<>());
        openFDA.getApplicationNumber().add("NDA022047");
        openFDA.getApplicationNumber().add("NDA020639");
        openFDA.setGenericName(new LinkedList<>());
        openFDA.getGenericName().add("ASCORBIC ACID");
        openFDA.getGenericName().add("LISINOPRIL");
        openFDA.setBrand_Name(new LinkedList<>());
        openFDA.getBrand_Name().add("ASCORBIC ACID");
        openFDA.getBrand_Name().add("LISINOPRIL");
        openFDA.setManufacturerName(new LinkedList<>());
        openFDA.getManufacturerName().add("The Torrance Company");
        openFDA.getManufacturerName().add("Mylan Institutional LLC");
        openFDA.setNui(new LinkedList<>());
        openFDA.getNui().add("N0000175556");
        openFDA.getNui().add("N0000000161");
        openFDA.setPackageNDC(new LinkedList<>());
        openFDA.getPackageNDC().add("67457-118-50");
        openFDA.getPackageNDC().add("0389-0486-50");
        openFDA.setPharmClassCS(new LinkedList<>());
        openFDA.getPharmClassCS().add("Platinum-containing Compounds [Chemical/Ingredient]");
        openFDA.getPharmClassCS().add("Androstanes [Chemical/Ingredient]");
        openFDA.setPharmClassEPC(new LinkedList<>());
        openFDA.getPharmClassEPC().add("beta-Adrenergic Blocker [EPC]");
        openFDA.getPharmClassEPC().add("Kinase Inhibitor [EPC]");
        openFDA.setPharmClassMOA(new LinkedList<>());
        openFDA.getPharmClassMOA().add("Protein Kinase Inhibitors [MoA]");
        openFDA.getPharmClassMOA().add("Cytochrome P450 2C8 Inducers [MoA]");
        openFDA.setPharmClassPE(new LinkedList<>());
        openFDA.getPharmClassPE().add("Microtubule Inhibition [PE]");
        openFDA.getPharmClassPE().add("Decreased Immunologically Active Molecule Activity [PE]");
        openFDA.setProductNDC(new LinkedList<>());
        openFDA.getProductNDC().add("0389-0486");
        openFDA.getProductNDC().add("67457-118");
        openFDA.setProductType(new LinkedList<>());
        openFDA.getProductType().add("HUMAN PRESCRIPTION DRUG");
        openFDA.getProductType().add("HUMAN OTC DRUG");
        openFDA.setRoute(new LinkedList<>());
        openFDA.getRoute().add("INTRAMUSCULAR");
        openFDA.getRoute().add("INTRAVENOUS");
        openFDA.setRxcui(new LinkedList<>());
        openFDA.getRxcui().add("308395");
        openFDA.getRxcui().add("721797");
        openFDA.setSplID(new LinkedList<>());
        openFDA.getSplID().add("f67ce1df-27ea-4c67-a8a3-daf3fb3b9a92");
        openFDA.getSplID().add("72133842-ac3f-4a39-a825-38e01930a0a7");
        openFDA.setSpl_Set_ID(new LinkedList<>());
        openFDA.getSpl_Set_ID().add("a6c36a36-28ee-4a1b-86fe-98ef94064b68");
        openFDA.getSpl_Set_ID().add("d05200cb-cf29-4bc7-bf0c-b42ab2d20958");
        openFDA.setSubstanceName(new LinkedList<>());
        openFDA.getSubstanceName().add("ASCORBIC ACID");
        openFDA.getSubstanceName().add("RISEDRONATE SODIUM");
        openFDA.setUnii(new LinkedList<>());
        openFDA.getUnii().add("2S3PL1B6UJ");
        openFDA.getUnii().add("E7199S1YWR");

        List<Drug> drugList = new LinkedList<>();
        drug.setOpenfda(openFDA);
        drugList.add(drug);
        patient.setDrug(drugList);

        PrimarySource primarySource = new PrimarySource();
        primarySource.setQualification(3);
        primarySource.setReporterCountry("BE");
        result.setPrimarySource(primarySource);

        ReportDuplicate reportDuplicate = new ReportDuplicate();
        reportDuplicate.setDuplicateNumb("BE-COVIDIEN/TYCO HEALTHCARE/MALLINCKRODT-T201300293");
        reportDuplicate.setDuplicateSource("COVIDIEN");
        result.setReportDuplicate(reportDuplicate);

        Sender sender = new Sender();
        sender.setSenderOrganization("FDA-Public Use");
        sender.setSenderType("2");
        result.setSender(sender);

        Receiver receiver = new Receiver();
        receiver.setReceiverOrganization("FDA");
        receiver.setReceiverType(6);
        result.setReceiver(receiver);

        eventCreatedManually.setMeta(meta);
        eventCreatedManually.setResults(new LinkedList<>());
        result.setPatient(patient);
        eventCreatedManually.getResults().add(result);

        Assert.assertEquals(eventCreatedManually, eventFromJson);
    }

    @Test
    public void testGetDrugEventListFromJSON() {
        DAO dao = new DAO();
        String testFilePath = DAOTest.class.getResource("/jsonForDownloadTest.json").getFile().replace("%20", " ");
        DrugEventList drugEventListFromJSON = dao.getDrugEventListFromJSON(testFilePath);
        DrugEventList drugEventListCreatedManually = new DrugEventList();
        drugEventListCreatedManually.setMeta(new com.globallogic.faers.zip.downloader.Meta());
        drugEventListCreatedManually.getMeta().setDisclaimer("Do not rely on openFDA to make decisions regarding medical care. While we make every effort to ensure that data is accurate, you should assume all results are unvalidated. We may limit or otherwise restrict your access to the API in line with our Terms of Service.");
        drugEventListCreatedManually.getMeta().setLastUpdated("2017-05-05");
        drugEventListCreatedManually.getMeta().setLicense("https://open.fda.gov/license/");
        drugEventListCreatedManually.getMeta().setTerms("https://open.fda.gov/terms/");
        drugEventListCreatedManually.setResults(new com.globallogic.faers.zip.downloader.Results());
        drugEventListCreatedManually.getResults().setDrug(new com.globallogic.faers.zip.downloader.Drug());
        drugEventListCreatedManually.getResults().getDrug().setEvent(new com.globallogic.faers.zip.downloader.Event());
        drugEventListCreatedManually.getResults().getDrug().getEvent().setExportDate("2017-05-05");
        drugEventListCreatedManually.getResults().getDrug().getEvent().setTotalRecords("7132687");
        drugEventListCreatedManually.getResults().getDrug().getEvent().setPartitions(new LinkedList<>());
        Partition partition1 = new Partition();
        partition1.setDisplayName("All other data (part 1 of 68)");
        partition1.setFileURL("https://download.open.fda.gov/drug/event/all_other/drug-event-0001-of-0068.json.zip");
        partition1.setRecordsNumber("19000");
        partition1.setSizeMB("12.26");
        Partition partition2 = new Partition();
        partition2.setDisplayName("All other data (part 2 of 68)");
        partition2.setFileURL("https://download.open.fda.gov/drug/event/all_other/drug-event-0002-of-0068.json.zip");
        partition2.setRecordsNumber("19000");
        partition2.setSizeMB("3.30");
        drugEventListCreatedManually.getResults().getDrug().getEvent().getPartitions().add(partition1);
        drugEventListCreatedManually.getResults().getDrug().getEvent().getPartitions().add(partition2);

        Assert.assertEquals(drugEventListCreatedManually, drugEventListFromJSON);

    }

}
