package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("demotest")

public class demotest{
    private  int id;
    private  String content;
    private String title;
    private String classify;
    private  String bannerFlag;
    private String avartUrl;

    @Override
    public String toString() {
        return "demotest{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", classify='" + classify + '\'' +
                ", bannerFlag='" + bannerFlag + '\'' +
                ", avartUrl='" + avartUrl + '\'' +
                '}';
    }

    public demotest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getBannerFlag() {
        return bannerFlag;
    }

    public void setBannerFlag(String bannerFlag) {
        this.bannerFlag = bannerFlag;
    }

    public String getAvartUrl() {
        return avartUrl;
    }

    public void setAvartUrl(String avartUrl) {
        this.avartUrl = avartUrl;
    }
}
