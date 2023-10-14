package com.example.demo5.repositories;

import com.example.demo5.entities.Comment;

import java.util.List;

public interface CommentRepository {
    public List<Comment> allCommentsForPost(Integer postId);
    public Comment addComent(Comment comment, Integer postId);
}
