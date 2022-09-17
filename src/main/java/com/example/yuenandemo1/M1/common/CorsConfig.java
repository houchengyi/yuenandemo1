package com.example.yuenandemo1.M1.common;

import com.example.yuenandemo1.M1.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * 将登陆拦截器写入配置类
 */
import java.util.Arrays;

        @Configuration
        public class CorsConfig implements WebMvcConfigurer {

            @Bean
            public CorsFilter corsFilter(){
                final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                final CorsConfiguration config = new CorsConfiguration();
                config.setAllowCredentials(true);
                config.setAllowedHeaders(Arrays.asList("*"));
                config.setAllowedOrigins(Arrays.asList("*"));
                config.setAllowedMethods(Arrays.asList("*"));
                config.setMaxAge(10000L);
                source.registerCorsConfiguration("/**", config);
                return new CorsFilter(source);
            }
            @Autowired
            private LoginInterceptor myInterceptor;

//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(this.myInterceptor).addPathPatterns("/**");
//            }
        }





