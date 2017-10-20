package com.michealstorm.ddjshijie.bean;

/**
 * Author       : Michealstorm@aliyun.com
 * Project Name ：DdjShijie
 * Created Time : 2017/10/19 21:32
 * Description  : //
 */

public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {

        return title;
    }

    public String getContent() {
        return content;
    }
}
