package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	Page<Comment> findByPostId(Long postId, Pageable pageable);
    Optional<Comment> findByIdAndPostId(Long id, Long postId);
}
