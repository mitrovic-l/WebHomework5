package com.example.demo5.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Comment {
    private Integer id;
    private Integer postId;
    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String name;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String text;

    public Comment(){

    }
    public Comment(String name, String text){
        this.name = name;
        this.text = text;
    }
    public Comment(Integer id, Integer postId, String name, String text){
        this(name, text);
        this.id = id;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
