package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
@TableName("T_foum")
public class TFoum implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("Status")
    private Integer Status;

    @TableField("Key_word")
    private String keyWord;

    @TableField("Class")
    private Integer Class;

    @TableField("Time_view")
    private Integer timeView;

    @TableField("Time_share")
    private Integer timeShare;

    @TableField("C_Content")
    private String cContent;

    @TableField("V_Content")
    private String vContent;

    @TableField("Avatar_URL")
    private String avatarUrl;

    @TableField("Username")
    private String Username;

    private String uuid;

    @TableField("In_Date")
    private String inDate;

    /**
     * 该文配图的连接
     */
    @TableField("Img_url")
    private String imgUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }



    public void setClass(Integer Class) {
        this.Class = Class;
    }

    public Integer getTimeView() {
        return timeView;
    }

    public void setTimeView(Integer timeView) {
        this.timeView = timeView;
    }

    public Integer getTimeShare() {
        return timeShare;
    }

    public void setTimeShare(Integer timeShare) {
        this.timeShare = timeShare;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "TFoum{" +
        "id=" + id +
        ", Status=" + Status +
        ", keyWord=" + keyWord +
        ", Class=" + Class +
        ", timeView=" + timeView +
        ", timeShare=" + timeShare +
        ", cContent=" + cContent +
        ", vContent=" + vContent +
        ", avatarUrl=" + avatarUrl +
        ", Username=" + Username +
        ", uuid=" + uuid +
        ", inDate=" + inDate +
        ", imgUrl=" + imgUrl +
        "}";
    }
}
