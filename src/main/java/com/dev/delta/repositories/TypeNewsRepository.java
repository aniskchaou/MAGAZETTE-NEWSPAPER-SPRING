package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.TypePost;

public interface TypeNewsRepository extends JpaRepository<TypePost, Long> {

}
