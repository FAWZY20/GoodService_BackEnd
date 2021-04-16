package com.example.goodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
=======
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
>>>>>>> 4ed86b1c5ba590d70f5da9e4c1af8748b427f049

@SpringBootApplication
public class GoodserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodserviceApplication.class, args);
    }


    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(GoodserviceApplication.class);
    }

}
