package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;


import com.dev.delta.entities.Post;
import com.dev.delta.services.PostService;
import com.dev.delta.util.DateBlogUtil;
import com.dev.delta.util.FileUploadUtil;

@Controller
public class PostController {
	/**
	 * postService
	 */
	@Autowired
	private PostService postService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/posts")
	public String getCountries(Model model) {
		List<Post> posts = postService.getPosts();
		model.addAttribute("posts", posts);
		return "post/index";
	}
	
	@GetMapping("/addpost")
	public String addPost(Post post, Model model) {
		return "post/add";
	}

	/**
	 * addPost
	 * @param post
	 * @param model
	 * @return
	 */
	@PostMapping("/createpost")	
	public RedirectView createPost(Post post, @RequestParam("image") MultipartFile multipartFile)
			throws IOException, ParseException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		 System.out.println(fileName);
		post.setImages(fileName);
		/*Date date = DateBlogUtil.toDate(blog.getDate(), "yyyy-mm-dd");
		blog.setDay(DateBlogUtil.toDayName(date.getDay()));
		blog.setMonth(DateBlogUtil.toMonthName(date.getMonth()));*/
		// blog.setMonth(fileName);
		postService.save(post);
		// String uploadDir = "src/main/resources/static/photos/" + savedBlog.getId();
		String uploadDir = "src/main/resources/static/photos/";
		System.out.println(uploadDir);

		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return new RedirectView("/posts", true);
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/post/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Post post = postService.findById(id).get();
		model.addAttribute("post", post);

		return "post/view";
	}

	/**
	 * updatePost
	 * @param id
	 * @param post
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepost/{id}")
	public String updatePost(@PathVariable("id") long id, @Validated Post post, 
			BindingResult result,
			Model model) {

		postService.save(post);
		return "redirect:/posts";
	}

	/**
	 * deletePost
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepost/{id}")
	@Transactional
	public String deletePost(@PathVariable("id") Long id) {
		postService.delete(id);
		return "redirect:/posts";
	}
}
