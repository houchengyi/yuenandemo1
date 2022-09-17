package com.example.yuenandemo1.M1.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yuenandemo1.M1.entity.demotest;


public interface demotestService extends IService<demotest> {


    int deletebyid(int id);
//IPage<demotest> getPage(IPage page, Wrapper queryWrapper,demotest demotest);

    IPage<demotest> getPage(Integer currentPage,Integer pageSize,demotest querydemotest);



}
