package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.dto.CategoryDTO;
import com.dev.delta.dto.MediaDTO;
import com.dev.delta.dto.MessageDTO;
import com.dev.delta.dto.PostDTO;
import com.dev.delta.dto.ReporterDTO;
import com.dev.delta.dto.SettingsDTO;
import com.dev.delta.dto.SocialMediaDTO;
import com.dev.delta.dto.TypeNewsDTO;
import com.dev.delta.dto.UserDTO;
import com.dev.delta.entities.TypeNews;

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
		postDTO.populate();
		reporterDTO.populate();
		settingsDTO.populate();
		socialMediaDTO.populate();
		typeNewsDTO.populate();
		
	}

}
