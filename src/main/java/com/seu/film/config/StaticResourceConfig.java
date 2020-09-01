package com.seu.film.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class StaticResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //static 文件夹
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        //指定盘符下 D：film
        registry.addResourceHandler("/resource/**")
                .addResourceLocations("file:D:/film/");
    }
}
