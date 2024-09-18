package com.apsoo.urfpe.ms.biometrics_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BiometricsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BiometricsServiceApplication.class, args);
    }
}
