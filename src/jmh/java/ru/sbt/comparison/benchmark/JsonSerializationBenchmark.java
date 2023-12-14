package ru.sbt.comparison.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class JsonSerializationBenchmark extends ComparisonBenchmark {
    @Benchmark
    public void serializeFromDTO() {
        jsonSerializer.serialize(dtoToSerialize);
    }
}
