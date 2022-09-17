package com.example.yuenandemo1.Config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * 逆向工程代码生成器
 */
public class generator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
   //输出目录
        gc.setOutputDir("D:/SSMcode/SpringBoot/yuenandemo1/src/main/java");
        //作者
        gc.setAuthor("");
        //打开输出目录
        gc.setOpen(false);
        //xml开启 BaseResultMap
        gc.setBaseResultMap(true);
        //xml 开启BaseColumnList
        gc.setBaseColumnList(true);
        // 实体属性 Swagger2 注解
        gc.setSwagger2(true);
        gc.setControllerName("%sController");
        gc.setServiceName("%sService"); // 设置生成service
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://139.155.2.242:3306/yuenan_test?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.yuenandemo1.M1")
                .setEntity("entity")
                .setMapper("mappers")
                .setService("service")
                .setServiceImpl("service.imp")
                .setController("Controller")
                .setXml("mappers");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略，转驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.no_change);
        //lombok模型
        strategy.setEntityLombokModel(true);
        //生成 @RestController 控制器
        strategy.setRestControllerStyle(true);
        strategy.setInclude("account");
        strategy.setControllerMappingHyphenStyle(false);
        //表前缀
        strategy.setTablePrefix("");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}
