package ru.sbt.comparison.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class JsonDeserializationBenchmark extends ComparisonBenchmark {
    @Benchmark
    public void deserializeToDTO() {
        jsonDeserializer.deserialize(jsonToDeserialize);
    }
}
