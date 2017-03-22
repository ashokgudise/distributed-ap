package com.dockerized.spring.controller;

import com.dockerized.spring.config.AppPropsDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashokgudise on 2/11/17.
 */
@RestController
public class AppController {

    @Autowired
    AppPropsDelegate propsDelegate;

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest

        return "Welcome to Example:"+propsDelegate.getAppLabel();
    }


}
