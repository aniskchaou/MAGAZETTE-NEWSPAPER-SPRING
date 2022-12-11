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
import com.dev.delta.entities.TypePost;
import com.dev.delta.entities.User;
import com.github.javafaker.Faker;

public interface DTO {
	
	public Category category=new Category();
	public Category category2=new Category();
	public Category category3=new Category();
	public Category category4=new Category();
	public Category category5=new Category();
	public Media media=new Media();
	public Menu menu=new Menu();
	public Message message=new Message();
	public Post post=new Post();
	public Post post2=new Post();
	public Post post3=new Post();
	public Post post4=new Post();
	public Post post5=new Post();
	public Reporter reporter=new Reporter();
	public Settings settings=new Settings();
	public SocialMedia socialMedia=new SocialMedia();
	public User user=new User();
	public Role role=new Role();
	public TypePost typeNews=new TypePost();
	Faker faker = new Faker();
	
	
	public TypePost typeNews2=new TypePost();
	public TypePost typeNews3=new TypePost();
	public TypePost typeNews4=new TypePost();
	public TypePost typeNews5=new TypePost();
	public TypePost typeNews6=new TypePost();
public void populate();
}
