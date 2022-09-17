package com.example.yuenandemo1.M1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("T_Key_Article")
public class TKeyArticle implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String keyWord;

    private String forumId;

    private String recuritId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }

    public String getRecuritId() {
        return recuritId;
    }

    public void setRecuritId(String recuritId) {
        this.recuritId = recuritId;
    }

    @Override
    public String toString() {
        return "TKeyArticle{" +
        "id=" + id +
        ", keyWord=" + keyWord +
        ", forumId=" + forumId +
        ", recuritId=" + recuritId +
        "}";
    }
}
