package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Menu;
import com.dev.delta.services.MenuService;

@Controller
public class MenuController {
	/**
	 * menuService
	 */
	@Autowired
	private MenuService menuService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/menus")
	public String getCountries(Model model) {
		List<Menu> countrries = menuService.getMenus();
		model.addAttribute("countries", countrries);
		return "menu";
	}

	/**
	 * addMenu
	 * @param menu
	 * @param model
	 * @return
	 */
	@PostMapping("/addmenu")
	public String addMenu(Menu menu, Model model) {
		menuService.save(menu);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/menu/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Menu menu = menuService.findById(id).get();
		model.addAttribute("menu", menu);

		return "editMenu";
	}

	/**
	 * updateMenu
	 * @param id
	 * @param menu
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatemenu/{id}")
	public String updateMenu(@PathVariable("id") long id, @Validated Menu menu, 
			BindingResult result,
			Model model) {

		menuService.save(menu);
		return "redirect:/countries";
	}

	/**
	 * deleteMenu
	 * @param id
	 * @return
	 */
	@GetMapping("/deletemenu/{id}")
	@Transactional
	public String deleteMenu(@PathVariable("id") Long id) {
		menuService.delete(id);
		return "redirect:/countries";
	}
}
