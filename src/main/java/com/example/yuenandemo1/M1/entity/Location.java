package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("T_Location")
public class Location {
    /**
     * 地区状态码
     */
    @TableId("id_T_Location")
    private int locationCode;
    /**
     * 文章映射id
     */
    @TableField("Aticle_id")
    private String aticleId;
}
