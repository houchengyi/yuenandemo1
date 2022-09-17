package com.example.yuenandemo1.M1.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yuenandemo1.M1.entity.User;

import java.util.Map;

public interface logintest extends IService<User> {
  User  queryUserByLoginActAndPwd(Map<String,Object> map);
}
