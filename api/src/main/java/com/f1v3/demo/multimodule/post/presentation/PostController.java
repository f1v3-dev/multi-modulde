package com.f1v3.demo.multimodule.post.presentation;

import com.f1v3.demo.multimodule.post.application.PostService;
import com.f1v3.demo.multimodule.post.presentation.response.PostsResponse;
import com.f1v3.demo.post.PostCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Post Controller.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody PostCreate postCreate) {
        postService.save(postCreate);
        return ResponseEntity
                .ok()
                .build();
    }

    @GetMapping
    public ResponseEntity<PostsResponse> getAll() {
        return ResponseEntity
                .ok()
                .body(PostsResponse.from(postService.getAll()));
    }
}
