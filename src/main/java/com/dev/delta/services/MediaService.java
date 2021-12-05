package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Media;
import com.dev.delta.repositories.MediaRepository;

@Service
public class MediaService {
	/**
	 * mediaRepository
	 */
	@Autowired
	private MediaRepository mediaRepository;
	

	/**
	 * getMedias
	 * @return
	 */
	public java.util.List<Media> getMedias()
	{
		return mediaRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return mediaRepository.count();
	}

	/**
	 * save
	 * @param media
	 */
	public void save(Media media)
	{
		mediaRepository.save(media);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Media> findById(Long id) {
		return mediaRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		mediaRepository.delete(mediaRepository.findById(id).get());
	}
}
