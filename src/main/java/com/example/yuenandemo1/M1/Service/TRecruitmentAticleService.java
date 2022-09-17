package com.example.yuenandemo1.M1.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;


import com.example.yuenandemo1.M1.entity.TRecruitmentAticle;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
public interface TRecruitmentAticleService extends IService<TRecruitmentAticle> {
    public IPage<TRecruitmentAticle> getPage(Integer currentpage, Integer pageSize, TRecruitmentAticle tRecruitmentAticle);
    public List<TRecruitmentAticle> getBybatchid(Integer[] idlist);
}
