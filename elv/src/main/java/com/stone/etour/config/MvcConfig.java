package com.stone.etour.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // AnnotationConfigApplicationContext、AnnotationConfigWebApplicationContext
public class MvcConfig implements WebMvcConfigurer {

    /**
     * <mvc:resource location="" mapping=""/>
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pic/**") // mapping属性
           .addResourceLocations("file:d:/upload/"); // location

    }
    /**
     * <mvc:view-controller path="/index" view-name="index" />
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login")
                .setViewName("login");
    }
}
