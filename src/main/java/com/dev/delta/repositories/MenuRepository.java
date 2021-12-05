package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
