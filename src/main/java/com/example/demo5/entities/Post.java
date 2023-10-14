package com.example.demo5.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.*;

public class Post {
    private Integer id;
    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    @NotBlank
    private String author;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    @NotBlank
    private String title;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    @NotBlank
    private String content;
    private String date;

    public Post(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.date = simpleDateFormat.format(new Date());
    }
    public Post(String author, String title, String content){
        this();
        this.author = author;
        this.title = title;
        this.content = content;

    }
    public Post(Integer id, String author, String title, String content){
        this(author, title, content);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
