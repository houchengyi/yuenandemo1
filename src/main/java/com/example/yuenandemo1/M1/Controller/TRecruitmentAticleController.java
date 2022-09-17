package com.example.yuenandemo1.M1.Controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yuenandemo1.M1.Service.TRecruitmentAticleService;
import com.example.yuenandemo1.M1.Util.ImageUtils;
import com.example.yuenandemo1.M1.common.Imagdata;
import com.example.yuenandemo1.M1.common.SelectReturnObject;
import com.example.yuenandemo1.M1.entity.TRecruitmentAticle;
import com.google.gson.JsonObject;
import com.qiniu.storage.model.BucketReferAntiLeech;
import jdk.nashorn.internal.ir.IfNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
@RestController
@RequestMapping("/trecruitmentaticle")
public class TRecruitmentAticleController {
    @Autowired
    private  TRecruitmentAticleService tRecruitmentAticleService;

    @GetMapping("/{currentpage}/{pageSize}")
    @CrossOrigin(origins = "*")
    public IPage getallorpage(@PathVariable("currentpage") Integer currentpage, @PathVariable("pageSize") Integer pageSzie){
        System.out.println("分页初始化");
        IPage page = new Page(currentpage,pageSzie);
        IPage iPage = tRecruitmentAticleService.page(page, null);

        /**
         * 如果当前页面值大于了总页码数值 从新操作,使用最大页码数值作为当前页码
         */
        if (currentpage >iPage.getPages()){
            page = new Page(iPage.getPages(),pageSzie);
            iPage = tRecruitmentAticleService.page(page, null);
        }
        return iPage;
    }
    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public  Object getById(@PathVariable("id") int id){

        TRecruitmentAticle TRecruitmentAticle =tRecruitmentAticleService.getById(id);

        return  TRecruitmentAticle;
    }

    /**
     * 根据内容查询
     * 批量查询携带参数这里用post请求
     * @param idlist
     * @return
     */
    @PostMapping("/batchid")
    @CrossOrigin(origins = "*")
    public SelectReturnObject getbatch(@RequestBody Integer[] idlist){
        SelectReturnObject returnObject = new SelectReturnObject();
        //运用工具降序排序 心记录在前
        Arrays.sort(idlist, Collections.reverseOrder());
        returnObject.setIds(idlist);
        System.out.println(idlist);
        /**
         * 传入id集合给封装好的方法批量查询 然后把查询集合返回给前端
         * 然后覆盖record
         */
        List<TRecruitmentAticle> bybatchid = tRecruitmentAticleService.getBybatchid(idlist);
        returnObject.setSelectList(bybatchid);
        returnObject.setSize(bybatchid.size());
        return  returnObject;
    }

    /**
     * 修改
     * @param
     * @return
     */
    @PutMapping("/update")
    @CrossOrigin(origins = "*")
    public Object update(@RequestBody TRecruitmentAticle TRecruitmentAticle){
        System.out.println("调用======修改方法========");
        System.out.println(TRecruitmentAticle);
        boolean b = tRecruitmentAticleService.updateById(TRecruitmentAticle);
        if (b==true){
            return  b;

        }else {
            return  b;
        }

    }
    @PostMapping("/save")
    /**
     * 因为前端传递的是json对象 需要requestbody 解析到参数上
     */
    @CrossOrigin(origins = "*")
    public  Object save(@RequestBody TRecruitmentAticle TRecruitmentAticle){

        boolean b = tRecruitmentAticleService.save(TRecruitmentAticle);
        if (b==true){

            return b;

        }
        return  false ;
    }
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public boolean deletebyid(@PathVariable("id") int id){

        if (id!=0){
            if( tRecruitmentAticleService.removeById(id)==true){
                boolean r =true;
                return r;
            }
        }
   //回馈前端是否返回成功
        return  false;
    }

    @Autowired
    private ImageUtils imageUtils;
    @CrossOrigin
    @PostMapping("/image/upload/{id}")
    public void uploadImage(@RequestParam(value = "file",required = false) MultipartFile[] multipartFile,@PathVariable("id") int id) {

        /**
         * 七牛云上传接口
         * 传入文件数组 进入工具类 返回一个链接
         * 9.2计划俩个接口 一个负责存放投降 一哥存放图文
         * 页面写俩个就好
         *
         */
//      需要添加的外链接

        System.out.println("调用id="+id);
        if (id!=0) {
            //新建实体类
            TRecruitmentAticle tr = new TRecruitmentAticle();
            //绑定对应记录
            tr.setId(id);
            if (multipartFile != null) {
                    //上传操作
                Map<String, List<String>> uploadImagesUrl = imageUtils.uploadImages(multipartFile);
                /**
                 * 外链接组
                 */
                List<String> urls = uploadImagesUrl.get("imageUrl");

                //读取存储的单挑或者多条是数据

                for (int i = 0; i < urls.size(); i++) {
                    String url="";
                    if (urls.size()==1){
                        url=urls.get(0);
                    }
                    else{
                        url+=urls.get(i)+",";
                    }
                    tr.setImgUrl(url);
                }

                tRecruitmentAticleService.updateById(tr);
            }
        }





    }

    
}

