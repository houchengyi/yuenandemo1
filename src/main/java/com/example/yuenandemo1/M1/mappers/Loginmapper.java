package com.example.yuenandemo1.M1.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yuenandemo1.M1.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;
@Mapper
public interface Loginmapper extends BaseMapper<User> {
    public User selectUserByLoginActAndPwd(Map<String,Object> map);
}
