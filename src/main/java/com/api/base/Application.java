package com.api.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {SessionAutoConfiguration.class})
@ComponentScan("com.api")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}