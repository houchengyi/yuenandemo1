package com.example.yuenandemo1.M1.Controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yuenandemo1.M1.Service.FacebookDataService;
import com.example.yuenandemo1.M1.Util.ImageUtils;
import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.demotest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * facebook采集数据 前端控制器
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */


@RestController
@RequestMapping("/facebook-data")
public class FacebookDataController {
    @Autowired
    private FacebookDataService  facebookDataService;
    @GetMapping("/{currentpage}/{pageSize}")
    @CrossOrigin(origins = "*")
    public IPage getallorpage(@PathVariable("currentpage") Integer currentpage, @PathVariable("pageSize") Integer pageSzie){

        IPage page = new Page(currentpage,pageSzie);
        IPage iPage = facebookDataService.page(page, null);
        /**
         * 如果当前页面值大于了总页码数值 从新操作,使用最大页码数值作为当前页码
         */
        if (currentpage >iPage.getPages()){
            page = new Page(iPage.getPages(),pageSzie);
        }
        return iPage;
    }
    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public  Object getById(@PathVariable("id") int id){

        FacebookData facebookData = facebookDataService.getById(id);
        System.out.println("得到数据+="+facebookData);
        return  facebookData;
    }

    /**
     * 修改
     * @param
     * @return
     */
    @PutMapping("/update")
    @CrossOrigin(origins = "*")
    public Object update(@RequestBody FacebookData facebookData){

        System.out.println(facebookData);
        boolean b = facebookDataService.updateById(facebookData);
        if (b==true){
            return  b;

        }else {return  b;}

    }
    @PostMapping("/save")
    /**
     * 因为前端传递的是json对象 需要requestbody 解析到参数上
     */
    @CrossOrigin(origins = "*")
    public  Object save(@RequestBody FacebookData facebookData){

        boolean b = facebookDataService.save(facebookData);
        if (b==true){
            return b;

        }
        return  false ;
    }
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public boolean delete(@PathVariable("id") int id){

        if (id!=0){
            if( facebookDataService.removeById(id)==true){
                boolean r =true;
                return r;
            }
        }

        return  false;
    }
    @GetMapping("select/{currentpage}/{pageSize}")
    @CrossOrigin(origins = "*")
    public  IPage getallorpage(@PathVariable("currentpage") Integer currentpage, @PathVariable("pageSize") Integer pageSize,FacebookData facebookData){
        System.out.println("调用了模糊查询");
        System.out.println("参数=====>"+facebookData);

        IPage<FacebookData> page = facebookDataService.getPage(currentpage,pageSize,facebookData);
        System.out.println("测试结构+="+page.getRecords());
        return page;

    }

    /**
     *引入工具类
     */
    @Autowired
    private ImageUtils imageUtils;
    @CrossOrigin
    @PostMapping("/image/upload")
    public void uploadImage(@RequestParam(value = "file",required = false) MultipartFile[] multipartFile) {

        /**
         * 传入文件数组 进入工具类 返回一个链接
         */

        Map<String, List<String>> stringListMap = imageUtils.uploadImages(multipartFile);
        Map<String, List<String>> uploadImagesUrl = stringListMap;
        System.out.println("图片链接是" + uploadImagesUrl.get("imageUrl"));


    }
}

