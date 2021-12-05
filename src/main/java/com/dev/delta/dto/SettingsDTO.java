package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.SettingsRepository;

@Service
public class SettingsDTO implements DTO{

	@Autowired
	SettingsRepository  settingsRepository;
	
	@Override
	public void populate() {
		settings.setEmail("");
		settings.setImage("");
		settings.setLanguage("");
		settings.setName("");
		settingsRepository.save(settings);
		
	}

}
