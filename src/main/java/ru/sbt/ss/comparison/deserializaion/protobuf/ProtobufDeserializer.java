package ru.sbt.ss.comparison.deserializaion.protobuf;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.sbt.comparison.Message;
import ru.sbt.ss.comparison.deserializaion.Deserializer;
import ru.sbt.ss.comparison.dto.MessageFromClient;
import ru.sbt.ss.comparison.dto.MessageFromClient.Data;

public class ProtobufDeserializer implements Deserializer<Message> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public MessageFromClient deserialize(Message dtoMessage) {
        int id = dtoMessage.getId();
        String source = dtoMessage.getSource();
        String firstName = dtoMessage.getFirstName();
        String lastName = dtoMessage.getLastName();
        String email = dtoMessage.getEmail();
        return new MessageFromClient(id, source, new Data(firstName, lastName, email));
    }
}
