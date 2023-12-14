package ru.sbt.comparison.benchmark;

import ru.sbt.comparison.Message;
import org.openjdk.jmh.annotations.*;
import ru.sbt.ss.comparison.deserializaion.Deserializer;
import ru.sbt.ss.comparison.deserializaion.json.JsonDeserializer;
import ru.sbt.ss.comparison.deserializaion.protobuf.ProtobufDeserializer;
import ru.sbt.ss.comparison.dto.MessageFromClient;
import ru.sbt.ss.comparison.dto.MessageFromClient.Data;
import ru.sbt.ss.comparison.serializaion.Serializer;
import ru.sbt.ss.comparison.serializaion.json.JsonSerializer;
import ru.sbt.ss.comparison.serializaion.protobuf.ProtobufSerializer;

import java.util.concurrent.TimeUnit;

@Fork(3)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
public class ComparisonBenchmark {

    final Deserializer<String> jsonDeserializer = new JsonDeserializer();
    final Deserializer<Message> protoDeserializer = new ProtobufDeserializer();

    final Serializer<String> jsonSerializer = new JsonSerializer();
    final Serializer<Message> protoSerializer = new ProtobufSerializer();

    String jsonToDeserialize = "{\"id\": \"283648\", \"source\": \"localhost:9658\", " +
            "\"data\": {\"firstName\": \"Johnny\", \"lastName\": \"Depp\", " +
            "\"email\": \"johnny.depp.@outlook.com\"}}";

    Message protobufToDeserialize = Message.newBuilder()
            .setId(283648)
            .setSource("localhost:9658")
            .setFirstName("Johnny")
            .setLastName("Depp")
            .setEmail("johnny.depp.@outlook.com").build();
    MessageFromClient dtoToSerialize = new MessageFromClient(
            283648, "localhost:9658",
            new Data("Johnny", "Depp", "johnny.depp.@outlook.com"));
}
