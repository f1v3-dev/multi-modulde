package com.f1v3.demo.post;

import com.f1v3.demo.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Post Entity.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Entity(name = "post")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    public PostEntity(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public static PostEntity from(Post post) {
        return new PostEntity(post.getId(), post.getTitle(), post.getContent());
    }

    public Post toModel() {
        return new Post(this.id, this.title, this.content);
    }
}
