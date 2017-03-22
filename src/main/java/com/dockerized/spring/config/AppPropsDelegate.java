package com.dockerized.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by ashokgudise on 2/11/17.
 */
@Configuration
//@PropertySource("classpath:app.properties")
@PropertySource("file:///${APP_CONFIG_LOCATION}/app.properties")
public class AppPropsDelegate {

    @Autowired
    private Environment env;

    public String getAppLabel(){
        return env.getProperty("app.label");
    }

}
//@PropertySource("file:///${APP_CONFIG_LOCATION}/app.properties")
