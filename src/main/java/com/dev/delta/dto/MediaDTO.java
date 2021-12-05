package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MediaRepository;

@Service
public class MediaDTO implements DTO {

	@Autowired
	MediaRepository  mediaRepository;
	
	@Override
	public void populate() {
		media.setDescription("");
		media.setTitle("");
		mediaRepository.save(media);
		

	}

}
