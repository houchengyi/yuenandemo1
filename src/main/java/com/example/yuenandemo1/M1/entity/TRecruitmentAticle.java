package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 设置作者名字
 * @since 2022-08-21
 */
@Data
@TableName("T_recruitment_Aticle")
public class TRecruitmentAticle implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 设置为1前端用户可见，0则不被呈现给前端用户
     */
    @TableField("Status")
    private Integer Status;

    /**
     * 该文的关键词，用于筛选
     */
    @TableField("Key_word")
    private String keyWord;

    /**
     * 该文的类别用于后期分类与推荐
     */
    @TableField("Class")
    private Integer rClass;

    /**
     * 被浏览次数
     */
    @TableField("Times_view")
    private Integer timesView;

    /**
     * 被分享次数
     */
    @TableField("Times_share")
    private Integer timesShare;

    /**
     * 文章内容中文
     */
    @TableField("C_Content")
    private String cContent;

    /**
     * 文章内容越南文
     */
    @TableField("V_Content")
    private String vContent;

    /**
     * 出现在首页的位置
     */
    @TableField("R_Sort")
    private Integer rSort;

    /**
     * 该文章用户的头像
     */
    @TableField("Avart_URL")
    private String avartUrl;

    /**
     * 该文章用户的昵称
     */
    @TableField("User_name")
    private String userName;

    /**
     * 是爬取的文章还是真实用户的发表的
     */
    @TableField("F_crawle")
    private Integer fCrawle;

    /**
     * 用户在Tuser表中的id
     */
    @TableField("UUID")
    private Integer uuid;

    /**
     * 入库时间时间戳形式
     */
    @TableField("In_Date")
    private String inDate;

    /**
     * 该文配图的连接
     */
    @TableField("Img_url")
    private String imgUrl;
    /**
     * 行业代码
     */
   @TableField("Industry")
    private int industry;
    /**
     * 招聘还是招人
     */
    @TableField("Recruit_apply")
    private int recruitApply;
    /**
     * 地区代码
     */
    @TableField("Location")
    private int location;
}
