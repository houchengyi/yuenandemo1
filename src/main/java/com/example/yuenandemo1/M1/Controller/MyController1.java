package com.example.yuenandemo1.M1.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yuenandemo1.M1.Service.demotestService;
import com.example.yuenandemo1.M1.entity.demotest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demotest")

public class MyController1 {

    @Autowired
    private demotestService service;

    /**
     * 初始所有数据
     */
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<demotest> geiAll(){
        List<demotest> list = service.list();
        return list;
    }

    @GetMapping("/{currentpage}/{pageSize}")
    @CrossOrigin(origins = "*")
    public  IPage getallorpage(@PathVariable("currentpage") Integer currentpage,@PathVariable("pageSize") Integer pageSzie){

        IPage page = new Page(currentpage,pageSzie);
        IPage iPage = service.page(page, null);
        /**
         * 如果当前页面值大于了总页码数值 从新操作,使用最大页码数值作为当前页码
         */
        if (currentpage >iPage.getPages()){
            page = new Page(iPage.getPages(),pageSzie);
        }
        return iPage;
    }

    @GetMapping("select/{currentpage}/{pageSize}")
    @CrossOrigin(origins = "*")
public  IPage getallorpage(@PathVariable("currentpage") Integer currentpage, @PathVariable("pageSize") Integer pageSize,demotest demotest){
    System.out.println("调用了模糊查询");
    System.out.println("参数=====>"+demotest);
    IPage<demotest> page = service.getPage(currentpage,pageSize,demotest);
        System.out.println("测试结构+="+page.getRecords());
    return page;

}
    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public  Object getById(@PathVariable int id){
        demotest demo = service.getById(id);

        return  demo;
    }
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public boolean delete(@PathVariable("id") int id){
        System.out.println("用id删除已经调用"+id);
        if (id!=0){
            if( service.deletebyid(id)!=0){
                boolean r =true;
                return r;
            }
        }

        return  false;
    }
    @PostMapping("/save")
    /**
     * 因为前端传递的是json对象 需要requestbody 解析到参数上
     */
    @CrossOrigin(origins = "*")
    public  Object save(@RequestBody demotest demotest){

        boolean b = service.save(demotest);


        return  b ;
    }
    @PutMapping("/update")
    @CrossOrigin(origins = "*")
    public Object update(@RequestBody demotest demo){
        System.out.println("调用==============");
        System.out.println(demo);
        boolean b = service.updateById(demo);

        return  b;
    }


}
