package com.f1v3.demo.post;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Post Entity JPA Repository.
 *
 * @author 정승조
 * @version 2025. 01. 18.
 */
public interface PostEntityRepository extends JpaRepository<PostEntity, Long> {
}
