package com.example.yuenandemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 因为基础的crud 就用MP的mapper操作 需要分页或者其他要求的用myMapper
 */
@MapperScan("com.example.yuenandemo1.M1.mappers")
@SpringBootApplication
public class Yuenandemo1Application {

    public static void main(String[] args) {
/**
 * ConfigurableApplicationContext context
 * 是整个springboot的ioc容器 在里面可以获取注册的bean
 *
 */
        ConfigurableApplicationContext context = SpringApplication.run(Yuenandemo1Application.class, args);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("注册的组件有="+beanDefinitionNames);
    }

}
