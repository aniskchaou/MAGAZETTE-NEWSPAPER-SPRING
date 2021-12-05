package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ReporterRepository;

@Service
public class ReporterDTO implements DTO {

	@Autowired
	ReporterRepository   reporterRepository;
	
	@Override
	public void populate() {
		reporter.setDesignation("");
		reporter.setName("");
		reporterRepository.save(reporter);

	}

}
