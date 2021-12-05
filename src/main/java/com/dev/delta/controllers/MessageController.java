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

import com.dev.delta.entities.Message;
import com.dev.delta.services.MessageService;
@Controller
public class MessageController {
	/**
	 * messageService
	 */
	@Autowired
	private MessageService messageService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/messages")
	public String getCountries(Model model) {
		List<Message> messages = messageService.getMessages();
		model.addAttribute("messages", messages);
		return "message/index";
	}
	
	@PostMapping("/addmessage")
	public String addMessage(Message message, Model model) {
		return "message/add";
	}

	/**
	 * addMessage
	 * @param message
	 * @param model
	 * @return
	 */
	@PostMapping("/createmessage")
	public String createMessage(Message message, Model model) {
		messageService.save(message);
		return "redirect:/messages";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/message/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Message message = messageService.findById(id).get();
		model.addAttribute("message", message);

		return "message/view";
	}

	/**
	 * updateMessage
	 * @param id
	 * @param message
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatemessage/{id}")
	public String updateMessage(@PathVariable("id") long id, @Validated Message message, 
			BindingResult result,
			Model model) {

		messageService.save(message);
		return "redirect:/messages";
	}

	/**
	 * deleteMessage
	 * @param id
	 * @return
	 */
	@GetMapping("/deletemessage/{id}")
	@Transactional
	public String deleteMessage(@PathVariable("id") Long id) {
		messageService.delete(id);
		return "redirect:/messages";
	}
}
