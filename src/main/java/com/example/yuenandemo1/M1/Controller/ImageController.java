package com.example.yuenandemo1.M1.Controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.example.yuenandemo1.M1.Util.ImageUtils;
import com.example.yuenandemo1.M1.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**

 */
@RestController
@RequestMapping("/api")
public class ImageController {
   private String msg;
    @Autowired
    private ImageUtils imageUtils;
@CrossOrigin
    @PostMapping("/image/upload")
    public Map<String, List<String>> uploadImage(@RequestParam(value = "file",required = false) MultipartFile[] multipartFile) {

    /**
     * 传入文件数组 进入工具类 返回一个链接
     * 9.2计划俩个接口 一个负责存放投降 一哥存放图文
     * 页面写俩个就好
     */

    Map<String, List<String>> stringListMap = imageUtils.uploadImages(multipartFile);
    Map<String, List<String>> uploadImagesUrl = stringListMap;
    System.out.println("图片链接是" + uploadImagesUrl.get("imageUrl"));
    //连链
    return uploadImagesUrl;

      }

}