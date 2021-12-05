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

import com.dev.delta.entities.Reporter;
import com.dev.delta.services.ReporterService;

@Controller
public class ReporterController {
	/**
	 * reporterService
	 */
	@Autowired
	private ReporterService reporterService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/reporters")
	public String getCountries(Model model) {
		List<Reporter> reporters = reporterService.getReporters();
		model.addAttribute("reporters", reporters);
		return "reporter/index";
	}
	
	@GetMapping("/addreporter")
	public String addReporter(Reporter reporter, Model model) {
		return "reporter/add";
	}

	/**
	 * addReporter
	 * @param reporter
	 * @param model
	 * @return
	 */
	@PostMapping("/createreporter")
	public String createReporter(Reporter reporter, Model model) {
		reporterService.save(reporter);
		return "redirect:/reporters";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/reporter/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Reporter reporter = reporterService.findById(id).get();
		model.addAttribute("reporter", reporter);

		return "reporter/view";
	}

	/**
	 * updateReporter
	 * @param id
	 * @param reporter
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatereporter/{id}")
	public String updateReporter(@PathVariable("id") long id, @Validated Reporter reporter, 
			BindingResult result,
			Model model) {

		reporterService.save(reporter);
		return "redirect:/reporters";
	}

	/**
	 * deleteReporter
	 * @param id
	 * @return
	 */
	@GetMapping("/deletereporter/{id}")
	@Transactional
	public String deleteReporter(@PathVariable("id") Long id) {
		reporterService.delete(id);
		return "redirect:/reporters";
	}
}
