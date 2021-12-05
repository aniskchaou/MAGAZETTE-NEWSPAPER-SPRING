package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.SocialMediaRepository;

@Service
public class SocialMediaDTO implements DTO {

	@Autowired
	SocialMediaRepository   socialMediaRepository;
	
	@Override
	public void populate() {
		socialMedia.setDelicious("");
		socialMedia.setDigg("");
		socialMedia.setFacebook("");
		socialMedia.setFlickr("");
		socialMedia.setGooglePlus("");
		socialMedia.setInstagram("");
		socialMedia.setLinkedIn("");
		socialMedia.setPinterest("");
		socialMedia.setQuora("");
		socialMedia.setReddit("");
		socialMedia.setSnapchat("");
		socialMedia.setYouTube("");
		socialMedia.setWhatsApp("");
		socialMedia.setTwitter("");
		socialMedia.setTumblr("");
		socialMedia.setStumbleUpon("");
		socialMediaRepository.save(socialMedia);
		
	}

}
