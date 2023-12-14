package ru.sbt.ss.comparison.serializaion.protobuf;

import ru.sbt.comparison.Message;
import ru.sbt.ss.comparison.dto.MessageFromClient;
import ru.sbt.ss.comparison.serializaion.Serializer;

public class ProtobufSerializer implements Serializer<Message> {

    @Override
    public Message serialize(MessageFromClient dto) {
        return Message.newBuilder()
                .setId(dto.getId())
                .setSource(dto.getSource())
                .setFirstName(dto.getData().getFirstName())
                .setLastName(dto.getData().getLastName())
                .setEmail(dto.getData().getEmail()).build();
    }
}
