
package com.example.goodservice.config;


import org.hibernate.mapping.Array;
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

@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
        http.csrf().disable();
        http.cors().configurationSource(corsConfigurationSource());
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/registerUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionProfessional").permitAll()
                .antMatchers(HttpMethod.POST,"/registerProfessional").permitAll()
                .anyRequest().authenticated();
    }

    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedMethods(List.of(
                HttpMethod.GET.name(),
                HttpMethod.POST.name(),
                HttpMethod.PUT.name(),
                HttpMethod.DELETE.name()
        ));
        configuration.setAllowCredentials(true);
        String[] origins = {"http://localhost:4200","https://mugiwara.csid.agilitejoviale.fr/"};
        configuration.setAllowedOrigins(new ArrayList<>(Arrays.asList(origins)));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration.applyPermitDefaultValues());
        return source;
    }
}

