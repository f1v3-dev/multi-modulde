package com.f1v3.demo.multimodule.post.presentation.response;

import com.f1v3.demo.post.Post;
import lombok.Getter;

/**
 * Post Response.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Getter
public class PostResponse {

    private Long id;
    private String title;
    private String content;

    public PostResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public static PostResponse from(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getContent());
    }
}
