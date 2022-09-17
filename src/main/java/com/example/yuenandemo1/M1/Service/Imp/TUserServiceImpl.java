package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yuenandemo1.M1.Service.TUserService;
import com.example.yuenandemo1.M1.entity.TUser;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class TUserServiceImpl implements TUserService {
    @Override
    public boolean saveBatch(Collection<TUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TUser entity) {
        return false;
    }

    @Override
    public TUser getOne(Wrapper<TUser> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TUser> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<TUser> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<TUser> getBaseMapper() {
        return null;
    }

    @Override
    public Class<TUser> getEntityClass() {
        return null;
    }
}
