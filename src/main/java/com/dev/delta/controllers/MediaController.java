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

import com.dev.delta.entities.Media;
import com.dev.delta.services.MediaService;

@Controller
public class MediaController {
	/**
	 * mediaService
	 */
	@Autowired
	private MediaService mediaService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/medias")
	public String getCountries(Model model) {
		List<Media> medias = mediaService.getMedias();
		model.addAttribute("medias", medias);
		return "media/index";
	}
	
	@PostMapping("/addmedia")
	public String addMedia(Media media, Model model) {
		return "media/add";
	}

	/**
	 * addMedia
	 * @param media
	 * @param model
	 * @return
	 */
	@PostMapping("/createmedia")
	public String createMedia(Media media, Model model) {
		mediaService.save(media);
		return "redirect:/medias";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/media/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Media media = mediaService.findById(id).get();
		model.addAttribute("media", media);

		return "media/view";
	}

	/**
	 * updateMedia
	 * @param id
	 * @param media
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatemedia/{id}")
	public String updateMedia(@PathVariable("id") long id, @Validated Media media, 
			BindingResult result,
			Model model) {

		mediaService.save(media);
		return "redirect:/medias";
	}

	/**
	 * deleteMedia
	 * @param id
	 * @return
	 */
	@GetMapping("/deletemedia/{id}")
	@Transactional
	public String deleteMedia(@PathVariable("id") Long id) {
		mediaService.delete(id);
		return "redirect:/medias";
	}
}
