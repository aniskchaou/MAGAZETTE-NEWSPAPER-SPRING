package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
