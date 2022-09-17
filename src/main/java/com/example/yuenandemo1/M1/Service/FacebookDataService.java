package com.example.yuenandemo1.M1.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.demotest;

/**
 * <p>
 * facebook采集数据 服务类
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
public interface FacebookDataService extends IService<FacebookData> {

   public IPage<FacebookData> getPage(Integer currentpage, Integer pageSize, FacebookData facebookData);
}
