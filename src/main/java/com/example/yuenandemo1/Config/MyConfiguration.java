package com.example.yuenandemo1.Config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 解决跨域问题  MybatiesPlus分页拦截器
 * 很多插件和过滤器拦截器在spring中是通过xml配置形成注册
 * springboot省去了这一繁琐流程所以需要在Configuration
 * 配置类中注册
 * 分页面拦截器
 * 在springboot注解开发中拦截器都是在配置文件中申明这个bean
 * 然后 由对应部分的拦截器容器添加
 */

@Configuration
public class MyConfiguration {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        /**
         * 上述代码第一行是创建MyBatisPlus的拦截器栈，这个时候拦截器栈中没有具体的拦截器
         * 第二行是初始化了分页拦截器，并添加到拦截器栈中。
         * 如果后期开发其他功能，需要添加全新的拦截器，按照第二行的格式继续add进去新的拦截器就可以了。
         * **总结**
         * 1. 使用IPage封装分页数据
         * 2. 分页操作依赖MyBatisPlus分页拦截器实现功能
         * 3. 借助MyBatisPlus日志查阅执行SQL语句
         */
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
     }


    }

