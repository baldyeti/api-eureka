package io.ibex.apieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiEurekaApplication.class, args);
    }

}

