package com.example.demo5.resources;

import com.example.demo5.entities.Comment;
import com.example.demo5.services.CommentService;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/comments")
public class CommentResource {
    @Inject
    private CommentService commentService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{postId}")
    public Response all(@PathParam("postId") Integer postId){ return Response.ok(this.commentService.allCommentsForPost(postId)).build(); }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{postId}")
    public Comment create(@PathParam("postId") Integer postId, @Valid Comment comment){ return this.commentService.addComment(comment, postId); }

}
