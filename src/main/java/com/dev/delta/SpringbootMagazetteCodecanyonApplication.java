package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.dev.delta.dto.CategoryDTO;
import com.dev.delta.dto.MediaDTO;
import com.dev.delta.dto.MessageDTO;
import com.dev.delta.dto.PostDTO;
import com.dev.delta.dto.ReporterDTO;
import com.dev.delta.dto.SettingsDTO;
import com.dev.delta.dto.SocialMediaDTO;
import com.dev.delta.dto.TypeNewsDTO;
import com.dev.delta.dto.UserDTO;
import com.dev.delta.entities.TypePost;
@ComponentScan({  "com.dev.delta.security",
	"com.dev.delta.controllers", "com.dev.delta.services","com.dev.delta.dto",
		"com.dev.delta.entities",
		"com.dev.delta.repositories"}) // to
																													// scan

@SpringBootApplication
public class SpringbootMagazetteCodecanyonApplication implements CommandLineRunner {

	@Autowired
	UserDTO  userDTO;
	
	@Autowired
	CategoryDTO  categoryDTO;
	
	@Autowired
	MediaDTO  mediaDTO;
	
	@Autowired
	MessageDTO  messageDTO;
	
	@Autowired
	PostDTO  postDTO;
	
	@Autowired
	ReporterDTO  reporterDTO;
	
	@Autowired
	SettingsDTO  settingsDTO;
	@Autowired
	SocialMediaDTO  socialMediaDTO;
	
	@Autowired
	TypeNewsDTO  typeNewsDTO  ;
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMagazetteCodecanyonApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		userDTO.populate();
		categoryDTO.populate();
		mediaDTO.populate();
		messageDTO.populate();
		typeNewsDTO.populate();
		postDTO.populate();
		reporterDTO.populate();
		settingsDTO.populate();
		socialMediaDTO.populate();
		userDTO.populate();
		
		
	}

}
