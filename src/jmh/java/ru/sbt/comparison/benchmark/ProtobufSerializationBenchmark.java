package ru.sbt.comparison.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class ProtobufSerializationBenchmark extends ComparisonBenchmark {
    @Benchmark
    public void serializeFromDTO() {
        protoSerializer.serialize(dtoToSerialize);
    }
}
