
package com.example.goodservice.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                .antMatchers(HttpMethod.POST,"/registerUser").permitAll()
                .antMatchers(HttpMethod.POST,"/registerUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionProfessional").permitAll()
                .antMatchers(HttpMethod.POST,"/registerProfessional").permitAll()
                .anyRequest().authenticated();

    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://mugiwara.csid.agilitejoviale.fr");
            }
        };
    }


}

