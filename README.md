# Kafka producer consumer Example

pache Kafka is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications. This sample project explain the simple producer and consumer options avilabel from Spring boot Kafka module. 

- Uses Springboot Kafka Client
- Kafka 2.13 - 2.8.0
- Windows platform

## Features

- Single Gradle project which contains producer and consumer
- Uses Intellij IDEA community Edition
- Uses OpenJDK 11, apache zookeeper 3.7.0 and Kafka 2.13 - 2.8.0

## Tech

Kafka producer and consumer uses a number of open source projects to work properly:

- [OpenJDK] - Open JDK
- [Apache Kafka] - open-source distributed event streaming platform 
- [IntelliJ IDEA Community] - free community IDEA
- [Gradle] - IntelliJ IDEA default Gradle plugin
- [zookeeper] - install zookeeper on windows
- [windows] - uses windows Operating system


## Installation

Kafka sample requires [Prebuilt OpenJDK ](https://adoptopenjdk.net/) v11+ to run.

Download and Install the [Zookeer](https://zookeeper.apache.org/releases.html) and extract the tar file. 

```sh
cd C:\software\apache-zookeeper-3.7.0\conf
copy zoo_sample.cfg zoo.cfg

open the zoo.cfg => update the following

dataDir=C:/software/apache-zookeeper-3.7.0/data
```

start the zookeeper

```sh
C:\software\apache-zookeeper-3.7.0\bin>zkServer.cmd
```

Download and Install the [Apache Kafka 2.8.0](https://kafka.apache.org/downloads) and extract the tar file. 



```sh
cd C:\software\kafka_2.13-2.8.0\config

open the server.properties => update the following

log.dirs=C:/software/kafka_2.13-2.8.0/logs
```


start the Apache Kafka

```sh
cd C:\software\kafka_2.13-2.8.0
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

#### Building for source

For running the consumer:

```sh
cd consumer
./gradle bootRun
```

For running the producer:

```sh
cd producer
./gradle bootRun
```


> Note: We uses Windows 10 operating system single node setup.

## License
MIT

