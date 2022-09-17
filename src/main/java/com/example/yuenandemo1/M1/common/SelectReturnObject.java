package com.example.yuenandemo1.M1.common;

import com.example.yuenandemo1.M1.entity.TRecruitmentAticle;
import lombok.Data;

import java.util.List;

/**
 * 版本控制工具
 * 避免个人开发重涂  把文件拉到本地经行
 * 当查询到后期的时候突然
 * 发现仅仅是返回一个list集合以及不能满足需求了
 * 所以需要自定以返回对象
 */
@Data
public class SelectReturnObject {
    /**
     * 查询的结果返回值
     */
    private List<TRecruitmentAticle> selectList;
    /**
     * 记录大小方便查询
     */
    private int size;
    /**
     * 给到查询结果集 方便挨个修改
     */
    private Integer[] ids;

}
