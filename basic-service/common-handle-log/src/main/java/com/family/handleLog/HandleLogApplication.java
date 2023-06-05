package com.family.handleLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName HandleLogApplication
 * @Date 2023-06-01 13:30
 * @AUTHOR family
 **/
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.family"})
public class HandleLogApplication {
    public static void main(String[] args) {
        SpringApplication.run(HandleLogApplication.class, args);
    }
}
