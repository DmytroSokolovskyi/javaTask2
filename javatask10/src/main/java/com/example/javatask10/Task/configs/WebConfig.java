package com.example.javatask10.Task.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry) {
        String location = System.getProperty("user.home")
                + File.separator + "javaImg" + File.separator;

        registry.addResourceHandler("/pic/**").addResourceLocations("file:" + location);
    }

}
