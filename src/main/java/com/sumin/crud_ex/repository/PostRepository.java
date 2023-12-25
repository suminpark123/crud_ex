package com.sumin.crud_ex.repository;

import com.sumin.crud_ex.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
