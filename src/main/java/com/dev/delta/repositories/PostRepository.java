package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
   List<Post> findByCategory(Category category);
}
