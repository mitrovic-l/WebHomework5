package com.example.demo5.services;

import com.example.demo5.entities.Post;
import com.example.demo5.repositories.PostRepository;
import javax.inject.Inject;

import java.util.List;

public class PostService {
    public PostService() {
        System.out.println(this);
    }
    @Inject
    private PostRepository postRepository;
    public List<Post> allPosts(){ return this.postRepository.allPosts();}
    public Post addPost(Post post){ return this.postRepository.addPost(post);}
    public Post findPost(Integer id){ return this.postRepository.findPost(id);}
    public void deletePost(Integer id){ this.postRepository.deletePost(id);}
}
