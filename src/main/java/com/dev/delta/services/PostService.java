package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Post;
import com.dev.delta.entities.TypePost;
import com.dev.delta.repositories.CategoryRepository;
import com.dev.delta.repositories.PostRepository;
import com.dev.delta.repositories.TypeNewsRepository;

@Service
public class PostService {
	/**
	 * postRepository
	 */
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	CategoryRepository  categoryRepository;
	
	@Autowired
	TypeNewsRepository typeNewsRepository;
	
	
	
    /*
	  typeNews.setName("Normal");
	  typeNewsRepository.save(typeNews);
	  
	  typeNews2.setName("popular");
	  typeNewsRepository.save(typeNews2);
	  
	  typeNews3.setName("breaking News");
	  typeNewsRepository.save(typeNews3);
	  
	  typeNews4.setName("tranding");
	  typeNewsRepository.save(typeNews4);
	  
	  typeNews5.setName("slide");
	  typeNewsRepository.save(typeNews5);
	 */
	  public java.util.List<Post> getNormalPosts()
		{
			return postRepository.findByType(typeNewsRepository.findById(1L).get());
		}
	  public java.util.List<Post> getPopularPosts()
		{
		  return postRepository.findByType(typeNewsRepository.findById(2L).get());
		}
	  public java.util.List<Post> getBreakingPosts()
		{
		  return postRepository.findByType(typeNewsRepository.findById(3L).get());
		}
	  public java.util.List<Post> gettrandingPosts()
		{
		  return postRepository.findByType(typeNewsRepository.findById(4L).get());
		}
	  public java.util.List<Post> getSlidePosts()
		{
		  return postRepository.findByType(typeNewsRepository.findById(5L).get());
		}
	/**
	 * getPosts
	 * @return
	 */
	public java.util.List<Post> getPosts()
	{
		return postRepository.findAll();
	}
	
	public java.util.List<Post> getLatestPosts()
	{
		return postRepository.findLatestPost();
	}
	
	public java.util.List<Post> getPostbyType(String type)
	{
		return postRepository.findByType(null);
	}
	
	
	public java.util.List<Post> getPostbyCategory(String category)
	{
		return postRepository.findByType(null);
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
