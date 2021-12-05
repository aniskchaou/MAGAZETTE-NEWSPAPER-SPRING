package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Reporter;
import com.dev.delta.repositories.ReporterRepository;

@Service
public class ReporterService {
	/**
	 * reporterRepository
	 */
	@Autowired
	private ReporterRepository reporterRepository;
	

	/**
	 * getReporters
	 * @return
	 */
	public java.util.List<Reporter> getReporters()
	{
		return reporterRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return reporterRepository.count();
	}

	/**
	 * save
	 * @param reporter
	 */
	public void save(Reporter reporter)
	{
		reporterRepository.save(reporter);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Reporter> findById(Long id) {
		return reporterRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		reporterRepository.delete(reporterRepository.findById(id).get());
	}
}
