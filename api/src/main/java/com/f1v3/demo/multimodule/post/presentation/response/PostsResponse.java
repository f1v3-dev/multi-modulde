package com.f1v3.demo.multimodule.post.presentation.response;

import com.f1v3.demo.post.Post;
import lombok.Getter;

import java.util.List;

/**
 * Posts Response.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Getter
public class PostsResponse {

    private List<PostResponse> posts;

    public PostsResponse(List<PostResponse> posts) {
        this.posts = posts;
    }

    public static PostsResponse from(List<Post> posts) {
        List<PostResponse> postResponses = posts.stream()
                .map(PostResponse::from)
                .toList();

        return new PostsResponse(postResponses);
    }
}
