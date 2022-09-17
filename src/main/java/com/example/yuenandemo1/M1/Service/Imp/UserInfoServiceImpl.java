package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yuenandemo1.M1.Service.UserInfoService;
import com.example.yuenandemo1.M1.entity.UserInfo;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public boolean saveBatch(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(UserInfo entity) {
        return false;
    }

    @Override
    public UserInfo getOne(Wrapper<UserInfo> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<UserInfo> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<UserInfo> getBaseMapper() {
        return null;
    }

    @Override
    public Class<UserInfo> getEntityClass() {
        return null;
    }
}
