package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TypeNewsRepository;

@Service
public class TypeNewsDTO implements DTO{

	@Autowired
	TypeNewsRepository   typeNewsRepository;
	
	@Override
	public void populate() {
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
		
	}

}
