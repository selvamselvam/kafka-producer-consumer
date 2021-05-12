package com.careerdrill;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("topic1")
                .partitions(10)
                .replicas(1)
                .build();
    }



    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            for (int i = 0; i < 50; i++) {

                ListenableFuture<SendResult<String, String>> future = template.send("topic1", "test:" + i);

                future.addCallback(new ListenableFutureCallback<>() {

                    @Override
                    public void onSuccess(SendResult<String, String> result) {
                        System.out.println("Success");
                    }

                    @Override
                    public void onFailure(Throwable ex) {
                        System.out.println("Failure");
                    }

                });


            }

        };
    }

}