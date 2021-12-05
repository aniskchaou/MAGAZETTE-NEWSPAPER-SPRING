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
		
	}

}
