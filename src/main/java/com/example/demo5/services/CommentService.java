package com.example.demo5.services;

import com.example.demo5.entities.Comment;
import com.example.demo5.repositories.CommentRepository;
import javax.inject.Inject;

import java.util.List;

public class CommentService {
    public CommentService() {
        System.out.println(this);
    }
    @Inject
    private CommentRepository commentRepository;

    /*
    public List<Comment> allCommentsForPost(Integer postId);
    public Comment addComent(Comment comment, Integer postId);
     */
    public List<Comment> allCommentsForPost(Integer postId){ return this.commentRepository.allCommentsForPost(postId);}
    public Comment addComment(Comment comment, Integer postId){ return this.commentRepository.addComent(comment, postId);}
}
