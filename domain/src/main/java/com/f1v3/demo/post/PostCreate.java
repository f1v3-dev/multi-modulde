package com.f1v3.demo.post;

import lombok.Getter;

/**
 * Post Create DTO.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Getter
public class PostCreate {

    private String title;
    private String content;

    public PostCreate(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
