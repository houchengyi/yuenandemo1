package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.yuenandemo1.M1.Service.demotestService;
import com.example.yuenandemo1.M1.entity.demotest;
import com.example.yuenandemo1.M1.mappers.demotestMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class demotestServiceImpl  extends ServiceImpl<demotestMapper,demotest> implements demotestService {
    @Autowired
    public demotestMapper mapper;



    public Class<demotest> getEntityClass() {
        return null;
    }




    @Override
    public int deletebyid(int id) {
        return mapper.deleteById(id);
    }

    @Override
/**
 * Strings.isNotEmpty(querydemotest.getAvartUrl())布尔值 先经行判定是否为空
 * 然后实体类 ::get属性,和参数传递的属性是否想
 * LambdaQueryWrapper<demotest> lqw表达公式
 */
        public IPage<demotest> getPage(Integer currentPage,Integer pageSize,demotest querydemotest){
            IPage page = new Page(currentPage,pageSize);
            LambdaQueryWrapper<demotest> lqw = new LambdaQueryWrapper<demotest>();
            lqw.like(Strings.isNotEmpty(querydemotest.getAvartUrl()),demotest::getAvartUrl,querydemotest.getAvartUrl());
            lqw.like(Strings.isNotEmpty(querydemotest.getTitle()),demotest::getTitle,querydemotest.getTitle());
            lqw.like(Strings.isNotEmpty(querydemotest.getContent()),demotest::getContent,querydemotest.getContent());
            lqw.like(Strings.isNotEmpty(querydemotest.getClassify()),demotest::getClassify,querydemotest.getClassify());
         mapper.selectPage(page, lqw);

        return mapper.selectPage(page, lqw);
    }




}
