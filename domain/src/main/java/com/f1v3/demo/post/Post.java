package com.f1v3.demo.post;

import lombok.Getter;

/**
 * Post Domain.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Getter
public class Post {

    private Long id;
    private String title;
    private String content;

    public Post(Long id, String title, String content) {
        validateTitle(title);

        this.id = id;
        this.title = title;
        this.content = content;
    }

    /**
     * Check preconditions for title.
     */
    private void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must not be null or empty!");
        }
    }

    public static Post from(PostCreate postCreate) {
        return new Post(null, postCreate.getTitle(), postCreate.getContent());
    }
}
