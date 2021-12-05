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

import com.dev.delta.entities.SocialMedia;
import com.dev.delta.services.SocialMediaService;

@Controller
public class SocialMediaController {
	/**
	 * socialMediaService
	 */
	@Autowired
	private SocialMediaService socialMediaService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/socialmedias")
	public String getCountries(Model model) {
		List<SocialMedia> socialmedias = socialMediaService.getSocialMedias();
		model.addAttribute("socialmedias", socialmedias);
		return "socialmedia/index";
	}

	
	@GetMapping("/addsocialmedia")
	public String createSocialMedia(SocialMedia socialMedia, Model model) {
		return "socialmedia/add";
	}
	
	
	/**
	 * addSocialMedia
	 * @param socialMedia
	 * @param model
	 * @return
	 */
	@PostMapping("/createsocialmedia")
	public String addSocialMedia(SocialMedia socialMedia, Model model) {
		socialMediaService.save(socialMedia);
		return "redirect:/socialmedias";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/socialmedia/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		SocialMedia socialMedia = socialMediaService.findById(id).get();
		model.addAttribute("socialMedia", socialMedia);

		return "socialmedia/view";
	}

	/**
	 * updateSocialMedia
	 * @param id
	 * @param socialMedia
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatesocialmedia/{id}")
	public String updateSocialMedia(@PathVariable("id") long id, @Validated SocialMedia socialMedia, 
			BindingResult result,
			Model model) {

		socialMediaService.save(socialMedia);
		return "redirect:/socialmedias";
	}

	/**
	 * deleteSocialMedia
	 * @param id
	 * @return
	 */
	@GetMapping("/deletesocialmedia/{id}")
	@Transactional
	public String deleteSocialMedia(@PathVariable("id") Long id) {
		socialMediaService.delete(id);
		return "redirect:/socialmedias";
	}
}
