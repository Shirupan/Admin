package com.sl.bean;

/**
 * Created by Maibenben on 2016/12/9.
 */
public class Content {
    private int id;
    private String type;
    private String title;
    private String content;
    private int status;
//    private String statusStr;
//    private Long authorId;
//    private String authorName;
//    private Long addTime;
//    private String addTimeStr;
//    private Long lastModifyId;
//    private String lastModifyName;
//    private Long lastModifyTime;
//    private String lastModifyTimeStr;
    private String subTitle;
    private int priority;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
