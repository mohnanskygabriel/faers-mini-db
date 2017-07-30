package com.globallogic.faers.json;

import com.globallogic.faers.json.importer.Drug;
import com.globallogic.faers.json.importer.Event;
import com.globallogic.faers.json.importer.OpenFDA;
import com.globallogic.faers.json.importer.Patient;
import com.globallogic.faers.json.importer.Reaction;
import com.globallogic.faers.json.importer.Result;
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

		Result result = new Result();

		Patient patient = new Patient();
		patient.setPatientOnsetAge("34");
		patient.setPatientSex(2);
		patient.setPatientOnsetAgeUnit(801);
		patient.setPatientWeight(78.0);

		List<Reaction> reactionList = new LinkedList<>();
		Reaction reaction = new Reaction();
		reaction.setReactionMedDRAPT("Accidental poisoning");
		reactionList.add(reaction);
		patient.setReaction(reactionList);

		Drug drug = new Drug();
		drug.setDrugAdministrationRoute(48);
		drug.setDrugCharacterization(1);
		drug.setDrugIndication("RHEUMATOID ARTHRITIS");
		drug.setMedicinalProduct("ASCORBIC ACID");

		OpenFDA openFDA = new OpenFDA();
		openFDA.setGenericName(new LinkedList<>());
		openFDA.getGenericName().add("ASCORBIC ACID");
		openFDA.getGenericName().add("LISINOPRIL");
		openFDA.setBrand_Name(new LinkedList<>());
		openFDA.getBrand_Name().add("ASCORBIC ACID");
		openFDA.getBrand_Name().add("LISINOPRIL");
		openFDA.setManufacturerName(new LinkedList<>());
		openFDA.getManufacturerName().add("The Torrance Company");
		openFDA.getManufacturerName().add("Mylan Institutional LLC");
		openFDA.setSubstanceName(new LinkedList<>());
		openFDA.getSubstanceName().add("ASCORBIC ACID");
		openFDA.getSubstanceName().add("RISEDRONATE SODIUM");

		List<Drug> drugList = new LinkedList<>();
		drug.setOpenfda(openFDA);
		drugList.add(drug);
		patient.setDrug(drugList);

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
		drugEventListCreatedManually.getMeta().setDisclaimer(
				"Do not rely on openFDA to make decisions regarding medical care. While we make every effort to ensure that data is accurate, you should assume all results are unvalidated. We may limit or otherwise restrict your access to the API in line with our Terms of Service.");
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
