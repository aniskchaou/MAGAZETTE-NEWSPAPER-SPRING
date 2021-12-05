package com.dev.delta.dto;

import com.dev.delta.entities.Category;
import com.dev.delta.entities.Media;
import com.dev.delta.entities.Menu;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Post;
import com.dev.delta.entities.Reporter;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Settings;
import com.dev.delta.entities.SocialMedia;
import com.dev.delta.entities.TypeNews;
import com.dev.delta.entities.User;
import com.github.javafaker.Faker;

public interface DTO {
	
	public Category category=new Category();
	public Media media=new Media();
	public Menu menu=new Menu();
	public Message message=new Message();
	public Post post=new Post();
	public Reporter reporter=new Reporter();
	public Settings settings=new Settings();
	public SocialMedia socialMedia=new SocialMedia();
	public User user=new User();
	public Role role=new Role();
	public TypeNews typeNews=new TypeNews();
	Faker faker = new Faker();
	
public void populate();
}
