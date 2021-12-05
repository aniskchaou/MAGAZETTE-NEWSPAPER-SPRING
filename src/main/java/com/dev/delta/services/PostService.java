package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Post;
import com.dev.delta.repositories.PostRepository;

@Service
public class PostService {
	/**
	 * postRepository
	 */
	@Autowired
	private PostRepository postRepository;
	

	/**
	 * getPosts
	 * @return
	 */
	public java.util.List<Post> getPosts()
	{
		return postRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return postRepository.count();
	}

	/**
	 * save
	 * @param post
	 */
	public void save(Post post)
	{
		postRepository.save(post);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Post> findById(Long id) {
		return postRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		postRepository.delete(postRepository.findById(id).get());
	}
	
	public List<Post> getByCategory(Category category)
	{
		return postRepository.findByCategory(category);
	}
}
