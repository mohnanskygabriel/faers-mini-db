package com.faersmini.json;

import java.io.IOException;
import java.util.Locale;

import com.faersmini.json.importer.Reaction;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class ReactionTypeAdapter extends TypeAdapter<Reaction> {
	@Override
	public Reaction read(JsonReader in) throws IOException {
		JsonToken token = in.peek();
		Reaction reaction = new Reaction();
		if (token.equals(JsonToken.BEGIN_OBJECT)) {
			in.beginObject();
			while (!in.peek().equals(JsonToken.END_OBJECT)) {
				if (in.peek().equals(JsonToken.NAME)) {
					if (in.nextName().equals("reactionmeddrapt")) {
						reaction.setReactionMedDRAPT(in.nextString().toUpperCase(Locale.ENGLISH));
					} else {
						in.nextString();
					}
				}
			}
			in.endObject();
		}
		return reaction;
	}

	@Override
	public void write(JsonWriter out, Reaction value) throws IOException {
		//TODO
	}
}
