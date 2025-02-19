package com.f1v3.demo.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Implementation of Post Repository.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
@Repository
@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepository {

    private final PostEntityRepository postEntityRepository;

    @Override
    public void save(Post post) {
        this.postEntityRepository.save(PostEntity.from(post));
    }

    @Override
    public List<Post> getAll() {
        return postEntityRepository.findAll().stream()
                .map(PostEntity::toModel)
                .toList();
    }
}
