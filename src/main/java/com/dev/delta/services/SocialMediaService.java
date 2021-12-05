package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.SocialMedia;
import com.dev.delta.repositories.SocialMediaRepository;

@Service
public class SocialMediaService {
	/**
	 * socialMediaRepository
	 */
	@Autowired
	private SocialMediaRepository socialMediaRepository;
	

	/**
	 * getSocialMedias
	 * @return
	 */
	public java.util.List<SocialMedia> getSocialMedias()
	{
		return socialMediaRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return socialMediaRepository.count();
	}

	/**
	 * save
	 * @param socialMedia
	 */
	public void save(SocialMedia socialMedia)
	{
		socialMediaRepository.save(socialMedia);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<SocialMedia> findById(Long id) {
		return socialMediaRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		socialMediaRepository.delete(socialMediaRepository.findById(id).get());
	}
}
