package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Post;
import com.dev.delta.entities.TypePost;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findByCategory(Category category);

	List<Post> findByType(TypePost type);

	@Query(nativeQuery = true, value = "SELECT * FROM post LIMIT 4")
	List<Post> findLatestPost();
}
