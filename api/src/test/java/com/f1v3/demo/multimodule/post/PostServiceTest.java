package com.f1v3.demo.multimodule.post;

import com.f1v3.demo.multimodule.mock.MockPostRepository;
import com.f1v3.demo.multimodule.post.application.PostService;
import com.f1v3.demo.post.Post;
import com.f1v3.demo.post.PostCreate;
import com.f1v3.demo.post.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Post Service Test.
 *
 * @author 정승조
 * @version 2025. 01. 19.
 */
class PostServiceTest {

    private PostService postService;
    private PostRepository postRepository;

    @BeforeEach
    void setUp() {
        postRepository = new MockPostRepository();
        postService = new PostService(postRepository);
    }

    @Test
    void postCreate로_post를_저장한다() {

        // given
        PostCreate postCreate = new PostCreate("hello title", "this is content");

        // when
        postService.save(postCreate);

        // then
        Post actual = postRepository.getAll().get(0);
        assertEquals(1L, actual.getId());
        assertEquals("hello title", actual.getTitle());
        assertEquals("this is content", actual.getContent());
    }

    @Test
    void 저장된_Post_목록을_반환한다() {

        // given
        IntStream.range(1, 11)
                .forEach(i -> postService.save(new PostCreate("title" + i, "content" + i)));

        // when
        List<Post> actual = postService.getAll();

        // then
        assertEquals(10, actual.size());
    }
}
