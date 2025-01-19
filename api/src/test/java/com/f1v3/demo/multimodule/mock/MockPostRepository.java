package com.f1v3.demo.multimodule.mock;

import com.f1v3.demo.post.Post;
import com.f1v3.demo.post.PostRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockPostRepository implements PostRepository {

    private Long id = 1L;
    private List<Post> posts = new ArrayList<>();

    @Override
    public void save(Post post) {
        Post newPost = new Post(id++, post.getTitle(), post.getContent());
        posts.add(newPost);
    }

    @Override
    public List<Post> getAll() {
        return Collections.unmodifiableList(posts);
    }
}
