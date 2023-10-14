package com.example.demo5.repositories;

import com.example.demo5.entities.Post;

import java.util.List;

public interface PostRepository {
    public List<Post> allPosts();
    public Post addPost(Post post);
    public Post findPost(Integer id);
    public void deletePost(Integer id);
}
