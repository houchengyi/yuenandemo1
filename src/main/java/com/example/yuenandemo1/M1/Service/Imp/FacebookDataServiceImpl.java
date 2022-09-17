package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.yuenandemo1.M1.Service.FacebookDataService;
import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.demotest;
import com.example.yuenandemo1.M1.mappers.FacebookDataMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * facebook采集数据 服务实现类
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
@Service
public class FacebookDataServiceImpl extends ServiceImpl<FacebookDataMapper, FacebookData> implements FacebookDataService {
    @Autowired
    private FacebookDataMapper facebookDataMapper;
    @Override
     public IPage<FacebookData> getPage(Integer currentpage, Integer pageSize, FacebookData facebookData){
        IPage page = new Page(currentpage,pageSize);
        QueryWrapper<FacebookData> lqw = new QueryWrapper<FacebookData>();
        lqw.like("KeyWords",facebookData.getKeyWords()).or().like("ChineseContent",facebookData.getChineseContent()).
                or().like("Status",facebookData.getStatus()).or().like("CatchTime",facebookData.getCatchTime());
//        LambdaQueryWrapper<FacebookData> lqw = new LambdaQueryWrapper<FacebookData>();
//
//        lqw.like(Strings.isNotEmpty(facebookData.getKeyWords()),FacebookData::getKeyWords,facebookData.getKeyWords());
//        lqw.like(Strings.isNotEmpty(facebookData.getChineseContent()),FacebookData::getChineseContent,facebookData.getChineseContent());
//        lqw.like(Strings.isNotEmpty(facebookData.getCatchTime().toString()),FacebookData::getCatchTime,facebookData.getCatchTime());
//        lqw.like(Strings.isNotEmpty(facebookData.getStatus().toString()),FacebookData::getStatus,facebookData.getStatus());
        facebookDataMapper.selectPage(page, lqw);

        return facebookDataMapper.selectPage(page, lqw);
    }

}
