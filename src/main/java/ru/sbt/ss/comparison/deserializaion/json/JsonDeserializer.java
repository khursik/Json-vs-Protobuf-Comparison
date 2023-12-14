package ru.sbt.ss.comparison.deserializaion.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.sbt.ss.comparison.deserializaion.Deserializer;
import ru.sbt.ss.comparison.dto.MessageFromClient;

import java.io.IOException;

public class JsonDeserializer implements Deserializer<String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public MessageFromClient deserialize(String json) {
        try {
            return objectMapper.readValue(json, MessageFromClient.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
