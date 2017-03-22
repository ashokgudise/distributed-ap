package com.dockerized.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by ashokgudise on 2/11/17.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dockerized.spring")
public class AppConfig {}
