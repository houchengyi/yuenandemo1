package com.example.yuenandemo1.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 前端和后台的跨域问题
 */
@Configuration
public class crosConfig implements WebMvcConfigurer {


        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins("*")
                    .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
                    .allowCredentials(true).maxAge(3600);
        }

}
