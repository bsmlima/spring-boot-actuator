package com.bsmlima.cloud.tollbooth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TollboothApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TollboothApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TollboothApplication.class);
    }
}
