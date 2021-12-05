package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Post;
import com.dev.delta.services.CategoryService;
import com.dev.delta.services.PostService;

@Controller
public class WebsiteController {

	@Autowired
	PostService  postService;
	
	@Autowired
	CategoryService  categoryService;
	
	/**
	 * addCategory
	 * @param category
	 * @param model
	 * @return
	 */
	@GetMapping("/category")
	public String category(Model model) {
		return "website/category";
	}
	
	/**
	 * addCategory
	 * @param category
	 * @param model
	 * @return
	 */
	@GetMapping("/contact")
	public String contact(Model model) {
		return "website/contact";
	}
	
	
	/**
	 * addCategory
	 * @param category
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String homepage(Model model) {
		List<Post> posts=postService.getPosts();
		List<Category> categories=categoryService.getCategorys();
		model.addAttribute("categories", categories);
		model.addAttribute("posts", posts);
		return "website/index";
	}
	
	@GetMapping("/menu")
	public String menu(Model model) {
		return "menu";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		return "dashboard/index";
	}
	
	
	/**
	 * addCategory
	 * @param category
	 * @param model
	 * @return
	 */
	@RequestMapping("/viewcategory/{id}")
	public String findByCategory(@PathVariable("id") Long id, Model model) {
		Category category=categoryService.findById(id).get();
		List<Post> posts=postService.getByCategory(category);
		model.addAttribute("posts", posts);
		return "website/category";
	}
	
	
	/**
	 * addCategory
	 * @param category
	 * @param model
	 * @return
	 */
	@RequestMapping("/show/{id}")
	public String showPost(@PathVariable("id") Long id, Model model) {
	 Post	post=postService.findById(id).get();
	
		model.addAttribute("post", post);
		return "post/view_client";
	}

	
}
