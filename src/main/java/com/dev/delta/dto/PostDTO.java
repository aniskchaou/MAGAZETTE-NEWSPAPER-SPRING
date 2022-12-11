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
		
		for (int i = 0; i < 5; i++) {
			Post post2=new Post();
		post2.setCategory(category2);
		post2.setContent(faker.lorem().paragraph(4));
		post2.setDescription(faker.lorem().characters());
		post2.setImages("post"+i+".jpg");
		post2.setSlug(faker.lorem().characters());
		post2.setTitle(faker.lorem().paragraph(1));
		post2.setType(typeNews2);
		postRepository.save(post2);
		}
		for (int i = 0; i < 5; i++) {
			Post post3=new Post();
		post3.setCategory(category3);
		post3.setContent(faker.lorem().paragraph(4));
		post3.setDescription(faker.lorem().characters());
		post3.setImages("post"+i+".jpg");
		post3.setSlug(faker.lorem().characters());
		post3.setTitle(faker.lorem().paragraph(1));
		post3.setType(typeNews3);
		postRepository.save(post3);
		}
		for (int i = 0; i < 5; i++) {
			Post post4=new Post();
		post4.setCategory(category4);
		post4.setContent(faker.lorem().paragraph(4));
		post4.setDescription(faker.lorem().characters());
		post4.setImages("post"+i+".jpg");
		post4.setSlug(faker.lorem().characters());
		post4.setTitle(faker.lorem().paragraph(1));
		post4.setType(typeNews4);
		postRepository.save(post4);
		}
		for (int i = 0; i < 5; i++) {
			Post post5=new Post();
		post5.setCategory(category5);
		post5.setContent(faker.lorem().paragraph(4));
		post5.setDescription(faker.lorem().characters());
		post5.setImages("post"+i+".jpg");
		post5.setSlug(faker.lorem().characters());
		post5.setTitle(faker.lorem().paragraph(1));
		post5.setType(typeNews5);
		postRepository.save(post5);
		}
		
		
		
		
		for (int i = 0; i < 5; i++) {
			Post post=new Post();
			post.setCategory(category);
			post.setContent(faker.lorem().paragraph(4));
			post.setDescription(faker.lorem().characters());
			post.setImages("post"+i+".jpg");
			post.setSlug(faker.lorem().characters());
			post.setTitle(faker.lorem().paragraph(1));
			post.setType(typeNews);
			postRepository.save(post);
		}
		

	}

}
