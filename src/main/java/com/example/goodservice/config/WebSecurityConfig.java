package com.example.goodservice.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/registerUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionUser").permitAll()
                .antMatchers(HttpMethod.POST,"/connexionProfessional").permitAll()
                .antMatchers(HttpMethod.POST,"/registerProfessional").permitAll()
                .anyRequest().authenticated();
    }
}
