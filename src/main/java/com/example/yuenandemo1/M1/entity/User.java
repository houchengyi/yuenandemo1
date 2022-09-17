package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
@Data

public class User {
    @TableId(value = "id", type = IdType.AUTO)
   private Integer id;
    @TableField("user_name")
    private  String username;
    @TableField("password")
    private String password;
    @TableField("status")
    private String status;
}
