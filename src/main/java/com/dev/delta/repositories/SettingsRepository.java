package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Settings;

public interface SettingsRepository extends JpaRepository<Settings, Long> {

}
