package com.globallogic.faers.json;

import com.globallogic.faers.json.importer.Event;
import com.globallogic.faers.zip.downloader.DrugEventList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DAO {

	public Event getEventFromJSON(String json) {
		Logger logger = LogManager.getLogger(DAO.class);
		JsonReader jReader = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(json), StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			jReader = new JsonReader(isr);
			jReader.setLenient(true);
			while (jReader.hasNext()) {
				if (jReader.peek() == JsonToken.END_DOCUMENT) {
					jReader.close();
					return null;
				}
				return gson.fromJson(jReader, Event.class);
			}

		} catch (FileNotFoundException fileNotFoundException) {
			logger.catching(fileNotFoundException);
		} catch (IOException ioException) {
			logger.catching(ioException);
		} finally {
			if (jReader != null) {
				try {
					jReader.close();
				} catch (IOException e) {
					logger.catching(e);
				}
			}
		}
		return null;
	}

	public DrugEventList getDrugEventListFromJSON(String json) {
		Logger logger = LogManager.getLogger(DAO.class);
		JsonReader jReader = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(json), StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			jReader = new JsonReader(isr);
			jReader.setLenient(true);
			while (jReader.hasNext()) {
				if (jReader.peek() == JsonToken.END_DOCUMENT) {
					jReader.close();
					return null;
				}
				return gson.fromJson(jReader, DrugEventList.class);
			}

		} catch (FileNotFoundException fileNotFoundException) {
			logger.catching(fileNotFoundException);
		} catch (IOException ioException) {
			logger.catching(ioException);
		} finally {
			if (jReader != null) {
				try {
					jReader.close();
				} catch (IOException e) {
					logger.catching(e);
				}
			}
		}
		return null;
	}

}
