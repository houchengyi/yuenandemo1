package com.example.yuenandemo1;



import com.example.yuenandemo1.M1.Service.TRecruitmentAticleService;
import com.example.yuenandemo1.M1.entity.TRecruitmentAticle;
import com.example.yuenandemo1.M1.mappers.demotestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Yuenandemo1ApplicationTests {

    @Autowired
    private TRecruitmentAticleService tRecruitmentAticleService;
    /**
     * 测试批量查询
     */
    @Test
    void contextLoads() {

        Integer[] idlist={810,
                741,
                826,
                756,
                660,
                53,
                527,
                521,
                588,
                789};
        List<TRecruitmentAticle> bybatchid1 = tRecruitmentAticleService.getBybatchid(idlist);

        bybatchid1.forEach(System.out::println);
    }

}
