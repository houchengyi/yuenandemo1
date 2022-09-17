package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yuenandemo1.M1.Service.LocationService;
import com.example.yuenandemo1.M1.entity.Location;
import com.example.yuenandemo1.M1.mappers.LocationMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper,Location> implements LocationService {
    public boolean saveBatch(Collection<Location> entityList, int batchSize) {
        return false;
    }

    public boolean saveOrUpdateBatch(Collection<Location> entityList, int batchSize) {
        return false;
    }

    public boolean updateBatchById(Collection<Location> entityList, int batchSize) {
        return false;
    }

    public boolean saveOrUpdate(Location entity) {
        return false;
    }

    public Location getOne(Wrapper<Location> queryWrapper, boolean throwEx) {
        return null;
    }

    public Map<String, Object> getMap(Wrapper<Location> queryWrapper) {
        return null;
    }

    public <V> V getObj(Wrapper<Location> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }



    public Class<Location> getEntityClass() {
        return null;
    }
}
