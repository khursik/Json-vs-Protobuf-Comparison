# Comparison JSON vs Protobuf
We run benchmark with 5 warm up and 5 measurements iterations on simple DTO. Then we average every 5 measurement iterations results to give a more equitable results.
## Jmh Output

```
# JMH version: 1.35
# VM version: JDK 11.0.20, OpenJDK 64-Bit Server VM, 11.0.20+8-LTS
# VM invoker: /Users/19493846/Library/Java/JavaVirtualMachines/corretto-11.0.20/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8 -Djava.io.tmpdir=/Users/19493846/IdeaProjects/json-protobuf-comparison/build/tmp/jmh -Duser.country=RU -Duser.language=en -Duser.variant
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: ru.sbt.comparison.benchmark.JsonDeserializationBenchmark.deserializeToDTO

# Run progress: 0.00% complete, ETA 00:20:00
# Fork: 1 of 3
# Warmup Iteration   1: 802.475 ns/op
# Warmup Iteration   2: 766.017 ns/op
# Warmup Iteration   3: 752.398 ns/op
# Warmup Iteration   4: 773.224 ns/op
# Warmup Iteration   5: 782.393 ns/op
Iteration   1: 778.423 ns/op
Iteration   2: 784.488 ns/op
Iteration   3: 785.174 ns/op
Iteration   4: 786.052 ns/op
Iteration   5: 748.548 ns/op

# Run progress: 8.33% complete, ETA 00:18:26
# Fork: 2 of 3
# Warmup Iteration   1: 767.629 ns/op
# Warmup Iteration   2: 776.184 ns/op
# Warmup Iteration   3: 739.311 ns/op
# Warmup Iteration   4: 749.953 ns/op
# Warmup Iteration   5: 740.489 ns/op
Iteration   1: 744.380 ns/op
Iteration   2: 752.640 ns/op
Iteration   3: 758.827 ns/op
Iteration   4: 745.443 ns/op
Iteration   5: 743.611 ns/op

# Run progress: 16.67% complete, ETA 00:16:45
# Fork: 3 of 3
# Warmup Iteration   1: 769.599 ns/op
# Warmup Iteration   2: 751.705 ns/op
# Warmup Iteration   3: 756.166 ns/op
# Warmup Iteration   4: 740.075 ns/op
# Warmup Iteration   5: 748.249 ns/op
Iteration   1: 746.241 ns/op
Iteration   2: 748.581 ns/op
Iteration   3: 757.637 ns/op
Iteration   4: 761.488 ns/op
Iteration   5: 742.362 ns/op


Result "ru.sbt.comparison.benchmark.JsonDeserializationBenchmark.deserializeToDTO":
  758.926 ±(99.9%) 17.576 ns/op [Average]
  (min, avg, max) = (742.362, 758.926, 786.052), stdev = 16.440
  CI (99.9%): [741.350, 776.502] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 11.0.20, OpenJDK 64-Bit Server VM, 11.0.20+8-LTS
# VM invoker: /Users/19493846/Library/Java/JavaVirtualMachines/corretto-11.0.20/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8 -Djava.io.tmpdir=/Users/19493846/IdeaProjects/json-protobuf-comparison/build/tmp/jmh -Duser.country=RU -Duser.language=en -Duser.variant
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: ru.sbt.comparison.benchmark.JsonSerializationBenchmark.serializeFromDTO

# Run progress: 25.00% complete, ETA 00:15:05
# Fork: 1 of 3
# Warmup Iteration   1: 438.583 ns/op
# Warmup Iteration   2: 424.768 ns/op
# Warmup Iteration   3: 428.737 ns/op
# Warmup Iteration   4: 436.963 ns/op
# Warmup Iteration   5: 453.667 ns/op
Iteration   1: 461.913 ns/op
Iteration   2: 454.297 ns/op
Iteration   3: 450.872 ns/op
Iteration   4: 426.586 ns/op
Iteration   5: 436.034 ns/op

# Run progress: 33.33% complete, ETA 00:13:24
# Fork: 2 of 3
# Warmup Iteration   1: 441.653 ns/op
# Warmup Iteration   2: 433.950 ns/op
# Warmup Iteration   3: 436.117 ns/op
# Warmup Iteration   4: 441.090 ns/op
# Warmup Iteration   5: 426.060 ns/op
Iteration   1: 435.960 ns/op
Iteration   2: 429.725 ns/op
Iteration   3: 429.713 ns/op
Iteration   4: 423.798 ns/op
Iteration   5: 445.954 ns/op

# Run progress: 41.67% complete, ETA 00:11:43
# Fork: 3 of 3
# Warmup Iteration   1: 460.267 ns/op
# Warmup Iteration   2: 427.726 ns/op
# Warmup Iteration   3: 446.180 ns/op
# Warmup Iteration   4: 440.698 ns/op
# Warmup Iteration   5: 441.408 ns/op
Iteration   1: 438.689 ns/op
Iteration   2: 433.025 ns/op
Iteration   3: 462.273 ns/op
Iteration   4: 445.896 ns/op
Iteration   5: 433.064 ns/op


Result "ru.sbt.comparison.benchmark.JsonSerializationBenchmark.serializeFromDTO":
  440.520 ±(99.9%) 13.246 ns/op [Average]
  (min, avg, max) = (423.798, 440.520, 462.273), stdev = 12.391
  CI (99.9%): [427.274, 453.766] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 11.0.20, OpenJDK 64-Bit Server VM, 11.0.20+8-LTS
# VM invoker: /Users/19493846/Library/Java/JavaVirtualMachines/corretto-11.0.20/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8 -Djava.io.tmpdir=/Users/19493846/IdeaProjects/json-protobuf-comparison/build/tmp/jmh -Duser.country=RU -Duser.language=en -Duser.variant
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: ru.sbt.comparison.benchmark.ProtobufDeserializationBenchmark.deserializeToDTO

# Run progress: 50.00% complete, ETA 00:10:03
# Fork: 1 of 3
# Warmup Iteration   1: 7.295 ns/op
# Warmup Iteration   2: 7.214 ns/op
# Warmup Iteration   3: 7.159 ns/op
# Warmup Iteration   4: 7.242 ns/op
# Warmup Iteration   5: 7.306 ns/op
Iteration   1: 7.214 ns/op
Iteration   2: 7.330 ns/op
Iteration   3: 7.190 ns/op
Iteration   4: 7.240 ns/op
Iteration   5: 7.220 ns/op

# Run progress: 58.33% complete, ETA 00:08:22
# Fork: 2 of 3
# Warmup Iteration   1: 7.317 ns/op
# Warmup Iteration   2: 7.166 ns/op
# Warmup Iteration   3: 7.074 ns/op
# Warmup Iteration   4: 7.075 ns/op
# Warmup Iteration   5: 6.987 ns/op
Iteration   1: 6.898 ns/op
Iteration   2: 7.035 ns/op
Iteration   3: 7.098 ns/op
Iteration   4: 7.050 ns/op
Iteration   5: 6.989 ns/op

# Run progress: 66.67% complete, ETA 00:06:42
# Fork: 3 of 3
# Warmup Iteration   1: 7.285 ns/op
# Warmup Iteration   2: 7.199 ns/op
# Warmup Iteration   3: 7.450 ns/op
# Warmup Iteration   4: 7.452 ns/op
# Warmup Iteration   5: 7.147 ns/op
Iteration   1: 7.117 ns/op
Iteration   2: 7.162 ns/op
Iteration   3: 7.505 ns/op
Iteration   4: 7.180 ns/op
Iteration   5: 7.325 ns/op


Result "ru.sbt.comparison.benchmark.ProtobufDeserializationBenchmark.deserializeToDTO":
  7.170 ±(99.9%) 0.161 ns/op [Average]
  (min, avg, max) = (6.898, 7.170, 7.505), stdev = 0.151
  CI (99.9%): [7.009, 7.331] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 11.0.20, OpenJDK 64-Bit Server VM, 11.0.20+8-LTS
# VM invoker: /Users/19493846/Library/Java/JavaVirtualMachines/corretto-11.0.20/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8 -Djava.io.tmpdir=/Users/19493846/IdeaProjects/json-protobuf-comparison/build/tmp/jmh -Duser.country=RU -Duser.language=en -Duser.variant
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: ru.sbt.comparison.benchmark.ProtobufSerializationBenchmark.serializeFromDTO

# Run progress: 75.00% complete, ETA 00:05:01
# Fork: 1 of 3
# Warmup Iteration   1: 1.567 ns/op
# Warmup Iteration   2: 1.546 ns/op
# Warmup Iteration   3: 2.021 ns/op
# Warmup Iteration   4: 1.999 ns/op
# Warmup Iteration   5: 2.024 ns/op
Iteration   1: 2.035 ns/op
Iteration   2: 2.051 ns/op
Iteration   3: 2.020 ns/op
Iteration   4: 2.036 ns/op
Iteration   5: 2.057 ns/op

# Run progress: 83.33% complete, ETA 00:03:21
# Fork: 2 of 3
# Warmup Iteration   1: 1.558 ns/op
# Warmup Iteration   2: 1.565 ns/op
# Warmup Iteration   3: 2.017 ns/op
# Warmup Iteration   4: 2.159 ns/op
# Warmup Iteration   5: 2.120 ns/op
Iteration   1: 2.111 ns/op
Iteration   2: 2.090 ns/op
Iteration   3: 2.087 ns/op
Iteration   4: 2.048 ns/op
Iteration   5: 2.079 ns/op

# Run progress: 91.67% complete, ETA 00:01:40
# Fork: 3 of 3
# Warmup Iteration   1: 1.628 ns/op
# Warmup Iteration   2: 1.588 ns/op
# Warmup Iteration   3: 2.015 ns/op
# Warmup Iteration   4: 2.057 ns/op
# Warmup Iteration   5: 2.031 ns/op
Iteration   1: 2.017 ns/op
Iteration   2: 2.099 ns/op
Iteration   3: 2.090 ns/op
Iteration   4: 2.031 ns/op
Iteration   5: 2.041 ns/op


Result "ru.sbt.comparison.benchmark.ProtobufSerializationBenchmark.serializeFromDTO":
  2.060 ±(99.9%) 0.033 ns/op [Average]
  (min, avg, max) = (2.017, 2.060, 2.111), stdev = 0.031
  CI (99.9%): [2.027, 2.092] (assumes normal distribution)
```
## Results

```
Benchmark                                          Mode  Cnt    Score    Error  Units
JsonDeserializationBenchmark.deserializeToDTO      avgt   15  758.926 ± 17.576  ns/op
JsonSerializationBenchmark.serializeFromDTO        avgt   15  440.520 ± 13.246  ns/op
ProtobufDeserializationBenchmark.deserializeToDTO  avgt   15    7.170 ±  0.161  ns/op
ProtobufSerializationBenchmark.serializeFromDTO    avgt   15    2.060 ±  0.033  ns/op
```
## Summary
As we can see **protobuf** serialization/deserialization on simple DTO is faster than **JSON**.
But if you need to clarity and understandability, and performance is not significant, then it is the better to choose **JSON**.