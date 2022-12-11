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
		category.setCategoryName(faker.book().genre());
		category.setImage("cat1.jpg");
		categoryRepository.save(category);
		
		category2.setCategoryName(faker.book().genre());
		category2.setImage("cat2.jpg");
		categoryRepository.save(category2);
		
		category3.setCategoryName(faker.book().genre());
		category3.setImage("cat3.jpg");
		categoryRepository.save(category3);
		
		category4.setCategoryName(faker.book().genre());
		category4.setImage("cat4.jpg");
		categoryRepository.save(category4);
		
		category5.setCategoryName(faker.book().genre());
		category5.setImage("cat5.jpg");
		categoryRepository.save(category5);
		
       
	}

}
