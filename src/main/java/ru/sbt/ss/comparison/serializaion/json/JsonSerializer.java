package ru.sbt.ss.comparison.serializaion.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.sbt.ss.comparison.dto.MessageFromClient;
import ru.sbt.ss.comparison.serializaion.Serializer;

public class JsonSerializer implements Serializer<String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String serialize(MessageFromClient message) {
        try {
            return objectMapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
