# Kafka producer consumer Example

pache Kafka is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications. This sample project explain the simple producer and consumer options avilabel from Spring boot Kafka module. 

- Uses Springboot Kafka Client 2.7.0
- Apache Kafka 2.13 - 2.8.0
- Apache zookeeper 3.7.0
- Windows 10

## Features

- Single Gradle project which contains producer and consumer
- Uses Intellij IDEA community Edition
- Uses OpenJDK 11, apache zookeeper 3.7.0 and Kafka 2.13 - 2.8.0

## Tech

Kafka producer and consumer uses a number of open source projects to work properly:

- [OpenJDK](https://adoptopenjdk.net/installation.html) - Open JDK
- [Apache Kafka](https://kafka.apache.org/) - open-source distributed event streaming platform 
- [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/#section=windows) - free community IDEA
- [zookeeper](https://zookeeper.apache.org/) - install zookeeper on windows
- [Gradle] - IntelliJ IDEA default Gradle plugin
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



## Reference
* [Spring for Apache Kafka](https://docs.spring.io/spring-kafka/docs/current/reference/html/)
* [Setting Up and Running Apache Kafka on Windows OS](https://dzone.com/articles/running-apache-kafka-on-windows-os)
* [Kafka Clients](https://docs.confluent.io/3.3.0/clients/index.html)


## License
MIT

