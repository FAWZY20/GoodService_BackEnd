package com.example.goodservice.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class ProfesionalJsonDeserializer extends JsonDeserializer<ProfesionalEntity> {

    @Override
    public ProfesionalEntity deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        if(jsonParser == null)return null;

        ProfesionalEntity profesional = new ProfesionalEntity();
        profesional.setId(Integer.valueOf(jsonParser.getText()));
        return profesional;
    }
}
