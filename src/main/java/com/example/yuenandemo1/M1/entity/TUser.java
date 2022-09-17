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
@TableName("T_user")
public class TUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;

    /**
     * 1用户正常使用，2用户被禁用
     */
    @TableField("Status")
    private Integer Status;

    /**
     * 昵称
     */
    @TableField("Username")
    private String Username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户头像链接
     */
    @TableField("Avatr_URL")
    private String avatrUrl;

    /**
     * 发表的招聘文章id
     */
    @TableField("Issue_re")
    private String issueRe;

    /**
     * 发表的论坛文章id
     */
    @TableField("Issue_forum")
    private String issueForum;

    /**
     * 收藏的招聘文章id
     */
    @TableField("Collect_re")
    private String collectRe;

    /**
     * 收藏的论坛文章id
     */
    @TableField("Collect_forum")
    private String collectForum;

    /**
     * 历史阅读的招聘文章id
     */
    @TableField("Read_re")
    private String readRe;

    /**
     * 历史阅读的论坛文章id
     */
    @TableField("Read_forum")
    private String readForum;

    /**
     * 注册时间
     */
    @TableField("In_date")
    private String inDate;

    /**
     * 历史登录时间记录
     */
    @TableField("Histroy_date")
    private String histroyDate;

    /**
     * 评论过的论坛文章id
     */
    @TableField("Comment")
    private String Comment;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatrUrl() {
        return avatrUrl;
    }

    public void setAvatrUrl(String avatrUrl) {
        this.avatrUrl = avatrUrl;
    }

    public String getIssueRe() {
        return issueRe;
    }

    public void setIssueRe(String issueRe) {
        this.issueRe = issueRe;
    }

    public String getIssueForum() {
        return issueForum;
    }

    public void setIssueForum(String issueForum) {
        this.issueForum = issueForum;
    }

    public String getCollectRe() {
        return collectRe;
    }

    public void setCollectRe(String collectRe) {
        this.collectRe = collectRe;
    }

    public String getCollectForum() {
        return collectForum;
    }

    public void setCollectForum(String collectForum) {
        this.collectForum = collectForum;
    }

    public String getReadRe() {
        return readRe;
    }

    public void setReadRe(String readRe) {
        this.readRe = readRe;
    }

    public String getReadForum() {
        return readForum;
    }

    public void setReadForum(String readForum) {
        this.readForum = readForum;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getHistroyDate() {
        return histroyDate;
    }

    public void setHistroyDate(String histroyDate) {
        this.histroyDate = histroyDate;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Override
    public String toString() {
        return "TUser{" +
        "uuid=" + uuid +
        ", Status=" + Status +
        ", Username=" + Username +
        ", password=" + password +
        ", avatrUrl=" + avatrUrl +
        ", issueRe=" + issueRe +
        ", issueForum=" + issueForum +
        ", collectRe=" + collectRe +
        ", collectForum=" + collectForum +
        ", readRe=" + readRe +
        ", readForum=" + readForum +
        ", inDate=" + inDate +
        ", histroyDate=" + histroyDate +
        ", Comment=" + Comment +
        "}";
    }
}
