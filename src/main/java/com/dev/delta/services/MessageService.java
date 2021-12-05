package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Message;
import com.dev.delta.repositories.MessageRepository;

@Service
public class MessageService {
	/**
	 * messageRepository
	 */
	@Autowired
	private MessageRepository messageRepository;
	

	/**
	 * getMessages
	 * @return
	 */
	public java.util.List<Message> getMessages()
	{
		return messageRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return messageRepository.count();
	}

	/**
	 * save
	 * @param message
	 */
	public void save(Message message)
	{
		messageRepository.save(message);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Message> findById(Long id) {
		return messageRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		messageRepository.delete(messageRepository.findById(id).get());
	}
}
