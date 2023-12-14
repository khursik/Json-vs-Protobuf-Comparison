package ru.sbt.ss.comparison.deserializaion;


import ru.sbt.ss.comparison.dto.MessageFromClient;

public interface Deserializer<T> {
    MessageFromClient deserialize(T dto);
}
