package com.example.demo5.resources;

import com.example.demo5.entities.Post;
import com.example.demo5.services.PostService;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class PostResource {
    @Inject
    private PostService postService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all(){ return Response.ok(this.postService.allPosts()).build(); }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Post create(@Valid Post post){ return this.postService.addPost(post); }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post find(@PathParam("id") Integer id){ return this.postService.findPost(id); }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id){ this.postService.deletePost(id); }


}
