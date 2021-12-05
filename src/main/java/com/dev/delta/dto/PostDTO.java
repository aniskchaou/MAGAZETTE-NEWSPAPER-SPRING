package com.dev.delta.dto;

import java.util.Iterator;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Post;
import com.dev.delta.repositories.PostRepository;

@Service
public class PostDTO implements DTO {

	@Autowired
	PostRepository   postRepository;
	
	
	@Override
	public void populate() {
		post.setCategory(category);
		post.setContent(faker.lorem().paragraph(4));
		post.setDescription(faker.lorem().characters());
		post.setImages("");
		post.setSlug(faker.lorem().characters());
		post.setTitle(faker.lorem().paragraph(2));
		postRepository.save(post);
		for (int i = 0; i < 10; i++) {
			Post p=new Post();
			p.setCategory(category);
			p.setContent(faker.lorem().paragraph(3));
			p.setDescription(faker.lorem().characters());
			p.setImages("");
			p.setSlug(faker.lorem().characters());
			p.setTitle(faker.lorem().paragraph(2));
			postRepository.save(p);
		}
		

	}

}
