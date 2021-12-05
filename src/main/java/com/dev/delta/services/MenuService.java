package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Menu;
import com.dev.delta.repositories.MenuRepository;

@Service
public class MenuService {
	/**
	 * menuRepository
	 */
	@Autowired
	private MenuRepository menuRepository;
	

	/**
	 * getMenus
	 * @return
	 */
	public java.util.List<Menu> getMenus()
	{
		return menuRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return menuRepository.count();
	}

	/**
	 * save
	 * @param menu
	 */
	public void save(Menu menu)
	{
		menuRepository.save(menu);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Menu> findById(Long id) {
		return menuRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		menuRepository.delete(menuRepository.findById(id).get());
	}
}
