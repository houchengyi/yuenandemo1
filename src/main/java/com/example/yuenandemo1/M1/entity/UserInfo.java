package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
@TableName("User_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "uuid", type = IdType.AUTO)
    private Integer uuid;

    private String username;

    private String password;

    private String avartImg;

    private String phoneNumber;

    private Integer status;

    private String readInfo;

    private String favorit;

    private LocalDateTime registTime;

    private String articleInfo;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvartImg() {
        return avartImg;
    }

    public void setAvartImg(String avartImg) {
        this.avartImg = avartImg;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReadInfo() {
        return readInfo;
    }

    public void setReadInfo(String readInfo) {
        this.readInfo = readInfo;
    }

    public String getFavorit() {
        return favorit;
    }

    public void setFavorit(String favorit) {
        this.favorit = favorit;
    }

    public LocalDateTime getRegistTime() {
        return registTime;
    }

    public void setRegistTime(LocalDateTime registTime) {
        this.registTime = registTime;
    }

    public String getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        "uuid=" + uuid +
        ", username=" + username +
        ", password=" + password +
        ", avartImg=" + avartImg +
        ", phoneNumber=" + phoneNumber +
        ", status=" + status +
        ", readInfo=" + readInfo +
        ", favorit=" + favorit +
        ", registTime=" + registTime +
        ", articleInfo=" + articleInfo +
        "}";
    }
}
