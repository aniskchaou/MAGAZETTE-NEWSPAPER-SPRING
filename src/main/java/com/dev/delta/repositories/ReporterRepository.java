package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Reporter;

public interface ReporterRepository extends JpaRepository<Reporter, Long> {

}
