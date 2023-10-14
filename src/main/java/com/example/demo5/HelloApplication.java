package com.example.demo5;

import com.example.demo5.repositories.CommentRepository;
import com.example.demo5.repositories.PostRepository;
import com.example.demo5.repositories.implementation.InMemoryCommentRepository;
import com.example.demo5.repositories.implementation.InMemoryPostRepository;
import com.example.demo5.services.CommentService;
import com.example.demo5.services.PostService;
import javax.ws.rs.ApplicationPath;
import javax.inject.Singleton;


import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

    public HelloApplication(){
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);
                this.bind(InMemoryCommentRepository.class).to(CommentRepository.class).in(Singleton.class);

                this.bindAsContract(PostService.class);
                this.bindAsContract(CommentService.class);

            }
        };
        register(binder);
        packages("com.example.demo5.resources");
    }

}