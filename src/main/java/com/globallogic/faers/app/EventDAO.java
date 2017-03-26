package com.globallogic.faers.app;

import com.globallogic.faers.event.Event;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventDAO {

    public Event getEventFromJSON() throws FileNotFoundException {
        try {
            FileReader fR = new FileReader("src/main/resources/drug-event-0002-of-0005.json");
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

        } catch (IOException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
