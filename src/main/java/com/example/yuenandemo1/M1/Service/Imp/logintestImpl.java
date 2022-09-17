package com.example.yuenandemo1.M1.Service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yuenandemo1.M1.Service.logintest;
import com.example.yuenandemo1.M1.entity.User;
import com.example.yuenandemo1.M1.mappers.Loginmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class logintestImpl  extends ServiceImpl<Loginmapper,User> implements logintest {
       @Autowired
    private Loginmapper loginmapper;

    @Override
    public User queryUserByLoginActAndPwd(Map<String, Object> map) {
        return loginmapper.selectUserByLoginActAndPwd(map);
    }
}
