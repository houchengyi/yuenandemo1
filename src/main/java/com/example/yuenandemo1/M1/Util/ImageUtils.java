package com.example.yuenandemo1.M1.Util;

import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 图片上传工具类
 */
@Component
public class ImageUtils {


    @Value("${qiniu.accessKey}")
    private  String accessKey;      //公钥
    @Value("${qiniu.secretKey}")
    private  String accessSecretKey;   //私钥
    @Value("${qiniu.bucketName}")
    private  String bucket;   // 存储空间
    @Value("${qiniu.imageUrl}")
    private String url;

    /**
     * 处理多文件
     * @param multipartFiles
     * @return
     */
    public Map<String, List<String>> uploadImages(MultipartFile[] multipartFiles){
        Map<String, List<String>> map = new HashMap<>();
        List<String> imageUrls = new ArrayList<>();
        /**
         * for循环实现存储多个
         */
        for(MultipartFile file : multipartFiles){
            imageUrls.add(uploadImageQiniu(file));
        }
        /**
         * 返回map 里面存储图片链接
         */
        map.put("imageUrl",imageUrls);
        return map;
    }

    /**
     * 上传图片到七牛云
     * @param multipartFile
     * @return
     */
    private String uploadImageQiniu(MultipartFile multipartFile){
        try {
            //1、获取文件上传的流
            byte[] fileBytes = multipartFile.getBytes();
            //2、创建日期目录分隔
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//            String datePath = dateFormat.format(new Date());
            //时间格式化格式
            /**
             * 现在改用当前时间戳
             */
            SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyyMMddHHmmssSSS");
            //获取当前时间并作为时间戳给文件夹命名
            String timeStamp1=simpleDateFormat.format(new Date());

            //3、获取文件名
            String originalFilename = multipartFile.getOriginalFilename();

            /**
             * String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
             * 原来是uuid然后使用这个
             * 加前后追String filename = datePath+"/"+ UUID.randomUUID().toString().replace("-", "")+ suffix;
             */
            String filename=   Md5Util.getMd5(originalFilename)+timeStamp1;

            //4.构造一个带指定 Region 对象的配置类
            //Region.南(根据自己的对象空间的地址选
            Configuration cfg = new Configuration(Region.huanan());
            UploadManager uploadManager = new UploadManager(cfg);

            //5.获取七牛云提供的 token
            Auth auth = Auth.create(accessKey, accessSecretKey);
            String upToken = auth.uploadToken(bucket);

            uploadManager.put(fileBytes,filename,upToken);
//这里问题出现在七牛云路径和文件名之间是有"/"的
            return url+"/"+filename;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}