package com.f1v3.demo.multimodule.post.application;

import com.f1v3.demo.post.Post;
import com.f1v3.demo.post.PostCreate;
import com.f1v3.demo.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Post Service.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Service
@RequiredArgsConstructor
public class PostService {

    // fixme: PostRepository Bean 주입이 안되네..
    private final PostRepository postRepository;

    public void save(PostCreate postCreate) {
        Post post = Post.from(postCreate);
        postRepository.save(post);
    }

    public List<Post> getAll() {
        return postRepository.getAll();
    }
}
