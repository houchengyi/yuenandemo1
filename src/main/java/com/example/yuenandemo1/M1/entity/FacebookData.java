package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * <p>
 * facebook采集数据
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */

public class FacebookData implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动增长Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 状态： 1不允许呈现，2允许呈现
     */
    @TableField("Status")
    private Integer Status;

    /**
     * 关键词
     */
    @TableField("KeyWords")
    private String KeyWords;

    /**
     * 阅读数量
     */
    @TableField("ReadCount")
    private Integer ReadCount;

    /**
     * 分享次数
     */
    @TableField("ShareCount")
    private Integer ShareCount;

    /**
     * 置顶排序
     */
    @TableField("TopSort")
    private Integer TopSort;

    /**
     * 原内容
     */
    @TableField("Content")
    private String Content;

    /**
     * 中文内容
     */
    @TableField("ChineseContent")
    private String ChineseContent;

    /**
     * 采集时间，时间戳
     */
    @TableField("CatchTime")
    private Integer CatchTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getKeyWords() {
        return KeyWords;
    }

    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    public Integer getReadCount() {
        return ReadCount;
    }

    public void setReadCount(Integer ReadCount) {
        this.ReadCount = ReadCount;
    }

    public Integer getShareCount() {
        return ShareCount;
    }

    public void setShareCount(Integer ShareCount) {
        this.ShareCount = ShareCount;
    }

    public Integer getTopSort() {
        return TopSort;
    }

    public void setTopSort(Integer TopSort) {
        this.TopSort = TopSort;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getChineseContent() {
        return ChineseContent;
    }

    public void setChineseContent(String ChineseContent) {
        this.ChineseContent = ChineseContent;
    }

    public Integer getCatchTime() {
        return CatchTime;
    }

    public void setCatchTime(Integer CatchTime) {
        this.CatchTime = CatchTime;
    }

    @Override
    public String toString() {
        return "FacebookData{" +
        "Id=" + Id +
        ", Status=" + Status +
        ", KeyWords=" + KeyWords +
        ", ReadCount=" + ReadCount +
        ", ShareCount=" + ShareCount +
        ", TopSort=" + TopSort +
        ", Content=" + Content +
        ", ChineseContent=" + ChineseContent +
        ", CatchTime=" + CatchTime +
        "}";
    }
}
