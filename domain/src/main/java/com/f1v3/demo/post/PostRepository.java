package com.f1v3.demo.post;

import java.util.List;

/**
 * Post Repository. (UseCase)
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
public interface PostRepository {

    void save(Post post);

    List<Post> getAll();
}
