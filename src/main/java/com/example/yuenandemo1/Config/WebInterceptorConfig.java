package com.example.yuenandemo1.Config;


import com.example.yuenandemo1.M1.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
    public class WebInterceptorConfig implements WebMvcConfigurer {

        @Autowired
        private LoginInterceptor interceptor;

    /**
     * 添加拦截器并且设置地址所于后期的时候需要优化
     * Pattern 以及拦截器
     * 没啥用
     * @param registry
     */
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            // 添加拦截器，配置拦截地址
            registry.addInterceptor(interceptor).addPathPatterns("/yuenan/**").excludePathPatterns("");
        }
    }


