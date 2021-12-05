package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Settings;
import com.dev.delta.repositories.SettingsRepository;

@Service
public class SettingsService {
	/**
	 * settingsRepository
	 */
	@Autowired
	private SettingsRepository settingsRepository;
	

	/**
	 * getSettingss
	 * @return
	 */
	public java.util.List<Settings> getSettingss()
	{
		return settingsRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return settingsRepository.count();
	}

	/**
	 * save
	 * @param settings
	 */
	public void save(Settings settings)
	{
		settingsRepository.save(settings);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Settings> findById(Long id) {
		return settingsRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		settingsRepository.delete(settingsRepository.findById(id).get());
	}
}
