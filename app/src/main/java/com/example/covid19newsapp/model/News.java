package com.example.covid19newsapp.model;

import androidx.room.PrimaryKey;

import java.io.Serializable;

public class News implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String imagem;
    private String title;
    private String desc;

    public News(String imagem, String title, String desc) {
        this.imagem = imagem;
        this.title = title;
        this.desc = desc;
    }

    public News() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
