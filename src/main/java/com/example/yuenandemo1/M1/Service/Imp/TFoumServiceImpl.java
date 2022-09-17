package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yuenandemo1.M1.Service.TFoumService;
import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.TFoum;
import com.example.yuenandemo1.M1.mappers.FacebookDataMapper;
import com.example.yuenandemo1.M1.mappers.TFoumMapper;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class TFoumServiceImpl extends ServiceImpl<TFoumMapper, TFoum> implements TFoumService {
    @Override
    public boolean saveBatch(Collection<TFoum> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TFoum> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TFoum> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TFoum entity) {
        return false;
    }

    @Override
    public TFoum getOne(Wrapper<TFoum> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TFoum> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<TFoum> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }


    @Override
    public Class<TFoum> getEntityClass() {
        return null;
    }
}
