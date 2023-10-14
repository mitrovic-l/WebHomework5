package com.example.demo5.repositories.implementation;

import com.example.demo5.entities.Comment;
import com.example.demo5.repositories.CommentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryCommentRepository implements CommentRepository {
    private static List<Comment> comments = new CopyOnWriteArrayList<>();
    public InMemoryCommentRepository() {
        initComments();
        System.out.println(this);
    }

    @Override
    public List<Comment> allCommentsForPost(Integer postId) {
        ArrayList<Comment> commentsForPost = new ArrayList<>();
        for (Comment c : comments){
            if (c.getPostId() == postId)
                commentsForPost.add(c);
        }
        return commentsForPost;
    }

    @Override
    public synchronized Comment addComent(Comment comment, Integer postId) {
        Integer id = comments.size();
        comment.setId(id);
        comment.setPostId(postId);
        comments.add(Math.toIntExact(id), comment);

        return comment;
    }
    public static void initComments(){
        Comment comment1 = new Comment(0, 0, "Luka M", "Great text!");
        Comment comment2 = new Comment(1,0, "Janko M", "10/10!");
        Comment comment3 = new Comment(2, 1, "Camilla Pham", "Interesting article!");
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
    }
}
