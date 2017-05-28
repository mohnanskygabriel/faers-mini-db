package com.globallogic.faers.json;

import com.globallogic.faers.json.importer.Event;
import com.globallogic.faers.zip.downloader.DrugEventList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DAO {

    public Event getEventFromJSON(String json) {
        Logger logger = LogManager.getLogger(DAO.class);
        try {
            FileReader fR = new FileReader(json);
            Gson gson = new GsonBuilder().create();
            JsonReader jReader = new JsonReader(fR);
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
        }
        return null;
    }

    public DrugEventList getDrugEventListFromJSON(String json) {
        Logger logger = LogManager.getLogger(DAO.class);
        try {
            FileReader fR = new FileReader(json);
            Gson gson = new GsonBuilder().create();
            JsonReader jReader = new JsonReader(fR);
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
        }
        return null;
    }

}
