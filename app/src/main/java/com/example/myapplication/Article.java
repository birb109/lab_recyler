package com.example.myapplication;

public class Article {
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgCover() {
        return imgCover;
    }

    public int getView() {
        return view;
    }

    private String title;
    private String content;
    private String imgCover;
    private int view;

    public Article(String title, String content, String imgCover, int view) {
        this.title = title;
        this.content = content;
        this.imgCover = imgCover;
        this.view = view;
    }
    public void increaseView(){
        view++;
    }
}
