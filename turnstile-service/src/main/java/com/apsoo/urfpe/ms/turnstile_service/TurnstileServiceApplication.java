package com.apsoo.urfpe.ms.turnstile_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TurnstileServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurnstileServiceApplication.class, args);
    }
}
