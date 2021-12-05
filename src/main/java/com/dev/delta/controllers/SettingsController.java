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

import com.dev.delta.entities.Settings;
import com.dev.delta.services.SettingsService;

@Controller
public class SettingsController {
	/**
	 * settingsService
	 */
	@Autowired
	private SettingsService settingsService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/settings")
	public String getCountries(Model model) {
		List<Settings> settingss = settingsService.getSettingss();
		model.addAttribute("settingss", settingss);
		return "settings/index";
	}
	
	@PostMapping("/addsettings")
	public String addSettings(Settings settings, Model model) {
		return "settings/add";
	}

	/**
	 * addSettings
	 * @param settings
	 * @param model
	 * @return
	 */
	@PostMapping("/createsettings")
	public String createSettings(Settings settings, Model model) {
		settingsService.save(settings);
		return "redirect:/settingss";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/settings/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Settings settings = settingsService.findById(id).get();
		model.addAttribute("settings", settings);

		return "settings/view";
	}

	/**
	 * updateSettings
	 * @param id
	 * @param settings
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatesettings/{id}")
	public String updateSettings(@PathVariable("id") long id, @Validated Settings settings, 
			BindingResult result,
			Model model) {

		settingsService.save(settings);
		return "redirect:/settingss";
	}

	/**
	 * deleteSettings
	 * @param id
	 * @return
	 */
	@GetMapping("/deletesettings/{id}")
	@Transactional
	public String deleteSettings(@PathVariable("id") Long id) {
		settingsService.delete(id);
		return "redirect:/settingss";
	}
}
