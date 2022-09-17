package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yuenandemo1.M1.Service.TRecruitmentAticleService;

import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.TRecruitmentAticle;
import com.example.yuenandemo1.M1.mappers.FacebookDataMapper;
import com.example.yuenandemo1.M1.mappers.TRecruitmentAticleMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;

/**
 * MP中对基础的crud在每个层都经行了封装
 * service  继承了extends IService<对应的实体类>
 *     其实现类继承了对应的封装类 extends ServiceImpl<实体类mapper,实体类>
 *
 */
@Service
public class TRecruitmentAticleServiceImpl  extends ServiceImpl<TRecruitmentAticleMapper,TRecruitmentAticle> implements TRecruitmentAticleService {
    @Autowired
   private TRecruitmentAticleMapper mapper;
    @Override
    public boolean saveBatch(Collection<TRecruitmentAticle> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TRecruitmentAticle> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TRecruitmentAticle> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TRecruitmentAticle entity) {
        return false;
    }

    @Override
    public TRecruitmentAticle getOne(Wrapper<TRecruitmentAticle> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TRecruitmentAticle> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<TRecruitmentAticle> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }



    @Override
    public Class<TRecruitmentAticle> getEntityClass() {
        return null;
    }
    @Override
    public IPage<TRecruitmentAticle> getPage(Integer currentpage, Integer pageSize, TRecruitmentAticle tRecruitmentAticle){
        IPage page = new Page(currentpage,pageSize);
        LambdaQueryWrapper<TRecruitmentAticle> lqw = new LambdaQueryWrapper<TRecruitmentAticle>();
        lqw.like(Strings.isNotEmpty(tRecruitmentAticle.getCContent()),TRecruitmentAticle::getCContent,tRecruitmentAticle.getCContent());
        lqw.like(Strings.isNotEmpty(tRecruitmentAticle.getUserName()),TRecruitmentAticle::getUserName,tRecruitmentAticle.getUserName());
        lqw.like(Strings.isNotEmpty(tRecruitmentAticle.getKeyWord()),TRecruitmentAticle::getKeyWord,tRecruitmentAticle.getKeyWord());
        lqw.like(Strings.isNotEmpty(tRecruitmentAticle.getFCrawle().toString()),TRecruitmentAticle::getFCrawle,tRecruitmentAticle.getFCrawle());
        lqw.like(Strings.isNotEmpty(tRecruitmentAticle.getStatus().toString()),TRecruitmentAticle::getStatus,tRecruitmentAticle.getStatus());

        mapper.selectPage(page, lqw);

        return mapper.selectPage(page, null);
    }

    @Override
    public List<TRecruitmentAticle> getBybatchid(Integer[] idlist) {
        /**
         *因为底层只能用list实批量操作 所以需要数组工具类经行转换
         */

        List<TRecruitmentAticle> tRecruitmentAticles = mapper.selectBatchIds(Arrays.asList(idlist));
        System.out.println("id长度"+Arrays.asList(idlist).size()+"\t"+tRecruitmentAticles);
        return tRecruitmentAticles;
    }
}
