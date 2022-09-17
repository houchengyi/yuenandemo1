package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yuenandemo1.M1.Service.TKeyArticleService;
import com.example.yuenandemo1.M1.entity.TKeyArticle;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class TKeyArticleServiceImpl implements TKeyArticleService {
    @Override
    public boolean saveBatch(Collection<TKeyArticle> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TKeyArticle> entityList, int batchSize) {
        return false;
    }

    public boolean updateBatchById(Collection<TKeyArticle> entityList) {
        return TKeyArticleService.super.updateBatchById(entityList);
    }

    @Override
    public boolean updateBatchById(Collection<TKeyArticle> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TKeyArticle entity) {
        return false;
    }

    @Override
    public TKeyArticle getOne(Wrapper<TKeyArticle> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TKeyArticle> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<TKeyArticle> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<TKeyArticle> getBaseMapper() {
        return null;
    }

    @Override
    public Class<TKeyArticle> getEntityClass() {
        return null;
    }
}
