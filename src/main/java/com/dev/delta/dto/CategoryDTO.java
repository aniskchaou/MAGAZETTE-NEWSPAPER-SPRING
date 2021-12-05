package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.repositories.CategoryRepository;

@Service
public class CategoryDTO implements DTO {

	@Autowired
	CategoryRepository  categoryRepository ;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		category.setCategoryName(faker.lorem().characters(6));
		categoryRepository.save(category);
		for (int i = 0; i < 3; i++) {
			Category cat=new Category();
			 cat.setCategoryName(faker.lorem().characters(6));
		        categoryRepository.save(cat);
		}
       
	}

}
