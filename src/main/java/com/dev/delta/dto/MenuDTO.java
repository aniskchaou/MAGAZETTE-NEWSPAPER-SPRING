package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MenuRepository;

@Service
public class MenuDTO implements DTO {

	@Autowired
	MenuRepository    menuRepository;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
       menu.setMenuItem("");
       menu.setStatus("");
       menuRepository.save(menu);
	}

}
