package ru.sbt.comparison.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class ProtobufDeserializationBenchmark extends ComparisonBenchmark {
    @Benchmark
    public void deserializeToDTO() {
        protoDeserializer.deserialize(protobufToDeserialize);
    }
}
