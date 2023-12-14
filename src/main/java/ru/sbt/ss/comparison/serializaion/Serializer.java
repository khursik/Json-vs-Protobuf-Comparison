package ru.sbt.ss.comparison.serializaion;

import ru.sbt.ss.comparison.dto.MessageFromClient;

public interface Serializer<T> {
    T serialize(MessageFromClient dto);
}
